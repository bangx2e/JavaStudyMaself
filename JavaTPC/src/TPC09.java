
public class TPC09 {

	public static void main(String[] args) {

		int a = 10;
		int b = 100;
		TPC09 tpc = new TPC09(); //힙 영역에 로딩 
		int v = tpc.sum(a, b); //method 영역안의 none static 영역에 들어감
		System.out.println(v);
	}

	public int sum(int a, int b) {

		int hap = a + b;
		return hap;
	}
}
