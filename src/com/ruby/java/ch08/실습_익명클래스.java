package com.ruby.java.ch08;

interface WorkFile {
	public void fileUpload();
	public void fileDownload();
}

interface Messenger {
	int MIN_SIZE=1;
	int MAX_SIZE=10000;
	public String getMessage();
	public void setMessage(String msg);
	public default void setLogin(boolean login) {
		if (login) {
			System.out.println("login");
		}
		else {
			System.out.println("logout");
		}
	}
	public static void getConnection() {
		System.out.println("network 연결");
	}
}
class GraphicIOS {
	public void draw_textBox() {
		System.out.println("텍스트 상자");
	}
	public void draw_submitButton() {
		System.out.println("전송버튼");
	}

}
class IPhoneMessenger extends GraphicIOS implements Messenger  {//extends를 먼저 기술
	public String getMessage() {
		return "iPhone";

	}

	public void setMessage(String msg) {
		System.out.println("메시지" + msg);
	}
	public void clearMessage() {
		System.out.println("문자열 지우기");
	}

}
class GalaxyMessenger implements Messenger, WorkFile {
	@Override
	public String getMessage() {
		return "galaxy";
	}
	@Override
	public void setMessage(String msg) {
		System.out.println("galaxy 메시지 설정 " + msg);
	}
	@Override
	public void fileUpload() {
		System.out.println("file uploaded");
	}
	@Override
	public void fileDownload() {
		System.out.println("file downloaded");
	}

}
public class 실습_익명클래스 {
public static void main(String[] args) {
	Messenger.getConnection();
	
	IPhoneMessenger iphone = new IPhoneMessenger();
	iphone.setLogin(false);
	GalaxyMessenger galaxy = new GalaxyMessenger();
	iphone.draw_submitButton();
	iphone.draw_textBox();
	galaxy.getMessage();
	galaxy.setMessage("갤럭시");
	Messenger test = new Messenger() {
		public String getMessage() {
			return "test 메시지";

		}
		public void setMessage(String msg) {
			System.out.println("test 메시지: " + msg);
		}
	};
	System.out.println(test.getMessage());
	test.setMessage("익명클래스");
}
}
