package train01;

/*
 * 주어진 긴 문자열 text에서 패턴 문자열 pattern이 등장하는 모든 시작 인덱스를 찾으세요.
 *
 * 입력: text = "abxabcabcabyabcaby", pattern = "abcaby"
 * 출력: [6,12]
 * 
 * 패턴이 나타나는 인덱스를 반환
 */
public class train_실습1장_과제3부분문자열검색 {

	    public static void main(String[] args) {
	        String text = "ababcabcabababd";
	        String pattern = "ababd";

	        searchSubstring(text, pattern);
	        text = "abxabcabcabyabcaby";
	        pattern = "abcaby";
	        searchSubstring(text, pattern);
	    }
	}


