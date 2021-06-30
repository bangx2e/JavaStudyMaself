import kr.tpc.BookDTO;
public class TPC10 {

	public static void main(String[] args) {
		//책(BookDTO) 클래스(자료형:Datatype)를 만들자
		BookDTO b = new BookDTO();
		b.title = "자바책";
		b.price= 17000;
		b.company ="찬우";
		b.page= 500;
		
		System.out.print(b.title);
		System.out.print(b.price);
		System.out.print(b.company);
		System.out.print(b.page);
		
	}

}
