package date20191226;




public class Human {
//멤버변수
	int eye;
	int nose;
	int mouse;
	int iq;
	String gender;
	int age;
	
	double 키;
	double 몸무게;
	
	String 이름;
	
	
//기본생성자 (매개변수 x)
	Human(){
		eye=2;
		nose=1;
		mouse=1;
		iq=430;
		키=185;
		몸무게=75;
		이름="아무개";
		
		System.out.println("생성자 호출. 멤버변수를 정의합니다. ");
	}
	//내 클래스에 접근할 사용자들을 위해 다양한 생성자를갖는 클래스로 작성하는것을 권장한다.
	
	
	//소사이어티 클래스의 객체2의 이름바꾸고 싶으면 대입하면된다 -> 지양해야한다. (변수에 직접접근하므로) -> 이것에 대한 해결방법은..?
		//-> 매서드를통해 접근할수있게해야한다  (접근법 : 멤버변수를 통한 접근. 생성자를통한 접근)	
	
	//생성자 오버로딩을 통한 변수접근
	//이름 성별을 수정할수있는 생성자 오버로딩
	// 이름 : 유관순, 여성
	Human(String 이름,String gender){
		eye=2;
		nose=1;
		mouse=1;
		iq=430;
		키=185;
		몸무게=75;
		
		
		this.이름=이름; //this. > 멤버변수를 표시할때 사용하는 단어 
		this.gender=gender;
	}
	
	//this는 인스턴스의 자기 자신을 의미한다. this.은 주로 필드(전역변수)와 메소드 또는 생성자의 매개변수가 동일할 때 인스턴스 필드임을 명확히 하기 위해 사용
	//[출처] [JAVA/자바] 인스턴스 멤버 및 this의 의미|작성자 JOKER


	//이름,성별,키 수정할수있는 생성자 오버로딩
	Human(String 이름,String gender,double 키){ // 해당 생성자에서 iq를 없애면 society에서 기본생성자의 iq를 출력하게 된다. (iq=0나오겠지)
		eye=2;									//그렇다고 일일이 다 이런 변수들을 작성해야한다고? 아니다 방법이 있다 ,
		nose=1;									//바꾸고 싶은 변수만 바꿔주면 된다 . 어떻게? >>this();
		mouse=1;
		iq=430;
		몸무게=75;

		this.이름=이름;
		this.gender=gender;
		this.키=키;
	}
	
	//this(); 원하는 내용만 작성하고 나머지멤버는 기본생성자값으로 적용된다.
	Human(String 이름,String gender,double 키,double 몸무게,int age){
		//생성자 : 멤버 변수를 초기화 
		//멤버 변수명 = 매개변수명;
		//this.멤버변수명=매개변수명; (권장) 
		
		this(이름, gender, 키); //기본 생성자도 실행하고 이전 생성자 파라미터까지 한번에 실행한다.
		this.키=키;
		this.몸무게=몸무게;
		this.age=age;
	}
	
//멤버메소드
	void 먹기() {
		System.out.println("식사를 합니다.");
	}
	void 자기() {
		System.out.println("수면을 취합니다");
	}
	void 걷기() {
		System.out.println("도로를 걷습니다");
	}
	void 생각하기() {
		System.out.println("생각을 정리합니다.");
	}
	void 코딩하기() {
		System.out.println("코드를 작성합니다.");
	}
	
	public static void main(String[] args) {
		Human hu=new Human();
		hu.생각하기();
	}
	
}
