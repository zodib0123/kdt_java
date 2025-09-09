package com.ruby.java.ch02데이터타입;

import java.util.Scanner;

public class 실습_2_5타입변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		double result1 = (double) n;
		
		System.out.println("정수변수값 = " + n + ", 실수변수값 = " + result1);
				
		Scanner sc2 = new Scanner(System.in);
		double m = sc2.nextDouble();
		int result2 = (int) m;
		
		System.out.println("실수변수값 = " + m + ", 정수변수값 = " + result2);
		sc1.close();
		sc2.close();
	}

}
