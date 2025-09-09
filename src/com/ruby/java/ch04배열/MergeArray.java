package com.ruby.java.ch04배열;

import java.util.Arrays;
import java.util.Random;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[5];
		int[] B = new int[5];
		Random rd = new Random();
		for (int i = 0; i < A.length; i++) {
			A[i] = rd.nextInt(100);
			B[i] = rd.nextInt(100);
		}

		int[] C = new int[A.length + B.length];
		for (int i = 0; i < B.length; i++) {
			C[(i * 2)] = A[i];
			C[(i * 2) + 1] = B[i];
		}
		
		System.out.println("A : " + Arrays.toString(A));
		System.out.println("B : " + Arrays.toString(B));
		System.out.println("C : " + Arrays.toString(C));
	}
}
