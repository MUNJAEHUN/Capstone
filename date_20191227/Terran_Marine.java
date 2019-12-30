package date_20191227;

public class Terran_Marine extends Terran {
	//멤버변수
	int 공격력;
	
	//생성자
	public Terran_Marine() {
		super();				// 부모 클래스의 생성자 실행(사용) 
		this.공격력 = 5;
	}
	
	//멤버메소드
	void 공격하기(Terran t) {
		//매개변수를 Terran(부모 클래스)로 지정하면
		//Terran을 부모로 갖는 모든 자식 클래스를 공격할 수 있음
		
		t.hp -= 공격력;
		System.out.println("탕~!");				
	}

}
