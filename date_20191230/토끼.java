package date_20191230;

public class 토끼 extends 포유류 { // 부모가 행위가 없으므로 오버라이드를 사용하지않으면  extends를 사용할수없다.

	int 귀;
	
	
	
	@Override
	public void 먹기() {
		// TODO Auto-generated method stub
		System.out.println("토끼, 배추를 먹다");
	}

	@Override
	public void 자기() {
		// TODO Auto-generated method stub
		System.out.println("그만자");
	}

	@Override
	public void 태생() {
		// TODO Auto-generated method stub
		System.out.println("새끼를 낳는다.");
	} 
	
	public void 점프() {
		System.out.println("깡 총 깡 총");
	}

}
