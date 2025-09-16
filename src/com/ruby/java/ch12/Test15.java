package com.ruby.java.ch12;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserBean user = new UserBean("purun", "오정임", "010-123-4657", "서울");
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"))) {
			out.writeObject(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
