package com.ruby.java.ch10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//hashset을 arraylist로 변환하여 정렬하기 구현

// Lotto 번호와 보너스 번호를 저장하는 클래스
class Lotto {
	private HashSet<Integer> lotto;
	private Integer bonus;
	
	// 생성자에서 1~45 사이의 정수를 임의로 선택해서 lotto에 중복되지 않게 저장
	// 마지막 보너스 번호도 1개 lotto에 저장된 숫자들과 중복되지 않게 저장
	public Lotto() {
		// 구현
		Random rm = new Random();
		lotto = new HashSet();
		List<Integer> list = new ArrayList();
		for (int j = 0; lotto.size() <= 6; j++) {
			lotto.add(rm.nextInt(45)+1);
		}
		list = new ArrayList(lotto);
		bonus = list.getLast();
//		lotto.remove(bonus);
	}

	// lotto에 저장된 숫자를 출력
	// 정렬이 필요한 경우에는 HashSet을 ArrayList로 변환해서 Collections.sort()를 이용해서 정렬
	//
	// bSort = false [35  4  7 24 25 30 + 보너스번호: 20]
	// bSort = true  [ 4  7 24 25 30 35 + 보너스번호: 20]
	public void print(boolean bSort) {
		// 구현
		lotto.remove(bonus);
		List<Integer> list = new ArrayList(lotto);
		if (bSort) {
			Collections.sort(list);
		}
		Iterator<Integer> iter = list.iterator();
		System.out.print("bSort = " + bSort + " [");
		while(iter.hasNext()) {
			System.out.print(iter.next() + " \t");
		}
		System.out.println(" + 보너스번호: " + bonus + "]");
	}
}

public class 실습_10_1_lotto {

	// 한번에 생성할 Lotto 개수
	private static final int NUMBEROFLOTTO = 5;
	
	public static void main(String[] args) {
		List<Lotto> lot = new ArrayList<>();
		for (int i = 0; i < NUMBEROFLOTTO; i++) {
			Lotto lotto = new Lotto();
			lot.add(lotto);
		}

		System.out.println("정렬 전 lotto 출력\n");
		print_lotto(lot, false);
		System.out.println();
		
		System.out.println("정렬 후 lotto 출력\n");
		print_lotto(lot, true);
	}
	
	private static void print_lotto(List<Lotto> lot, boolean bSort) {
		for(Lotto lotto : lot) {
			lotto.print(bSort);
		}
	}
}