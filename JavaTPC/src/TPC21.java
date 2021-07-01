import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {

	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		
		
	}

}
