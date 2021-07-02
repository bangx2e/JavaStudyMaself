package kr.tpc;

public class Dog extends Animal {
	// 이름,나이,종 : 상태정보
	
	
	public void bark() {
		System.out.println("멍멍");
	}
	//오버라이드(Overriding)
	@Override
	public void eat() {
		System.out.println("개가 먹다");
	}
	
	public Dog() {
		super();
	}
}
