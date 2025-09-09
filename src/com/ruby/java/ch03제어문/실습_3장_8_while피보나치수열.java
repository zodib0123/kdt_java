package com.ruby.java.ch03제어문;

import java.util.Scanner;

/*
 * 피보나치 수열: 0 1 1 2 3 5 8 ...
 * int n = sc.nextInt(); //항의 수
 * int first = 0;
 * int second = 1;
 * sysout(first);
 * while() {
 *    sysout(second)
 *    int next = first + second;
 *    first = second;
 *    second = next;
 * }
 * 
 */
public class 실습_3장_8_while피보나치수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피보나치 수열을 몇 항까지 나열할까요?");
		int n = sc.nextInt();
		int i = 1;
		int first = 0;
		int second = 1;
		System.out.print(first + " ");
		while(i < n) {
			System.out.print(second + " ");
			int next = first + second;
			first = second;
			second = next;
			i++;
		}
		System.out.println();
		sc.close();
	}
}
