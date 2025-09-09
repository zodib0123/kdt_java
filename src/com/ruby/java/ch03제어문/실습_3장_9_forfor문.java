package com.ruby.java.ch03제어문;

/*
 * 출력 형태를 다음과 같이 만들기 실습
 * 실습1:
 * $$$$$
 * $$$$
 * $$$
 * $$
 * $
 * 
 * 실습2: 정삼각형 형태로 출력하기
 * $$$$$$
 *  $$$
 *   $
 */
public class 실습_3장_9_forfor문 {
	public static void main(String[] args) {

		int i, j;
		
		for (i = 0; i < 5; i++) {
			for (j = i; j < 5; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println();
		
		for (i = 0; i < 3; i++) {
			for (j = i; j < 5; j++) {
				if (j < 2 * i) {
					System.out.print(" ");
					continue;
				}
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
