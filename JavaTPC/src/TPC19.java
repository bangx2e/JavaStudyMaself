import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

	public static void main(String[] args) {
		// Dog, Cat --> Animal 상속
		Dog d = new Dog();
		d.eat();

		Animal ani = new Cat();
		ani.eat();

		// Dog.java 파일 없이 Dog.class(바이트코드)만 있을경우
		// Dog dd = new Dog();
		
	}

}
