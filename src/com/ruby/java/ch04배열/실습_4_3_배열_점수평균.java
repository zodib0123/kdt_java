package com.ruby.java.ch04배열;

import java.util.Random;

/*
 * 배열 사용, 난수로 입력된 10명의 성적 평균 구하기
 * Random rd =new Random();
 * score[i] = rd. nextInt(100);//0 ~ 99 정수 생성
 * 
 * 10명 학생의 학점 출력:
 *    ~90 A, ~80 B, ~70 C, ~60 D, 59~ F
 *    출력은 "99점 - A 학점" 등으로 출력한다.
 */
public class 실습_4_3_배열_점수평균 {
	public static void main(String[] args) {
		int score[] = new int[10];
		Random rd = new Random();
//		int sum = 0;
//		double avg = 0.0;
		for (int i = 0; i < score.length; i++) {
			score[i] = rd.nextInt(100);
//			sum += score[i];
		}

		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 90) {								// 90보다 크거나 같다면
				System.out.println(score[i] + "점 - A 학점");
			} else if (score[i] >= 80) {						// 그 나머지에서 80보다 크거나 같다면
				System.out.println(score[i] + "점 - B 학점");
			} else if (score[i] >= 70) {						// 그 나머지에서 70보다 크거나 같다면
				System.out.println(score[i] + "점 - C 학점");
			} else if (score[i] >= 60) {						// 그 나머지에서 60보다 크거나 같다면
				System.out.println(score[i] + "점 - D 학점");
			} else {											// 그 나머지 전부 (60 미만)
				System.out.println(score[i] + "점 - F 학점");
			}
		}
	}
}
