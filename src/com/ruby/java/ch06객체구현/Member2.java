package com.ruby.java.ch06객체구현;

public class Member2 {

	private String name;
	private int age;
	
	public Member2() {
		this("guest");
	}
	
	public Member2(String name) {
		super();
		this.name = name;
	}
	
	public Member2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m1= new Member2();
		Member2 m2= new Member2("Amy");
		Member2 m3= new Member2("Amy", 23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

}
