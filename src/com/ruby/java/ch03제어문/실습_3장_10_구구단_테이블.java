package com.ruby.java.ch03제어문;

/*
 * 교재 139의 구구단 출력 결과를 테이블 형태
 * 1x1 1x2 ... 1x9
 * ..
 * 9x1 9x2 ... 9x9
 * 
 */
public class 실습_3장_10_구구단_테이블 {
	public static void main(String[] args) {
		
		for (int i = 2; i < 10; i++) {
			System.out.println("----" + i + "단----");
			for (int j = 1; j < 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
