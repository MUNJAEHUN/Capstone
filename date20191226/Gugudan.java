package date20191226;
//3단만 출력해보세요 -- OOp형태
//g.print();로
public class Gugudan {
	//멤버변수
	int dan;
	//생성자
	Gugudan(){
		dan=3;
	}
	//멤버 메소드
	void print() {
		System.out.println("3단 출력");
		for (int i =1;i<10;i++) {
			System.out.println("3  *  "+i+" = "+dan*i );
		}
		
	}
	
	public static void main(String[] args) {
		Gugudan g=new Gugudan();
		g.print();
	}
}
