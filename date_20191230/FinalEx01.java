package date_20191230;

		//메모리영역 
//		힙 스택 스태틱
//		스태틱 : 미리 메모리에 올려둘수있는 영역  new선언없이도 올릴수있다.

/* 
 * 	final
 * 
 * 	-클래스 앞 : 상속의 마지막 (상속 불가)
 * 	클래스 조차도 상수로 두기위해.. extends로는 부를수 없게 된다.
 * 
 * 	-메소드 앞 : 마지막 메소드(오버라이드 금지)
 *  -이 메소드는 오버라이드 할  수 없다.(있는 그대로만 사용해라)
 * 
 *  -멤버 변수 앞 : 마지막 변수 (상수)
 * 
 */


class Fruit{
	//사과 , 바나나 , 복숭아를 상수로 정의 	
		
	final static int APPLE = 1; //상수표현
	final static int BANANA = 2;
	final static int PEACH = 3;
	
}

class Company{
	//아마존 구글 애플 정의
	final static int AMAJON=1;
	final static int GOOGLE=2;
	final static int APPLE=3;
}



public class FinalEx01 {
		
	public static void main(String[] args) {
		//과일 분류를 위한 switch
		
		/*
		 * Fruit f= new Fruit();
		 * 
		 * int type=f.APPLE;
		 */
		
		
		
		
		int type = Fruit.APPLE; // 메모리에 올라와있는 APPLE변수를 가져올수있다.
		
		type = Company.APPLE;
		
		//System.out.println(type);
		switch(type) {
		case Fruit.APPLE : System.out.println("사과"); break;
		case Fruit.BANANA : System.out.println("바나나"); break;
		case Fruit.PEACH : System.out.println("복숭아"); break;
		
		}
	}
	
}
