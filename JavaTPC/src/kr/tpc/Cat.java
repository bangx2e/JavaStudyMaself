package kr.tpc;

public class Cat extends Animal {
	// �̸�, ����, �� : ��������
	@Override
	public void eat() {
		System.out.println("����̰� �Դ´�");
	}
	
	public void night() {
		System.out.println("�㿡 ������ ���� ����.");
	}

	public void bark() {
		System.out.println("�߿�");
	}
}
