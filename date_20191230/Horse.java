package date_20191230;

public class Horse extends 포유류 implements Flyable{ //인터페이스 다중상속 implements
	
	
	@Override
	public void 먹기() {
	System.out.println("말, 당근을 먹는다.");	
	}
	
	@Override
	public void 자기() {
		
	}
	
	@Override
	public void 태생() {
		
	}
	
	public void 달리기() {
		System.out.println("이랴이랴 달린다");
	}

	@Override
	public void 비행() {
		// TODO Auto-generated method stub
		System.out.println("세상에 말이 날아다니네");
	}

	
	
}
