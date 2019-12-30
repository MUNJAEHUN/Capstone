package date20191226;



public class Society {
	
	public static void main(String[] args) {
		Human h1=new Human();//휴먼 객체를 society에 생성 
		
	
		h1.먹기();
		System.out.println("h1 이름 : "+h1.이름);
		System.out.println(h1);// h1 레퍼런스 주소값 출력 
	
		System.out.println("--------------------");
	
//		Human h2=new Human();
		
		//객체2의 이름바꾸고 싶으면 대입하면된다 -> 지양해야한다. (변수에 직접접근하므로) -> 이것에 대한 해결방법은..?
		//-> 매서드를통해 접근할수있게해야한다  (접근법 : 멤버변수를 통한 접근. 생성자를통한 접근)
		Human h2=new Human("유관순","여"); //기본생성자의 변수를 건들이지 않고 생성자 오버로딩을 통해 이름,성별을 변경
//		h2.이름="신사임당"; // 힙영역의 내용을 변경 
		h2.생각하기();
//		System.out.println("h2 이름 : "+h2.이름);
//		System.out.println(h2);// h1과 이름은 같지만 다른 객체이다 . (동명이인)
		
		System.out.println("h2 이름 : "+h2.이름);
		System.out.println(h2);
		
		Human h3=new Human("갑돌이","남성",178.2);
		h3.걷기();
		System.out.println("h3 이름 : "+h3.이름);
		System.out.println("h3 성별 : "+h3.gender);
		System.out.println("h3 키 : "+h3.키);
		System.out.println("h3의 iq : "+ h3.iq);
		
		System.out.println("==========================");
		
		//this();를 사용한 객체 생성 
		Human h4=new Human("율곡이이","남성",190.3,78,30);
		System.out.println("h4 키 : "+h4.키);
		System.out.println("h4 iq : "+h4.iq); // 적용이안되어있는 파라미터값은 기본 생성자에 초기화 되어있는 값을 리턴
	
	
	}
}
