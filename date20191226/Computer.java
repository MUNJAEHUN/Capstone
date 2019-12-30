package date20191226;
//OOP 형태로 객체를 생성
//OOP 객체가 가진 특성, 행위 등을 프로그래밍화하는 과정
public class Computer {
	
	//멤버변수 (필드)
	int keyboard;
	
	float monitor;
	double mouse;
	double desktop;
	String model;
	
	
	//생성자 : 객체 초기화. 멤버변수 초기화 수행 //삭제시 하나 자동으로 생성해줌 
	Computer(){
		keyboard =11;
		monitor = 17.3f;
		mouse = 3.2;
		desktop =10.2;
	}
	
	
	//HW 4,
	//키보드, 마우스의 파라미터에 대한 오버로딩
	Computer(int keyboard, double mouse){
		this.keyboard=keyboard;
		this.mouse=mouse;
	}
	
	//5번
	Computer(int keyboard,float monitor, double mouse,double desktop,String model){	
		this();
		this.desktop=desktop;
		this.model=model;	
	}
	
	//멤버 메소드

	void 연산() {
		System.out.println("연산을 수행합니다.");
		
	}
	
	void 전원켜기() {
		System.out.println("전원을 켰습니다.");
	}
	void 전원끄기() {
		System.out.println("전원을 껐습니다.");
	}
	void 인터넷하기() {
		System.out.println("인터넷을 하는중입니다.");
	}
	void 코딩하기() {
		System.out.println("코딩. . .");
	}

	public static void main(String[] args) {
		Computer c1= new Computer();
	
		c1.전원켜기();
		System.out.println(c1.monitor);
	}

}

