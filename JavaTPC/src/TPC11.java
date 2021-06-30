import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		// 책 1권을 저장하기 위해 객체를 생성하시오.
		BookVO b = new BookVO();
		b.title ="자바쓰";
		b.price=20000;
		b.company = "차누쓰";
		b.page = 900;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.print(b.page+"\t");
		
		
	}

}
