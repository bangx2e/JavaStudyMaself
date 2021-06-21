
public class TPC05 {

	public static void main(String[] args) {
		
		int [] a = new int[3];
		a[0] = 10;
		a[1] =20;
		a[2] = 30;
		
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}

}
