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
		
		//다형성(Polymorphism)
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat(); //upcasting (자동 형변환)
		ani.eat();
		
		((Cat)ani).night(); //downcasting(강제 형변환)
		
		
	}

}
