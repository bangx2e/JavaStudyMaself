import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.

		int a;
		a = 10;

		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b;
		b = new Book();
		b.title = "책제목";
		b.company = "차누컴퍼니";
		b.price = 15000;
		b.page = 700;

		System.out.print(b.title + "\s");
		System.out.print(b.company + "\s");
		System.out.print(b.page + "\s");
		System.out.println(b.price + "\s");

		PersonVO p;
		p = new PersonVO();
		p.age = 20;
		p.name = "임찬우";
		p.weight = 68.4f;
		p.height = 175.1f;
		
		System.out.print(p.age+"\s");
		System.out.print(p.name+"\s");
		System.out.print(p.weight+"\s");
		System.out.print(p.height+"\s");
	}

}
