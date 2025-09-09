package com.ruby.java.ch04배열;

public class Gugudan {

	public static void printVertical() {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
			System.out.println("--------------------------");
		}
	}

	public static void printHorizontal() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " X " + i + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}

	public static void printColumn(int col) {

		for (int i = 2; i < 10; i += col) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + col; k++) {
					if (k < 10) {
						System.out.print(k + " X " + j + " = " + (j * k) + "\t");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		printVertical();
		System.out.println();
		printHorizontal();
		System.out.println("--------------------------\n");
		printColumn(3);
	}

}
