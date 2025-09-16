//package com.ruby.java.ch11;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
////Overflow 예외 클래스
//class OverflowException extends RuntimeException { // 교재 553
//	public OverflowException(String message) {
//		super(message);
//	}
//}
//
////Underflow 예외 클래스
//class UnderflowException extends RuntimeException {
//	public UnderflowException(String message) {
//		super(message);
//	}
//}
//
////Book 클래스
//// Comparable<T>	┐ 자료구조 인터페이스 compareTo()를 추상매서드로 가지고 있음.
//// Comparator<T>  	┘
//class Book implements Comparable<Book> {
//	private String title;
//	private String author;
//	private int publicationYear;
//	private String isbn;
//
//	Book(String title, String author, int year, String isbn) {
//		this.title = title;
//		this.author = author;
//		publicationYear = year;
//		this.isbn = isbn;
//	}
//
//	@Override
//	public String toString() {
//		return String.format("도서명:\t%s\t저자:\t%s\t출판연도:\t%d\tISBN:\t%s", title, author, publicationYear, isbn);
//	}
//
//	String getTitle() {
//		return title;
//	}
//
//	String getISBN() {
//		return isbn;
//	}
//
//	// 문자열 비교 
//	@Override
//	public int compareTo(Book b) {
//		return this.title.compareTo(b.title);
//	}
//}
//
//class Library {
//	static final int CAPACITY = 5; // 기본 용량을 5로 설정
//	private ArrayList<Book> books;
//
//	Library() {
//		books = new ArrayList<Book>(CAPACITY);
//	}
//
//	// 책 추가 (용량 초과 시 OverflowException 발생)
//	public void addBook(Book book) {
//		if (books.size() >= CAPACITY) {
//			throw new OverflowException("도서관 용량 초과: 더 이상 책을 추가할 수 없습니다.");
//		}
//		books.add(book);
//	}
//
//	// 책 삭제 (빈 목록에서 삭제 시 UnderflowException 발생)
//	public Book removeBook() {
//		if (books.size() <= 0) {
//			throw new UnderflowException("도서관에 더 이상 삭제할 책이 없습니다.");
//		}
//		Book removedBook = books.get(0);
//		books.remove(0); // 삭제된 위치의 책을 null로 설정
//		return removedBook;
//	}
//
//	public void printBooks(String msg) {
//		System.out.println(msg + " 도서숫자 = " + books.size());
//		for (int i = 0; i < books.size(); i++) {
//			System.out.println(books.get(i).toString());
//		}
//	}
//
//	public void sortBooksByTitle() {
//		books.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
//	}
//
//	public void sortBooksByISBN() {
//		books.sort((b1, b2) -> Integer.parseInt(b1.getISBN()) - Integer.parseInt(b2.getISBN()));
//	}
//
//	public Book searchBookByTitle(String title) {
//		for (int i = 0; i < books.size(); i++) {
//			if (title.equals(books.get(i).getTitle())) {
//				return books.get(i);
//			}
//		}
//		return null;
//	}
//}
//
//public class 실습11_C3_예외처리 {
//	public static void main(String[] args) {
//		try {
//			String s = new String("java");
//			System.out.println(s.length());
//			s = null;
//			System.out.println(s.length());
//			int[] arr = new int[2];
//			arr[2] = 10;
//		} catch (ArrayIndexOutOfBoundsException e1) {// 교재534
//			System.out.println("***배열 색인 예외 발생");
//			System.out.println(e1.getMessage());
//		} catch (NullPointerException e2) {
//			System.out.println("***널 포인터 예외 발생");
//			//e2.getMessage();
////			e2.printStackTrace()
//			;
//		} catch (Exception e) {
//			System.out.println("***예외 발생");
//		} finally {
//			System.out.println("***모든 것이 ok\n\n");// 교재 543
//			// 할당된 자원을 자동으로 해제가 아니고 close(file)을 포함해야 한다
//		}
//
//		Library library = new Library();
//
//		// 5개의 Book 객체 초기화
//		Book book1 = new Book("자바", "강감찬", 1995, "12");
//		Book book2 = new Book("파이썬", "이순신", 2008, "9");
//		Book book3 = new Book("C#", "을지문덕", 2008, "8");
//		Book book4 = new Book("자료구조", "연개소문", 1994, "45");
//		Book book5 = new Book("리액트", "김춘추", 1999, "7");
//		Book book6 = new Book("스프링", "홍길동", 2025, "99");
//		// 예외 처리를 적용한 책 추가 및 삭제
//		try {
//			library.addBook(book1);
//			library.addBook(book2);
//			library.addBook(book3);
//			library.addBook(book4);
//			library.addBook(book5);
//			library.addBook(book6);
//
//			// 도서관의 용량을 초과하여 책을 추가 (예외 발생)
//			Book book7 = new Book("SQL", "이기자", 2024, "34");
//			library.addBook(book7); // 이 부분에서 OverflowException 발생
//		} catch (OverflowException e) {
//			System.out.println(e.getMessage());//OverflowException 생성시 전달된 메시지 출력
////			e.printStackTrace();
//		}
//
//		// 도서 목록 출력
//		library.printBooks("\n\n현재 도서 목록:");
//
//		try {
//			// 책 삭제
//			library.removeBook(); // 정상 삭제
//			library.removeBook(); // 정상 삭제
//			library.removeBook(); // 정상 삭제
//			library.removeBook(); // 정상 삭제
//			library.removeBook(); // 정상 삭제
//			library.removeBook(); // 정상 삭제
//			library.removeBook(); // 정상 삭제
//
//			// 빈 도서관에서 책을 삭제 (예외 발생)
//			library.removeBook(); // 이 부분에서 UnderflowException 발생
//		} catch (UnderflowException e) {
//			System.out.println(e.getMessage());
//		}
//
//		// 최종 도서 목록 출력
//		library.printBooks("\n최종 도서 목록:");
//	}
//}