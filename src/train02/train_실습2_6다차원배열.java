package train02;

import java.util.Iterator;

/*
 * 3번째 실습
 * 교재 83 - 배열 처리 + function parameter 전달 숙달 훈련 
 *  함수에서 배열을 리턴할 때 리턴 타입 정의할 수 있어야 한다
 */

import java.util.Random;
public class train_실습2_6다차원배열 {

	private static void inputData(int[][] data) {
		if (data == null) {
			return;
		}
		Random rm = new Random();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = rm.nextInt(10)+1;
			}
		}
	}
	private static void showData(String msg, int[][] data) {
		if (data == null) {
			return;
		}
		System.out.println(msg);
		for (int i = 0; i < data.length; i++) {
			System.out.print("[");
			for (int j = 0; j < data[i].length; j++) {
				if (j < data[i].length-1) {
					System.out.print(data[i][j] + ",");
				} else {
					System.out.print(data[i][j]);
				}
			}
			System.out.println("]");
		}
	}
	private static int[][] addMatrix(int[][] a, int[][] d) {
		// TODO Auto-generated method stub
		if (a == null || d == null) {
			return a;
		}
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] + d[i][j]; 
			}
		}		
		return result;
	}
	private static int[][] multiplyMatrix(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		if (a == null || b == null) {
			return a;
		}
		
		int[][] result = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
	private static int[][] transposeMatrix(int[][] b) {
		// TODO Auto-generated method stub
		if (b == null) {
			return b;
		}
		int[][] result = new int[b[0].length][b.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = b[j][i];
			}
		}
		return result;
	}
	private static int[][] multiplyMatrixTransposed(int[][] a, int[][] f) {
		// TODO Auto-generated method stub
		if (a == null || f == null) {
			return a;
		}		
		int[][] temp = transposeMatrix(f);
		int[][] result = new int[a.length][temp[0].length];
		result = multiplyMatrix(a, temp);
		return result;
	}
	private static boolean equals(int[][] a, int[][] c) {
		// TODO Auto-generated method stub
		if (a == null || c == null) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != c[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int [][]A = new int[2][3];
		int [][]B = new int[3][4];
		int [][]C = new int[2][4];

		inputData(A);inputData(B);
		int [][]D = A.clone();//교재83 - 배열 복제
		System.out.println("A[2][3] = ");
		showData("행렬 A", A);
		System.out.println("D[2][3] = ");
		showData("행렬 D", D);
		System.out.println();
		System.out.println("B[3][4] = ");
		showData("행렬 B", B);
		int [][]E = addMatrix(A,D);
		System.out.println("E[2][3] = ");
		showData("행렬 E", E);
		C = multiplyMatrix(A,B);
		System.out.println("C[2][4] = ");
		showData("행렬 C", C);

		int [][]F = transposeMatrix(B);
		System.out.println("F[3][2] = ");
		showData("행렬 F", F);
		C= multiplyMatrixTransposed(A,F);
		showData("행렬 곱셈 결과-전치행렬 사용", C);
		boolean result = equals(A,C);
		if (result)
			System.out.println("행렬 A,C는 equal이다");
		else
			System.out.println("행렬 A,C는 equal 아니다");
	}	
}

