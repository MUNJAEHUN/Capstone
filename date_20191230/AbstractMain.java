package date_20191230;

public class AbstractMain {
	public static void main(String[] args) {
		//포유류 po=new 포유류(); //추상클래스는 실체화 될수없으므로 인스턴스화 할수없다. (에러발생)
		// 그럼 추상클래스를 어케 받아오냐
		
		토끼 r=new 토끼();
		고래  w=new 고래();
		다람쥐 s=new 다람쥐();
		말 h=new 말();
		
		r.먹기();
		w.헤엄치기();
		s.나무오르기();
		h.달리기();
	}
}
