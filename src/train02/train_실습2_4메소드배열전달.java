package train02;
/*
 * 2장: 메소드 함수에 parameter 전달
 * 메소드에 배열 전달 실습: 교재 59 - 메소드의 매개변수로 배열 사용하기
 * function parameters를 작성할 수 있어야 한다 
 */

import java.util.Random;
public class train_실습2_4메소드배열전달 {
	static int top = 0;
	static final int MAX_LENGTH = 20;
	
	private static void inputData(int[] data) {//교재 63 - 난수의 생성
		//top이 배열에 저장된 갯수를 저장
		if (data == null) {
			return;
		}
		Random rm = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rm.nextInt(MAX_LENGTH);
		}
		top = data.length;
	}
	private static void showData(String msg, int[] data) {
		//top 갯수까지 출력한다 [1,2,3]등으로 출력하도록 작성
		if (data == null || msg == null || msg.isEmpty()) {
			return;
		}
		System.out.println(msg);
		System.out.print("[");
		for (int i = 0; i < data.length; i++) {
			if (i < data.length-1) {
				System.out.print(data[i] + ",");
			} else {
				System.out.print(data[i] + "]");
			}
		}
	}
	private static int findMax(int[] data) {
		//최대값을 리턴한다 
		if (data == null) {
			return 0;
		}
		int max = data[0];
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
	private static boolean findValue(int[] data, int n) {
		//items[]에 value 값이 있는지를 찾아 존재하면 true, 없으면 false로 리턴
		if (data == null) {
			return false;
		}
		boolean result = false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == n) {
				result = true;
			}
		}
		return result;
	}
	// reverse() 구현
	private static void reverse(int[] data) {
		// TODO Auto-generated method stub
		if (data == null) {
			return;
		}
		for (int i = 0; i < data.length / 2; i++) {
			int k = data[i];
			data[i] = data[data.length - i - 1];
			data[data.length - i - 1] = k;
		} 
	}
	
	public static void main(String[] args) {
		int []data = new int[10];
		inputData(data);
		showData("소스데이터",data);
		int max = findMax(data);
		System.out.println("\nmax = " + max);
		boolean existValue = findValue(data, 3);
		System.out.println("찾는 값 = " + 3 + ", 존재여부 = " + existValue);
		reverse(data);// 역순으로 출력 
		showData("역순 데이터", data);
		
	}
}
