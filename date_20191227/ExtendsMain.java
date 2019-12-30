package date_20191227;
//자식의 내용을 작성하지 않아도 (현재는 주석처리) 
//부모의 변수, 메서드를 상속받아 사용한다. (확장)
public class ExtendsMain {

	public static void main(String[] args) {
		Child ch=new Child();//인스턴스화
		Parent pa=new Parent();
		
		System.out.println("pa.a : "+pa.a);
		pa.method();
		System.out.println("--------------");
		
		System.out.println("ch.a : "+ch.a);//상속받아 표현
		ch.method();	//자식 클래스에 오버라이드를 통해 작성한 프린트문이 출력되게 된다 
						//부모의 메서드에 내용을 추가한 구문 출력
		
		System.out.println("--------------");
		System.out.println("ch.a : "+ch.b);  
		ch.c_method();						 
		
		
	}
	
	
	
	
}
