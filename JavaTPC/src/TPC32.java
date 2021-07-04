import kr.tpc.Dbconnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC32 {

	public static void main(String[] args) {

		// Oracle, MySQL DB에 접속하기 위해서는 Driver class가 필요
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "chanwoo", "12345");
		
		conn = new JavaMySQL();
		conn.getConnection("url", "root", "56789");
	}

}
