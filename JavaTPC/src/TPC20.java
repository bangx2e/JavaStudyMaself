import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
		Animal d = new Dog(); // �ڵ� ����ȯ(Object Casting -> Upcasting)
		d.eat();

		Animal c = new Cat();
		c.eat();
		((Cat) c).night(); // Downcasting(���� ����ȯ)
	}

}
