import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

	public static void main(String[] args) {
		// Dog, Cat --> Animal ���
		Dog d = new Dog();
		d.eat();

		Animal ani = new Cat();
		ani.eat();

		// Dog.java ���� ���� Dog.class(����Ʈ�ڵ�)�� �������
		// Dog dd = new Dog();
		
	}

}
