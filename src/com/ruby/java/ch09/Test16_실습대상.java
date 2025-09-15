package com.ruby.java.ch09;

import java.util.Arrays;
/*
 * 440페이지 9.3.3 Arrays 클래스
 * - java.util.Arrays
 *   https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html
 */
public class Test16_실습대상 {

	public static void main(String[] args) {
		//Arrays.  //static 메소드를 확인
		
		// 정수 배열
        int[] score = {85, 90, 95, 100, 75};
        int[] score2 = Arrays.copyOf(score, score.length);

        // 정렬 전 출력
        System.out.println("정렬 전 정수 배열:");
        System.out.println("score : " + Arrays.toString(score));
        System.out.println("score2: " + Arrays.toString(score2));

        // 정수 배열 정렬
        Arrays.sort(score);
        System.out.println("정렬 후 정수 배열:");
        System.out.println("score : " + Arrays.toString(score));

        // 정수 배열 이진 탐색
        int index = Arrays.binarySearch(score, 100);
        System.out.println("score 배열에서 100의 이진 탐색 결과 인덱스: " + index);

        // 두 배열 내용 비교
        System.out.println("정렬 후 score와 score2 equals 비교: " + Arrays.equals(score, score2)); // false
        System.out.println("\n");
        // 문자열 배열
        String[] words = {"banana", "apple", "cherry", "grape", "orange"};

        // 정렬 전 출력
        System.out.println("정렬 전 문자열 배열:");
        System.out.println(Arrays.toString(words));

        // 문자열 배열 정렬
        Arrays.sort(words);
        System.out.println("정렬 후 문자열 배열:");
        System.out.println(Arrays.toString(words));

        // 문자열 배열 이진 탐색
        int stringIndex = Arrays.binarySearch(words, "cherry");
        System.out.println("문자열 배열에서 \"cherry\"의 이진 탐색 결과 인덱스: " + stringIndex);
    
	}
}