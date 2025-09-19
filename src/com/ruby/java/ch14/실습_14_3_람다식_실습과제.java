package com.ruby.java.ch14;

/*
 * C5 - 도서관리시스템 - 람다식 적용 실습
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Overflow 예외 클래스
@SuppressWarnings("serial")
class OverflowException extends RuntimeException { // 교재 553

	public OverflowException() {
		// TODO Auto-generated constructor stub
		super("더 이상 도서를 넣을 수 없습니다.");
	}

}

//Underflow 예외 클래스
@SuppressWarnings("serial")
class UnderflowException extends RuntimeException {
	
	public UnderflowException() {
		// TODO Auto-generated constructor stub
		super("삭제 할 도서가 없습니다.");
	}
	
}

interface MediaBook {
	public String getTitle();
	public String getISBN();
}

//Book 클래스(title : title, isbn : isbn)
class Book implements MediaBook, Comparable<Book> {
	private String title;
	private String author;
	private int publicationYear;
	private String isbn;
	
	// 생성자
	public Book(String title, String author, int publicationYear, String isbn) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.isbn = isbn;
	}
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	@Override
	public String getTitle() {
		return title;
	}
	@Override
	public String getISBN() {
		return isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + ", isbn=" + isbn
				+ "]";
	}	
}

// CDBook 클래스(title : cdStory, isbn : catalogNumber)
class CDBook implements MediaBook, Comparable<CDBook> {
	private String cdStory;
	private String artist;
	private String catalogNumber;
	
	public CDBook(String cdStory, String artist, String catalogNumber) {
		this.cdStory = cdStory;
		this.artist = artist;
		this.catalogNumber = catalogNumber;
	}
	
	@Override
	public int compareTo(CDBook o) {
		return cdStory.compareTo(o.cdStory);
	}
	@Override
	public String getTitle() {
		return cdStory;
	}
	@Override
	public String getISBN() {
		return catalogNumber;
	}
	@Override
	public String toString() {
		return "CDBook [cdStory=" + cdStory + ", artist=" + artist + ", catalogNumber=" + catalogNumber + "]";
	}	
}

// USBBook 클래스(title : usbName, isbn : serialNumber)
class USBBook implements MediaBook, Comparable<USBBook> {
	private String usbName;
	private int capacity;
	private String serialNumber;
	
	public USBBook(String usbName, int capacity, String serialNumber) {
		this.usbName = usbName;
		this.capacity = capacity;
		this.serialNumber = serialNumber;
	}
	
	@Override
	public int compareTo(USBBook o) {
		return usbName.compareTo(o.usbName);
	}
	@Override
	public String getTitle() {
		return usbName;
	}
	@Override
	public String getISBN() {
		return serialNumber;
	}
	@Override
	public String toString() {
		return "USBBook [usbName=" + usbName + ", capacity=" + capacity + ", serialNumber=" + serialNumber + "]";
	}
}

class Library<T extends MediaBook> {
	static final int CAPACITY = 5; // 기본 용량을 5로 설정
	private List<T> items = new ArrayList<>(CAPACITY);

	// 책 추가 (용량 초과 시 OverflowException 발생)
	public void addBook(T book) {
		if (items.size() > CAPACITY) {
//			throw new OverflowException("더 이상 도서를 추가할 수 없습니다.");
			throw new OverflowException();
		}
		items.add(book);
	}

	// 책 삭제 (빈 목록에서 삭제 시 UnderflowException 발생)
	public void removeBook() {
		if (items.size() <= 0) {
//			throw new UnderflowException("삭제 할 도서가 없습니다.");
			throw new UnderflowException();
		}
		items.remove(items.get(0));
	}

	public void printBooks(String msg) {
		System.out.println(msg);
		for (T book : items) {
			System.out.println(book.toString());
		}
	}

	// 제목으로 정렬
	public void sortBooksByTitle() {
		// 익명 클래스로 구현
		Comparator<T> comTitle = new Comparator<T>(){
						@Override
			public int compare(T t1, T t2) {
				// TODO Auto-generated method stub
				return (t1.getTitle().compareTo(t2.getTitle()));
			}
		};
		Collections.sort(items, comTitle);
	}

	// ISBN으로 정렬
	public void sortBooksByISBN() {
		// 람다식으로 구현
		Collections.sort(items, (i1, i2) -> i1.getISBN().compareTo(i2.getISBN()));
	}

	// 책 검색
	public T searchBookByTitle(String title) {
		// 구현
		return null;
	}
}
public class 실습_14_3_람다식_실습과제 {
	public static void main(String[] args) {
		Library<MediaBook> library = new Library<>();
		List<MediaBook> books = List.of(
			new Book("자바", "강감찬", 1995, "12024"),
			new CDBook("파이썬", "이순신", "22023"),
			new Book("C#", "을지문덕", 2008, "325"),
			new Book("자료구조", "연개소문", 1994, "42"),
			new USBBook("리액트", 2000, "52007"),
			new USBBook("C/C++", 200, "62000")
		);
		
		// 예외 처리를 적용한 책 추가
        System.out.println("\n>>>책 추가");
        // forEach 람다식으로 구현
//	    books.forEach(book -> {
//	    	library.addBook(book);
//	    });
        books.forEach(book -> {
        	try {
        		library.addBook(book);
			} catch (OverflowException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
        });

		// 도서 목록 출력
        library.printBooks("\n>>>현재 도서 목록:");

        // 제목 기준 정렬 및 출력
        library.sortBooksByTitle();
        library.printBooks("\n>>>제목 정렬 후:");

        // ISBN 기준 정렬 및 출력
        library.sortBooksByISBN();
        library.printBooks("\n>>>ISBN 정렬 후:");

//        // Title로 검색 및 출력
//        String title = "자료구조";
//        System.out.println("\n>>>Title[" + title + "]로 검색");
//        System.out.println("검색 결과 : " + library.searchBookByTitle(title));
//        
//		// 예외 처리를 적용한 책 삭제
//        System.out.println("\n>>>책 삭제");
//        while (true) {
//            try {
//            	library.removeBook();
//            } catch (UnderflowException e) {
//                System.out.println(e.getMessage());
//                break;
//            }
//        }
//        library.printBooks("\n>>>최종 도서 목록");
	}
}