package com.ruby.java.ch06객체구현.실습6_3;

class Student {
	// 필드
	/*
	 * name, age, subjects[], scores[], passFail[], count를 private으로 선언 count는 배열의
	 * index로 사용 numberStudents를 정적 필드로 선언
	 */
	private String name;
	private int age;
	private String subjects[];
	private int scores[];
	private int passFail[];
//	private int count;
	private String[] isPassed;
	public static int numberStudents;
		
	// 생성자
	/*
	 * name, age, subjects[], scores[], passFail[], count를 매개변수로 전달받는 생성자 정의
	 * 
	 */
//	public Student(String name, int age, String[] subjects, int[] scores, int[] passFail, int count) {
	public Student(String name, int age, String[] subjects, int[] scores, int[] passFail) {
		super();
		this.name = name;
		this.age = age;
		this.subjects = subjects;
		this.scores = scores;
		this.passFail = passFail;
//		this.count = count;
		this.isPassed = new String[5];
	}

	// setter 메소드: setName(String name), setAge(int age), setSubjects(String
	// subjects[]), setScores(int scores[]), setCount(int num)

	// 학생 수를 반환하는 정적 메소드getNumberStudents()
	public static void getNumberStudents() {
		System.out.println("학생 수 = " + numberStudents);
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

	public int[] getPassFail() {
		return passFail;
	}

	public void setPassFail(int[] passFail) {
		this.passFail = passFail;
	}
//	public int getCount() {
//		return count;
//	}
//
//	public void setCount(int count) {
//		this.count = count;
//	}

	// 학생 정보를 출력하는 메소드 (예시용)
	public void printStudent() {
		/*
		 * 이름 = **, 나이 = ** 과목1 = **, 점수1 = ** 과목2 = **, 점수2 = ** ... 등으로 출력
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
		 * 이름 = **, 나이 = ** 과목1 = **, 점수1 = **, 통과여부=pass 과목2 = **, 점수2 = **, 통과여부=fail
		 * ... 등으로 출력
		 */
		isPassed();
		System.out.println("이름 = " + name + ", 나이 = " + age);
		for (int i = 0; i < numberStudents; i++) {
			System.out.println(
					"과목" + (i+1) + " = " + subjects[i] + ", " + "점수" + (i+1) + " = " + scores[i] + ", 통과여부 = " + isPassed[i]);
		}
		System.out.println("-----------------------------------");
	}

	// 통과 여부 (모든 과목을 통과했는지 확인)
	public void isPassed() {
		// 주어진 학생이 모든 과목 통여 여부를 반환
		for (int i = 0; i < numberStudents; i++) {
			if (scores[i] < this.passFail[i]) {
				this.isPassed[i] = "fail";
			}
			else {
				this.isPassed[i] = "pass";
			}
		}
	}

	// 6.2.2 각 학생의 성적 테이블을 출력하는 정적 메소드
	public static void printAllStudents(Student[] students) {
		// 학생 이름 + 과목명, 과목 점수 .... + 과목통과여부:pass or fail
		for (Student st : students) {
			st.isPassed();
			st.printStudentInfo();
		}
	}

	// 6.2.2 과목별 최대/최소 점수 및 해당 학생을 출력하는 정적 메소드
	public static void printSubjectStats(Student[] students) {
		for (int i = 0; i < numberStudents; i++) {
			int maxScore = students[i].scores[i];
			int minScore = students[i].scores[i];
			String maxName = students[i].name;
			String minName = students[i].name;
			for (int j = 0; j < numberStudents; j++) {
				if (maxScore < students[j].scores[i]) {
					maxScore = students[j].scores[i];
					maxName = students[j].name;
				}
				if (minScore > students[j].scores[i]) {
					minScore = students[j].scores[i];
					minName = students[j].name;
				}
			}
			System.out.print("과목 = " + students[i].subjects[i] + " / 최대 점수 = " + maxName + ", " + maxScore);
			System.out.println(" / 최소 점수 = " + minName + ", " + minScore);
		}
		
	}
}

 public class 실습6_3정적메소드 {
	public static void main(String[] args) {
		String[] subjects = { "수학", "국어", "영어", "과학", "역사" };
		int[] passFails = { 40, 70, 60, 55, 80 };
		Student[] students = {
				/*
				 * 생성자를 사용하여 객체 생성 ("홍길동", 21, subjects, new int[]{85, 90, 78, 88, 92},
				 * passFails,-1), ("김유신", 22, subjects, new int[]{75, 80, 85, 90, 95},
				 * passFails,-1), ("계백", 23, subjects, new int[]{65, 70, 75, 80, 85},
				 * passFails,-1), ("강감찬", 24, subjects, new int[]{95, 92, 88, 84, 91},
				 * passFails,-1), "을지문덕", 25, subjects, new int[]{88, 76, 85, 79, 90},
				 * passFails,-1)
				 */
//				new Student("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }, passFails, -1),
//				new Student("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }, passFails, -1),
//				new Student("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }, passFails, -1),
//				new Student("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }, passFails, -1),
//				new Student("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }, passFails, -1) };
				new Student("홍길동", 21, subjects, new int[] { 85, 90, 78, 88, 92 }, passFails),
				new Student("김유신", 22, subjects, new int[] { 75, 80, 85, 90, 95 }, passFails),
				new Student("계백", 23, subjects, new int[] { 65, 70, 75, 80, 85 }, passFails),
				new Student("강감찬", 24, subjects, new int[] { 95, 92, 88, 84, 91 }, passFails),
				new Student("을지문덕", 25, subjects, new int[] { 88, 76, 85, 79, 90 }, passFails) };
		// 학생 수를 정적 메소드 호출로 처리
		Student.numberStudents = students.length;
		Student.getNumberStudents();
		
		// 학생 정보 출력 (예시)
		printStudent(students);

		// 각 학생의 성적 테이블 출력
		Student.printAllStudents(students);

		// 과목별 최대/최소 점수 및 해당 학생 출력
		Student.printSubjectStats(students);
	}

	public static void printStudent(Student[] students) {
		// TODO Auto-generated method stub
		for (Student st : students) {
			st.printStudent();
		}
	}
}
