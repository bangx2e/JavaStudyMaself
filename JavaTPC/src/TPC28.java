import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		System.out.println(a); //Object --> toString() : kr.poly.A@1f7030a6
		System.out.println(a.toString());
		
		Object o = new A();
		((A)o).display(); //upcasting
		System.out.println(o);
	}

}
