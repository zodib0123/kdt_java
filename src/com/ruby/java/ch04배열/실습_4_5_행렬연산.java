package com.ruby.java.ch04배열;

import java.util.Arrays;
import java.util.Random;

/*
 * 2차원 배열과 행렬 연산
 * 
 * 학습 목표
 *  1) 2차원 배열 만들기
 *  2) 난수로 배열 값 채우기
 *  3) 배열 간 덧셈, 곱셈, 전치(transpose) 개념 익히기
 *  4) 두 배열이 같은지 비교하기
 *  5) 배열을 테이블 형태로 출력하기
 *  
 *  구체적 설명:

1. 3줄 5칸짜리 표 A를 만든다.

	A[3][5]는 3명의 학생이 5과목 시험 본 점수표라고 생각하자.

	점수는 0~99 사이의 무작위 숫자로 채운다.

2. 같은 크기의 표 B도 만들어서 무작위 점수로 채운다.

3. C = A + B

	A와 B의 각 자리에 있는 값을 더해서 C라는 새로운 표를 만든다.

	예: C[0][0] = A[0][0] + B[0][0]

4. 5줄 4칸짜리 표 D를 만든다.

	D[5][4]는 예를 들어 과목별 프로젝트 점수라고 생각해보자.

5. E = A × D (행렬 곱셈)

	A(3x5)와 D(5x4)를 곱해서 E(3x4)라는 표를 만든다.

	E[i][j] = A[i][0]*D[0][j] + A[i][1]*D[1][j] + ... + A[i][4]*D[4][j]

6. 2차원 배열을 테이블 형태로 출력한다 

 */

public class 실습_4_5_행렬연산 {
	public static void main(String[] args) {
		int[][] a = new int[3][5];
		int[][] b = new int[3][5];
		int[][] c = new int[3][5];
		int[][] d = new int[5][4];
		int[][] e = new int[3][4];
		Random rd = new Random();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rd.nextInt(100);
				b[i][j] = rd.nextInt(100);
			}
		}

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				d[i][j] = rd.nextInt(100);
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					e[i][j] += a[i][k] * d[k][j];
				}
			}
		}
		
		printMatrix(a, "a");
		printMatrix(b, "b");
		printMatrix(c, "c");
		printMatrix(d, "d");
		printMatrix(e, "e");
	}
	
	public static void printMatrix(int[][] n, String msg) {
		System.out.println("-------- 표 "+ msg.toUpperCase() + " --------");
		for (int i = 0; i < n.length; i++) {
			System.out.println(Arrays.toString(n[i]));
		}
		System.out.println();
	}
}
