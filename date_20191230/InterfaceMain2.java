package date_20191230;

public class InterfaceMain2 {
	
	
	
	public static void main(String[] args) {
		InterfaceClass ifc=new InterfaceClass();
		
		ifc.calculate();
		System.out.println(ifc.getStr());
		System.out.println(ifc.NUM);
		
		System.out.println("=====================");
		InterFaceEx01 ife1=new InterfaceClass();  // 인터페이스는 추상이라 new로 생성이 불가능 하지만 InterfaceClass를 통해서 생성이 가능하다.
													//참조변수이므로 오른쪽에 클래스로 생성한 객체를 만들어구현해보면된다.
			ife1.calculate();
	
			System.out.println("=====================");
			InterFaceEx02 ife2=new InterfaceClass();
			System.out.println(ife2.getStr());
			
		};

}

