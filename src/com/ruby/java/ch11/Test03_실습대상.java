//try - catch - resources
//try-catch-finally를 간단하게 사용하는 방법이다
package com.ruby.java.ch11;

//try catch resources를 사용하지 않는 경우
import java.io.FileInputStream;
import java.io.IOException;

public class Test03_실습대상 {

	public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("a.txt");//"a.txt" 실습
			int c = fi.read();
			//fi.read(null);
			System.out.println((char) c);
		} catch (IOException e) {
			System.out.println("IO 예외일때이다");
			if (fi != null) {
				try {
					fi.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (fi != null) {
				try {
					System.out.println("파일 연결 fi를 닫아야 한다");
					fi.close();//포함해야 한다 
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
