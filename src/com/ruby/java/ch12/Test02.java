package com.ruby.java.ch12;

import java.io.InputStream;
import java.io.PrintStream;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(InputStream keyboard = System.in; PrintStream console = System.out;) {
			int c = 0;
			while((c = keyboard.read()) != -1) {
				console.write(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
