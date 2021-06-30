import kr.tpc.MemberVO;

public class TPC14 {

	public static void main(String[] args) {
		MemberVO m = new MemberVO();
//		m.name="임찬우";
//		m.age = 50;
//		m.tel="010-1111-1111";
//		m.addr = "인천";

		m.setName("임찬우");
		m.setAge(500);
		m.setTel("010-1111-1111");
		m.setAddr("인천");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.println(m.getAddr()+"\t");
	}

}
