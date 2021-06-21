public class TPC08 {
	public static void main(String[] args) {
		int a = 30;
		int b = 30;
		int hap = add(a,b); // static method 호출(static method는 폰트가 기울어짐)
		System.out.println(hap);

	}
	
	// stack 영역에 로딩
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
