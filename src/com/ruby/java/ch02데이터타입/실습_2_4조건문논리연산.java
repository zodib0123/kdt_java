package com.ruby.java.ch02데이터타입;

import java.util.Scanner;

public class 실습_2_4조건문논리연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = sc.next();
		
		String result = ((n > 20 && n < 30) && st.equals("부산")) ? "참" : "거짓";

		System.out.println("나이 = " + n + ", 도시 = " + st + ", 부산청년여부 = " + result);
		sc.close();
	}

}
