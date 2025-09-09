package com.ruby.java.ch03제어문;

import java.util.Scanner;

public class 실습_3장_1_if문제어 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("if 문 실습:");
		System.out.print("택배 무게를 입력하세요: ");
		int weight = scanner.nextInt();
		
		/*
		 * 무게에 따라 택배 요금 계산하여 출력한다 1000 이하 3000 1000 < w <= 5000 5000 5000 < w <= 10000
		 * 8000 10000 < w 12000
		 * 
		 * 출력: 택배 요금은 0000원입니다
		 */
		int price = 0;
		if (weight <= 1000) {
			price = 1000;
		} else if (weight <= 5000) {
			price = 5000;
		} else if (weight <= 10000) {
			price = 8000;
		} else {
			price = 10000;
		}		
		System.out.println("택배 요금은 " + price + "원입니다.");
		scanner.close();
	}
}
