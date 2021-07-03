package kr.poly;

public class Dog extends Animal {
	// 이름,나이,종 : 상태정보

	// 오버라이드(Overriding) //추상 클래스 상속 추상 메소드 구현
	@Override
	public void eat() {
		System.out.println("개가 먹다");
	}

	public void bark() {
		System.out.println("멍멍");
	}

	public Dog() {
		super();
	}
}
