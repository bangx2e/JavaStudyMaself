package kr.tpc;

public class Dog extends Animal {
	// �̸�, ����, �� : ��������
	
	
	public void bark() {
		System.out.println("�۸�");
	}
	//������(Overriding)
	@Override
	public void eat() {
		System.out.println("�������� �Դ´�");
	}
}
