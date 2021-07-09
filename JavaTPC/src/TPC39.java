
public class TPC39 {

	public static void main(String[] args) {

		int a = 1;
		Integer b = new Integer(1); // Wrapper Class의 원래 문법
//		Integer b = 1; // Boxing 기법
		System.out.println(b.intValue());
		System.out.println(b.toString());

		Object[] obj = new Object[3];
		// 1, 2, 3
//		obj[0] = new Integer(1);
//		obj[1] = new Integer(2);
//		obj[2] = new Integer(3);
		obj[0] = 1;
		obj[1] = 2;
		obj[2] = 3;

		System.out.println(obj[0].toString());
		System.out.println(obj[1].toString());
		System.out.println(obj[2].toString());
		System.out.println();
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);

		// "100"+"100" = 200
		String x = "100";
		String y = "100";
		int v1 = Integer.parseInt(x);
		int v2 = Integer.parseInt(y);
		System.out.println(v1 + v2); //200
		
		// 100 + 100 = "100100"
		
		String s1 = String.valueOf(v1);
		String s2 = String.valueOf(v2);
		System.out.println(s1+s2);
	}

}
