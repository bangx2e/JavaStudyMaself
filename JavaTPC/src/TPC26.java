import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {

	public static void main(String[] args) {
		// RemoCon re = new RemoCon(); (인터페이스는 객체 생성 불가능)

		RemoCon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();

//		RemoCon ra = new Radio();
		r = new Radio(); 
		r.chUp();
		r.chDown();
		r.internet();
	}

}
