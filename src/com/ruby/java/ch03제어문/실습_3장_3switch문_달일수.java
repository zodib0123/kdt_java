package com.ruby.java.ch03제어문;

import java.util.Scanner;

/*
 * 달의 일 수 계산
 * int month = sc.nextInt()
 * switch(month) { 
 *     case1:
 *     		break;
 *     case3:
 *         days=31;
 * }
 * 
 */
public class 실습_3장_3switch문_달일수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("달일수를 알고싶은 년도와 달을 입력하세요.");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int february = 0; 
		if (year % 4 == 0) {
			february = 29;
		} else {
			february = 28;
		}
		
		int days = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			days = february;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			System.out.println("1 ~ 12월 중 입력해주세요.");
			break;
		}
		
		System.out.println(year + "년 " + month + "월의 달일수는 " + days +"일 입니다.");
		sc.close();
	}
}
