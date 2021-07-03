package kr.poly;

public interface RemoCon {	//객체 생성X ; RemoCon r = new RemoCon();
	// public abstract(생략) void chUp();
	
	//인터페이스에서는 상수 사용가능
	public static final int MAXCH=100; 
	public static final int MINCH=1;
	//추상 메소드
	public void chUp();
	public void chDown();
	public void internet();
}
