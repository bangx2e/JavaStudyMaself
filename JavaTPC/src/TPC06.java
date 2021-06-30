
public class TPC06 {

	public static void main(String[] args) {
		
		//5. 메소드 -> 동작(method) , 기능(function)
		int a=67;
		int b=98;
		
		// a+b=?
		int result =sum(a, b);
		System.out.println(result);
	}
	// 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
	public static int sum(int a, int b) {
			int v = a+b;
			return v;
	}
	
	public static int[] makeArr() {
		int[] a= new int[] {1,2,3};
		return a;
	}
}
