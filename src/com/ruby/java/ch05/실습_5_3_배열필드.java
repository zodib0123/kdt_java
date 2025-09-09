package com.ruby.java.ch05;

class Person {
	// 필드 (private)
	/*
	 * name은 String, age는 int, weight는 float로 필드들을 private 선언 subjects을 교육과목 private
	 * 배열[10] years을 수강 연도 private 배열[10] count 필드를 사용하여 수강 과목 증가시마다 ++count
	 */
	// 필드
	private String name;
	private int age;
	private float weight;
	private String[] subjects;
	private int[] years;

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

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public int[] getYears() {
		return years;
	}

	public void setYears(int[] years) {
		this.years = years;
	}

	// 메소드
	void show() {
		// 기본 정보 출력::name=**, age=**, weight=**로 출력
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("몸무게: " + weight);
		// 교육과목 및 수강 연도 출력
		/*
		 * while 문을 사용하여 교육과목과 수강연도를 출력
		 */
		int count = 0;
		while (count < subjects.length) {
			System.out.println("교육과목: " + subjects[count] + ", 수강연도: " + years[count]);
			count++;
		}
	}

	void addSubjectYear(String subject, int year) {
		// 과목, 수강연도를 매개변수로 전달받아 배열에 추가
	}
}

public class 실습_5_3_배열필드 {

	public static void main(String[] args) {
		// 첫 번째 객체 생성 및 초기화
		Person p1 = new Person();
		// 다음 코드를 setter, addSubjectYear를 사용하여 수정
		p1.setName("홍길동");
		p1.setAge(25);
		p1.setWeight(60.56f);
		p1.setSubjects(new String[] { "Mathematics", "Science", "History" });
		p1.setYears(new int[] { 2020, 2021, 2022 });
//		p1.setYears(years1);

		// 메소드 호출
		p1.show();

		// 두 번째 객체 생성 및 초기화
		Person p2 = new Person();
		p2.setName("강감찬");
		p2.setAge(55);
		p2.setWeight(62.34f);
		p2.setSubjects(new String[] { "Literature", "Philosophy", "Physics" });
		p2.setYears(new int[] { 2018, 2019, 2020 });

		// 메소드 호출
		p2.show();
	}
}
