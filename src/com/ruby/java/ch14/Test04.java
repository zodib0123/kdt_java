package com.ruby.java.ch14;

interface Verify2 {
	boolean check(int n, int d);
}

//class MyVerify implements Verify2 {
//	@Override
//	public boolean check(int n, d) {
//		// TODO Auto-generated method stub
//		return (n % d) == 0;
//	}
//}

public class Test04 {
	public static void main(String[] args) {

//		MyVerify mv = new MyVerify();
//		System.out.println(mv.check(24, 3));
		
		Verify2 vf = (n, d) -> (n % d) == 0;
		System.out.println(vf.check(24, 3));
//		System.out.println(Verify2 vf = (24, 3) -> (n % d) == 0);
	}
}
