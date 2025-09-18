package train01;

/*
* 문자열에서 연속해서 반복되는 문자를 해당 문자와 반복 횟수로 압축요. 
* 단, 압축한 문자열이 원래 문자열보다 작아야 한다.
* 
* 입력: "aabcccccaaa"
* 압축 결과: "a2b1c5a3" (단, 길이 비교 후 결정)
*
* StringBuilder:
* 내부 버퍼를 사용하여 문자열을 직접 수정할 수 있다.
* 객체 자체를 변경하기 때문에 반복적인 문자열 조작에 효율적
*/
public class train_실습1장_과제2문자열압축 {

	private static String compress(String input) {
		// TODO Auto-generated method stub
		if (input == null || input.isEmpty()) {
			return input;
		}
		StringBuilder st = new StringBuilder();
		int count = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
            	st.append(input.charAt(i));
            	st.append(count);
                count = 1;
            }
        }
		return st.toString();
	}
	
    public static void main(String[] args) {
        String input = "aabcccccaaab";
        System.out.println("압축 결과: " + compress(input));
    }
}
