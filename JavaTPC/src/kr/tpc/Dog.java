package kr.tpc;

public class Dog extends Animal {
	// 이름, 나이, 종 : 상태정보
	
	
	public void bark() {
		System.out.println("멍멍");
	}
	//재정의(Overriding)
	@Override
	public void eat() {
		System.out.println("강아지가 먹는다");
	}
}
