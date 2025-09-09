package com.ruby.java.ch06객체구현.실습6_2;

class Student {
	// 필드
	/*
	 * name, age, subjects[], scores[], count를 private으로 선언
	 * count는 배열의  index로 사용
	 *  numberStudents를 정적 필드로 선언
	 */
	private String name;
	private int age;
	private String subjects[];
	private int scores[];
	private int count;
	public static int numberStudents;
	
	// 학생 수를 반환하는 정적 메소드getNumberStudents()
	public static void getNumberStudents() {
		System.out.println("학생 수 = " + numberStudents);
	}
	
	// 생성자
		/*name, age, subjects[], scores[], count를 매개변수로 전달받는 생성자 정의
		 * 
		 */	
	public Student(String name, int age, String[] subjects, int[] scores, int count) {
		super();
		this.name = name;
		this.age = age;
		this.subjects = subjects;
		this.scores = scores;
		this.count = count;
	}
		

	// setter 메소드: setName(String name), setAge(int age),  setSubjects(String subjects[]), setScores(int scores[]), setCount(int num)
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

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// 학생 정보를 출력하는 메소드 (예시용)
	public void printStudent() {
		/*
		 * 이름 = **, 나이 = **
		 * 과목1 = **, 점수1 = **
		 * 과목2 = **, 점수2 = **
		 * ... 등으로 출력
		 */
		System.out.println("이름 = " + name + ", 나이 = " + age);
		for (int i = 0; i < numberStudents; i++) {
			System.out.println("과목" + (i+1) + " = " + subjects[i] + ", " + "점수" + (i+1) + " = " + scores[i]);
		}
		System.out.println("-----------------------------------");
	}

	// 학생 정보를 출력하는 메소드 (예시용)
	public void printStudentInfo() {
		/*
		 * 이름 = **, 나이 = **
		 * 과목1 = **, 점수1 = **
		 * 과목2 = **, 점수2 = **
		 * ... 등으로 출력
		 */
		System.out.println("이름 = " + name + ", 나이 = " + age);
		for (int i = 0; i < numberStudents; i++) {
			System.out.println("과목" + (i+1) + " = " + subjects[i] + ", " + "점수" + (i+1) + " = " + scores[i]);
		}
		System.out.println("-----------------------------------");
	}
}
public class 실습6_2생성자사용 {
	static void showstudents() {

	}
	public static void main(String[] args) {
		String[] subjects = {"수학", "국어", "영어", "과학", "역사"};

		Student[] students = { 
				/*
				 *  생성자를 사용하여 객체 생성
				 *  ("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92}, -1),
				 *  ("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95}, -1),
				 *  ("계백", 23, subjects, new int[]{65, 70, 75, 80, 85}, -1),
				 *  ("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91}, -1),
				 *  "을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90}, -1)
				 */
				new Student("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }, -1),
				new Student("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }, -1),
				new Student("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }, -1),
				new Student("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }, -1),
				new Student("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }, -1)
		};
		// 학생 수를 정적 메소드 호출로 처리
		Student.numberStudents = students.length;
		Student.getNumberStudents();
		
		// 학생 정보 출력 (예시)
		showStudents(students);
	}
	public static void showStudents(Student[] students) {
		// TODO Auto-generated method stub
		for (Student st : students) {
			st.printStudent();
		}
	}
}