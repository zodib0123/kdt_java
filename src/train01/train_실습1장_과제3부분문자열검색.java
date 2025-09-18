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

	private static void searchSubstring(String text, String pattern) {
		// TODO Auto-generated method stub
		if (text == null || text.isEmpty() || pattern == null || pattern.isEmpty()) {
			System.out.println("값이 잘못 들어왔습니다.");
			return;
		}
		
		for (int i = 0; i < text.length(); i++) {
			boolean check = true;
			for (int j = 0; j < pattern.length(); j++) {
				if (i < text.length() - 1 && text.charAt(i + j) == pattern.charAt(j)) {
					continue;
				} else {
					check = false;
					break;
				}
			}
			if (!check) continue;
			else  {
				System.out.println("출력: [" + i + "," + (i + pattern.length()) + "]");
				break;				
			}
		}
	}


	public static void main(String[] args) {
		String text = "ababcabcabababd";
		String pattern = "ababd";	// 출력: [10,15]
		
		searchSubstring(text, pattern);
		text = "abxabcabcabyabcaby";
		pattern = "abcaby";
		searchSubstring(text, pattern);
	}

}

