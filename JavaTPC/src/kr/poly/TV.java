package kr.poly;

public class TV implements RemoCon {
	int currCh=70;
	@Override
	public void chUp() {
		if(currCh<RemoCon.MAXCH) {
			currCh++;
			System.out.println("TV의 채널이 올라간다."+currCh);
		} else {
			currCh = RemoCon.MINCH;
			System.out.println("TV의 채널이 올라간다."+currCh);
		}
	}

	@Override
	public void chDown() {
		if(currCh>RemoCon.MINCH) {
			currCh--;
			System.out.println("TV의 채널이 내려간다."+currCh);
		} else {
			currCh=RemoCon.MAXCH;
			System.out.println("TV의 채널이 내려간다."+currCh);
		}

	}

	@Override
	public void internet() {
		System.out.println("TV가 인터넷에 접속한다.");

	}

}
