package com.ruby.java.ch08;

/*
 * 인터페이스 다형성 실습 코드
 * 생성자에서 this()를 사용, super()를 사용
 * 추상 메소드 구현에서 super.추상메소드를 사용하는 구현 실습이 목적임 
 */
interface Vehicle {
	public abstract void showVehicle();
}

class Truck implements Vehicle {
	private int weight;
	
	public Truck(int weight) {
		this.weight=weight;
	}
	
	@Override
	public void showVehicle() {
		System.out.println("Truck: weight = " + weight);
	}
}

class Car implements Vehicle {
	int vehicleOccupants;

	public Car(int vehicleOccupants) {
		this.vehicleOccupants = vehicleOccupants;
	}

	@Override
	public void showVehicle() {
		System.out.println("car: vehicleOccupants = " + vehicleOccupants);
	}
}

class Taxi extends Car {
	private int mileage;

	public Taxi(int vehicleOccupants, int mileage) {
		super(vehicleOccupants);
		this.mileage = mileage;
	}
	
	@Override
	public void showVehicle() {
		System.out.println("taxi: vehicleOccupants = " + vehicleOccupants + ", mileage = " + mileage);
	}
}

class MotorCycle implements Vehicle{
	private int price;

	public MotorCycle(int price) {
		this.price = price;
	}

	@Override
	public void showVehicle() {
		System.out.println("MotoCycle: price = " + price);
	}
}

public class 실습_8_1_인터페이스다형성 {
	public static void displayVehicles(Vehicle [] a) {
		for (Vehicle v : a) {
			// v의 타입을 실행 시간에 확인하여 해당 클래스의 메소드로 바인딩
			v.showVehicle();
		}
	}

	public static void main(String[] args) {

		Vehicle [] arr = new Vehicle[5];
		arr[0] = new Truck(33);
		arr[1] = new Car(4);
		arr[2] = new Taxi(2, 9000);//생성자가 super()를 사용
		arr[3] = new Truck(22);
		arr[4] = new MotorCycle(12000);
		displayVehicles(arr);
		
		Vehicle v = new Vehicle() {
			public void showVehicle() {
				System.out.println("Vehicle: 익명 클래스 ");
			}
		};
		v.showVehicle();

		/*
		 * 출력 결과 예시
		 *
		Truck: weight = 33
		Car: vehicleOccupants = 4
		Taxi: vehicleOccupants = 2, mileage = 9000
		Truck: weight = 22
		MotorCycle: price = 12000
		Vehicle: 익명 클래스 
		*/
	}
}
