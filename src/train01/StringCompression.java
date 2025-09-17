package train01;

public class StringCompression {
    public static String compressString(String str) {
        // 입력 문자열이 비어 있거나 길이가 1 이하면 압축할 필요가 없으므로 그대로 반환
        if (str == null || str.length() <= 1) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // 문자열을 순회하며 연속된 문자를 찾음
        for (int i = 0; i < str.length(); i++) {
            // 마지막 문자가 아니면서 현재 문자와 다음 문자가 같으면 카운트 증가
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // 문자가 바뀌거나 마지막 문자에 도달하면
                // 압축된 문자열에 현재 문자와 카운트 추가
                compressed.append(str.charAt(i));
                compressed.append(count);
                // 카운트 초기화
                count = 1;
            }
        }
        
        // 압축된 문자열의 길이가 원본보다 짧을 경우에만 압축 결과 반환
        String compressedString = compressed.toString();
        return compressedString.length() < str.length() ? compressedString : str;
    }

    public static void main(String[] args) {
        String input1 = "aabcccccaaa";
        String result1 = compressString(input1);
        System.out.println("입력: \"" + input1 + "\" -> 결과: \"" + result1 + "\""); // 출력: a2b1c5a3

        String input2 = "abcde";
        String result2 = compressString(input2);
        System.out.println("입력: \"" + input2 + "\" -> 결과: \"" + result2 + "\""); // 출력: abcde
    }
}