import kr.inflearn.ObjectArray;
import kr.tpc.*;

public class TPC37 {
	public static void Main(String[] args) {
		ObjectArray arr = new ObjectArray(5);
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		
		for(int i =0; i<arr.size();i++) {
			Object o = arr.get(i);
			if(o instanceof A) {
				((A)o).go();
			} else {
				((B)o).go();
			}
		}
	}
}
