import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {

	public static void main(String[] args) {

			Animal ani = new Cat();
			ani.eat();//컴파일 시점 -> Animal, 실행시점 -> Cat
			
			Cat c = (Cat)ani;
			c.bark();
			
			//(Cat)보다 ani.bark의 .연산자가 우선순위가 높기때문에 괄호로 우선순위를 잘 잡아줘야 한다.(ani 클래스에는 bark메소드가 없기때문에.)
			((Cat)ani).bark();
			
			
			Object o = new Dog();
			((Dog)o).bark();
	}

}
