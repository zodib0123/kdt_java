package train01;

import java.util.Arrays;

public class train_실습1_5_숫자변환_과제 {
/*
 * split(" ")
 * parseInt(stringArray[i])
 */

	public static String[] splitSortString(String input) {
		String[] result = input.split(" ");
		Arrays.sort(result);
		return result;
	}
	
	public static void printStringArray(String[] array) {
		for (String s : array) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static int[] convertSortToIntArray(String[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = Integer.parseInt(array[i]);
		}
		Arrays.sort(result);
		return result;
	}	

	public static void printIntArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
        String input = "12 111 911 921 94 23 214 222";
        
        // 문자열 배열 정렬 및 출력
        String[] sortedStringArray = splitSortString(input);
        System.out.println("Sorted String Array:");
        printStringArray(sortedStringArray);
        
        // 문자열 배열을 정수 배열로 변환 및 정렬 후 출력
        int[] sortedIntArray = convertSortToIntArray(sortedStringArray);
        System.out.println("Sorted Integer Array:");
        printIntArray(sortedIntArray);
    }
}
