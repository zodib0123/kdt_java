package com.ruby.java.ch02데이터타입;

import java.util.Scanner;

public class MinBillCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int result = 0;
		int temp = price;
		int i = 0;
		
		int[] bill = {50000, 10000, 5000, 1000};	
		
//		result = (price / 50000);
//		temp = (price % 50000);
//		result += (temp / 10000);
//		temp = (temp % 10000);
//		result += (temp / 5000);
//		temp = (temp % 5000);
//		result += (temp / 1000);
//		temp = (temp % 1000);
		
		while(temp > 0) {
			result += (temp / bill[i]);
			temp = (temp % bill[i]);
			i++;
		}
		
		System.out.println("최소 지폐 장수는 " + result + "장 입니다.");
		sc.close();
	}

}
