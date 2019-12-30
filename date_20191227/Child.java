package date_20191227;

public class Child extends Parent{
//	String a= "자식";
//	
//	public void method() {
//		System.out.println(a+" 호출");
//		System.out.println("잔소리하기");
//	}
	
	String b="자식";
	
	public void c_method() {
		System.out.println(b+ " 호출");
		System.out.println("클럽가기");
	}
		
	
//	@Override // 부모로부터 물려받은것을 바꿔쓰겟다는 표시 , jvm이 해당 메서드에 오류생길시 알려주기위한 구문
//	public void method() { //부모 메서드를 작성하여 필요한 내용을 추가하면 된다.
//		System.out.println(b+" 클래스에서");
//		System.out.println("자식은 동생에게 잔소리한다.");
//		
//		
//	}
	
	@Override
	public void method() {
			
		System.out.println(b+" 클래스에서 ");
		// super : 부모를 가르킴
		System.out.println("super.a : "+super.a+ " 변수를 호출");
		System.out.println("자식은 동생에게 잔소리하기");
	}
	
}
