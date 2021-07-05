
public class TPC35 {

	public static void main(String[] args) {

		String str1 = new String("APPLE"); //힙 영역에 새로 생성
		String str2 = new String("APPLE");

		if (str1 == str2) {
			System.out.println("(str1==str2)의 결과 : 결과주소가 같다");
		} else {
			System.out.println("(str1==str2)의 결과 : 결과주소가 다르다");
		}

		if (str1.equals(str2)) {
			System.out.println("(str1==str2)의 결과 : str1과 str2의 문자열 내용이 같다");
		} else {
			System.out.println("(str1==str2)의 결과 : str1과 str2의 문자열 내용이 다르다");
		}

		System.out.println();

		String str3 = "apple"; //상수(리터럴)풀 안에 저장된다
		String str4 = "apple";

		if (str3 == str4) {
			System.out.println("(str3==str4)의 결과 : 결과주소가 같다");
		} else {
			System.out.println("(str3==str4)의 결과 : 결과주소가 다르다");
		}

		if (str3.equals(str4)) {
			System.out.println("(str3==str4)의 결과 : str1과 str2의 문자열 내용이 같다");
		} else {
			System.out.println("(str3==str4)의 결과 : str1과 str2의 문자열 내용이 다르다");
		}
		System.out.println();

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
