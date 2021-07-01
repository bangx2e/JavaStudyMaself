package kr.tpc;

public class Cat extends Animal {
	// 이름, 나이, 종 : 상태정보
	@Override
	public void eat() {
		System.out.println("고양이가 먹는다");
	}
	
	public void night() {
		System.out.println("밤에 눈에서 빛이 난다.");
	}

	public void bark() {
		System.out.println("야옹");
	}
}
