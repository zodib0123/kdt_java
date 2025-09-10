package com.ruby.java.ch07.상속;
abstract class Employee2 {//추상 클래스
	String name;
	int salary;
	
	public abstract void calcSalary();		//추상 메소드
	public abstract void calcBonus();
	
//	public Employee2(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//	}
}

// calcBonus() 매서드를 구현 X -> abstract class로 변경
abstract class Salesman extends Employee2 {	//307페이지 하단 밑에서 두번째 문단.
	int salesQty;
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급+판매수당*판매량");
	}
	
//	public Salesman(String name, int salary, int salesQty) {
//		super(name, salary);
//		this.salesQty = salesQty;
//	}
	
}

// 부모 클래스 (Salesman) 에서 calcSalary() 매서드는 완성이 되었으므로, calcBonus() 매서드만 완성시킴.
class DomesticSalesman extends Salesman {
	int domesticSalesQty;

// calcSalary() 매서드를 다시 구현하면 가장 아래의 자식 클래스의 매서드를 실행 함.
//	public void calcSalary() {
//		System.out.println("DomesticSalesman 급여 = 기본급+판매수당*판매량");
//	}

//	public DomesticSalesman(String name, int salary, int qty, int dqty) {
//		super(name, salary, qty);
//		this.domesticSalesQty = dqty;
//	}
//	
//	public DomesticSalesman(String name, int salary, int qty, int dqty) {
//		this.name = name;
//		this.salary = salary;
//		this.salesQty = qty;
//		this.domesticSalesQty = dqty;
//	}
	
	public void calcBonus() {
		System.out.println("DomesticSalesman 보너스 = 기본급* 0.01");
	}

}

class Consultant extends Employee2 {
	int consultingHours;
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급+컨설팅단가 * 컨설팅 시간");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급* 0.02");
	}
}

class Manager extends Employee2 {
	int teamNumbers;
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급+관리자단가 * 팀수");
	}
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급* 0.03");
	}
}

public class HRSTest {

	public static void main(String[] args) {
		//Salesman s = new Salesman();			//추상 클래스라서 호출 불가. (매서드 완성이 아직 안됨)
		Salesman s = new DomesticSalesman();
		//Employee2 e = new DomesticSalesman();			// 매서드가 모두 완성된 자식 클래스로 호출할 수 있음.
		//DomesticSalesman d = new DomesticSalesman();	// 자식 클래스라서 호출 가능.
		Consultant c = new Consultant();
		Manager m = new Manager();
		s.calcSalary();
		c.calcSalary();
		m.calcSalary();
		s.calcBonus();
		c.calcBonus();
		m.calcBonus();

	}
}
