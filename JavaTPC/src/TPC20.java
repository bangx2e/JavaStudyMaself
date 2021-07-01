import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		Animal d = new Dog(); // 자동 형변환(Object Casting -> Upcasting)
		d.eat();

		Animal c = new Cat();
		c.eat();
		((Cat) c).night(); // Downcasting(강제 형변환)
	}

}
