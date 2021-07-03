import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {

	public static void main(String[] args) {
		//RemoCon으로 TV 클래스를 구동 하시오
		
		RemoCon r = new TV();
		r.chUp();
		
		for (int i=0; i<50; i++) {
			r.chUp();
		}
		for (int i=0; i<80; i++) {
			r.chDown();
		}
		r.internet();
	}

}
