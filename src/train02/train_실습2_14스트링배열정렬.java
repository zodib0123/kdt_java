package train02;

import java.util.Arrays;

/*
 * 2장 실습과제4 - 스트링 배열 정렬
 * 정렬된 배열에 insert하면 중간에 끼워 넣으면 큰 값들은 이동해야 하고 크기를 1 증가 처리가 필요 
 */
public class train_실습2_14스트링배열정렬 {
	
	private static void showData(String str, String[] data) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty() || data == null) {
			return;
		}
		System.out.print(str + "\n[");
		for (int i = 0; i < data.length; i++) {
			if (i < data.length-1) {
				System.out.print(data[i].toString() + ", ");
			} else {
				System.out.println(data[i].toString() + "]");
			}
		}
	}
	private static void swap(String[] data, int i, int j) {
		// TODO Auto-generated method stub
		if (data == null) {
			return;
		}
		
		String temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	
	private static void sortData(String[] data) {
		// TODO Auto-generated method stub
		if (data == null) {
			return;
		}
		
		for (int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					swap(data, i, j);
				}
			}
		}
	}

	private static String[] insertString(String[] data, String str) {
		// TODO Auto-generated method stub
		if (data == null || str == null || str.isEmpty()) {
			return data;
		}
		
		String[] newData = new String[data.length + 1];
		
		for (int i = 0; i < newData.length; i++) {
			if (i < newData.length - 1 && data[i].compareTo(str) < 0) {
				newData[i] = data[i];
			} else {
				newData[i] = str;
				for (int j = i; j < data.length; j++) {
					newData[j+1] = data[j];
				}
				break;
			}
		}
		return newData;
	}
	
	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData("정렬전", data);
		//Arrays.sort(data); // Internally uses String.compareTo()
		Arrays.sort(data, (s1,s2)->s1.compareTo(s2));
		sortData(data);
		showData("정렬후", data);
		String[] newData = insertString(data, "banana");
		showData("삽입후 크기가 증가된 정렬 배열", newData);
		
	}
	
}

