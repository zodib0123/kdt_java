package com.ruby.java.ch07.상속;

//final class Person2 {					// final 때문에 상속이 불가능.
class Person2 {
//	private final String ssn_id;
	private final String ssn_id = "2025_09";
	private String name;
	private int age;

	public Person2() {// 오류 - 이유는?		// ssn_id 값을 초기화 해주지 않음. ssn_id에 초기값을 넣어주면 해결
		System.out.println("Person2() 생성자 실행!");
	}

	public Person2(String name, int age) {// final 변수 초기화
		//this.ssn_id = "";
		this.name = name;
		this.age = age;
		System.out.println("Person2(sid, name, age) 생성자 실행!");
	}

	//void set_ssn_id(String sid) {
	//	ssn_id = sid;// 오류 - 이유는?	// final이라서 값의 변경이 불가능
	//}

//	public final String toString() {	// final 이라서 toString()을 오버라이딩 할 수 없음
	public String toString() {
		return ssn_id + " / " + name + ", " + age;
	}
}

class Student2 extends Person2 {
	String dept;

	public Student2(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
//	public final String toString() {	// Student2 의 자식 클래스가 생기면 자식클래스는 toString() 오버라이딩이 불가능
	public String toString() {
		return super.toString() + ", " + dept;
	}
}

public class PersonFinal {

	public static void main(String[] args) {
		Student2 s2 = new Student2("김아무개", 30, "딥러닝");
		System.out.println(s2);

	}

}
