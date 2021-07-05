
public class TPC34 {

	public static void main(String[] args) {

		// String
		String str = new String("임찬우");
		String str1 = new String("APPLE");
		System.out.println(str.toString()); //번지출력(String은 문자열 출력)
		System.out.println(str1.toLowerCase()); //소문자로 변환
		System.out.println(str1.charAt(3)); //'3'번째 글자
		System.out.println(str1.length()); //길이
		System.out.println(str1.indexOf("PL")); //P의 시작점
		System.out.println(str1.replaceAll("P","L")); //매개변수 1번의 글자를 2번의 글자로 변경
	}

}
