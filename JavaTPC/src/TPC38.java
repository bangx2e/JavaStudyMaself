import java.util.*;

import kr.tpc.BookDTO;

public class TPC38 {

	public static void main(String[] args) {
		
		List<BookDTO> list = new ArrayList<BookDTO>(1); //Object[] --> BookDTO[] 
		list.add(new BookDTO("자바",15000,"임찬우",1000));
		list.add(new BookDTO("자바의 정석",15800,"임찬우",600));
		list.add(new BookDTO("이것이",15000,"임찬우",8000));
		
		for(int i = 0; i< list.size(); i++) {
			Object o  = list.get(i);
			BookDTO vo = (BookDTO)o;
			System.out.println(vo.title + "\t" + vo.price+ "\t" + vo.page+ "\t" + vo.company);
		}
	}

}
