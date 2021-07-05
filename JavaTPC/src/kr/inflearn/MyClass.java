package kr.inflearn;

//접근제한자가 없을경우 default 접근 제한자
public class MyClass {
	public int sum(int a , int b) {
		
		int hap = 0;
		for(int i=a; i<=b;i++) {
			hap+=i;
		}
		return hap;
	}

}
