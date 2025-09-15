
package com.ruby.java.ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//login 웹으로 개발시 필수 내용

public class Test18_실습대상 {

	public static void main(String[] args) {

		String firstName = "Oh";
		String lastName = "Jung'Im-soo";
		String tel = "010-1234-5678";
		String email = "purum@ruby.com";
		String email2 = "Hong.Bong.Hee@ruby.com";
		//첫글자는 대문자 + 그 이후는 소문자 여러개
		boolean firstName_check = Pattern.matches("[A-Z][a-zA-Z]*", firstName);
		//첫글자는 문자가 여러개
		boolean lastName_check = Pattern.matches("[a-zA-Z]+(['-][a-zA-Z]+)*", lastName);
		System.out.println("first Name :" + firstName_check);
		System.out.println("Last Name :" + lastName_check);
		
		String tel_pat = "01[0-9]-\\d{3,4}-\\d{4}";
		String email_pat = "\\w+@\\w+\\.\\w+(\\.\\w+)?";

		boolean tel_check = Pattern.matches(tel_pat, tel);
		boolean email_check = Pattern.matches(email_pat, email);
		boolean email2_check = Pattern.matches(email_pat, email2);

		System.out.println("tel :" + tel_check);
		System.out.println("email:" + email_check);
		System.out.println("email2:" + email2_check);
		System.out.println(Pattern.matches("\\w", "!"));
		// 암호 코드 추가
        String password = "$YourPassword123!"; // 여기에 암호를 입력하세요
        String password2 = "yourpassword123!"; 
        String regex = "^(?=.*[A-Z])(?=.*[!@#$%^&*()])(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$";
        // 정규식 모르겠으면 ai에게 물어보기.
        // (?=.*[A-Z])
        // **긍정 전방 탐색(Positive Lookahead)**입니다.
        // "문자열 내에 어떤 문자든(.*) 0번 이상 반복된 후, **대문자([A-Z])**가 반드시 한 번 나와야 한다"는 조건을 확인합니다.

        Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(password);
        Matcher matcher = pattern.matcher(password2);
        if(matcher.matches()) {
            System.out.println("암호가 유효합니다.");
        } else {
            System.out.println("암호가 유효하지 않습니다. 암호는 대문자 1개 이상, 특수문자 2개 이상, 숫자 1개 이상, 문자 1개 이상을 포함해야 합니다.");
        }
	}
}