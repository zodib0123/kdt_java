package com.ruby.java.ch14;

@FunctionalInterface
interface Verify {
	boolean check(int n);
}

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Verify isEven = (n) -> (n % 2) == 0;
		System.out.println(isEven.check(10));
		
		Verify isPositive = (n) -> n >= 0;
		System.out.println(isPositive.check(-5));
		
	}

}
