package edu;

import java.util.Arrays;
import java.util.List;

public class TestStream {

	// Stream API 사용법
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 사용
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum = Arrays.stream(arr).filter(n->n%2==0).sum();
		
		System.out.println(sum);
		
		// List 사용
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		int sum1 = list.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println(sum1);
		
	}

}
