package edu;

import java.util.Random;

public class Test41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		int row = Integer.valueOf(args[0]);
		int col = Integer.valueOf(args[1]);
		
		int[][] arr = new int[row][col];
		Random rd = new Random();
		
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = rd.nextInt(0, 101);
			}
		}
		System.out.println(arr[0][0]);
	}
}
