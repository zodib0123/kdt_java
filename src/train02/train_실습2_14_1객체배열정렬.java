package train02;
/*
 * 2장 제출 과제 
 * Comparable 인터페이스의 구현 
 * 5번 실습 - 2장 실습 2-10를 수정하여 객체 배열의 정렬 구현
 */
import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData2 implements Comparable<PhyscData2>{
	String name;
	int height;
	double vision;
	
	public PhyscData2(String name, int height, double vision) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.height = height;
		this.vision = vision;
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getVision() {
		return vision;
	}

	public void setVision(double vision) {
		this.vision = vision;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", height=" + height + ", vision=" + vision + "]";
	}

	@Override
	public int compareTo(PhyscData2 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

}
public class train_실습2_14_1객체배열정렬 {

	public static void showData(String str, PhyscData2[] data) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty() || data == null) {
			return;
		}
		System.out.println(str);
		for (PhyscData2 dt : data) {
			System.out.println(dt.toString());
		}
		
	}
	
	public static void sortData(PhyscData2[] data) {
		// TODO Auto-generated method stub
		if (data == null) {
			return;
		}
		Arrays.sort(data);
	}

	public static int binarySearch(PhyscData2[] data, String str) {
		// TODO Auto-generated method stub
		if (str == null || str.isEmpty() || data == null) {
			return 0;
		}
		int count = -1;
		for (PhyscData2 dt : data) {
			if (dt.getName().equals(str)) {
				count++;
			}
		}
		return count;
	}
	
	public static PhyscData2[] insertObject(PhyscData2[] data, PhyscData2 pData) {
		// TODO Auto-generated method stub
		if (data == null || pData == null) {
			return data;
		}
		return null;
	}
	
	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("홍동", 164, 1.3),
				new PhyscData2("홍길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("이길동", 182, 0.6),
				new PhyscData2("박길동", 167, 0.2),
				new PhyscData2("최길동", 169, 0.5),
		};
		showData("정렬전",data);
		sortData(data);
		showData("정렬후", data);

		Arrays.sort(data);//comparator가 필요하다 
		showData("Arrays.sort() 실행후", data);

		int resultIndex = binarySearch(data, "이길동");
		if (resultIndex >= 0)
			System.out.println("사이다가 존재하면 인덱스 = "+resultIndex);
		else
			System.out.println("사이다가 존재하지 않는다");
		
//		PhyscData2[] newData= insertObject(data, new PhyscData2("소주다", 179, 1.5));
//		//배열의 사이즈를 1개 증가시킨후 insert되는 객체 보다 큰 값들은 우측으로 이동, 사이즈가 증가된 객체 배열을 리턴
//		showData("삽입후", newData);
	}

}
