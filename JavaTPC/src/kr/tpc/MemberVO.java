package kr.tpc;

public class MemberVO {
//	public String name;
//	public int age;
//	public String tel;
//	public String addr;

	private String name;
	private int age;
	private String tel;
	private String addr;

	public MemberVO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>100) {
			System.out.println("나이가 잘못 설정되었습니다");
		return;
		}
		else {
			System.out.println("나이가"+age+"로 설정되었습니다");
			this.age = age;
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
