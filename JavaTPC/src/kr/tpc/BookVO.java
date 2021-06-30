package kr.tpc;

// 책 = 제목, 가격, 출판사, 페이지수...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;

	// 디폴트 메소드(기본생성자) 생략
	public BookVO() {
		super();
	}

	// 생성자 오버로딩(중복정의)
	public BookVO(String a, int b) {
		this.title = a;
		this.price = b;
		this.company = "차누쓰";
		this.page = 500;

	}

}
