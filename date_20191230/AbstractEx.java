package date_20191230;

abstract class AA{
	void aaa() {
		System.out.println("클래스 aaa method");
	}
	
	abstract void aaaa();
}


class BB extends AA{

	@Override
	void aaaa() {
		// TODO Auto-generated method stub
		System.out.println("bb클래스 - 추상메소드 오버라이드한 aaaa 메서드");
	}
	
	void bb() {
		System.out.println("BB 클래스의 bb메소드 ");
	}
	
	
}

class CC extends AA{

	@Override
	void aaaa() {
		// TODO Auto-generated method stub
		System.out.println("CC클래스 - 추상메소드 오버라이드한 aaaa메소드");
	}
	
	void ccc() {
		System.out.println("CC클래스의 ccc 메소드 ");
	}
}





public class AbstractEx {
	public static void main(String[] args) {
		//AA a=new AA(); // 추상클래스는 인스턴스화 사용 못함
		
		System.out.println("-------------------");
		BB b=new BB();
		b.bb();
		b.aaaa();
		b.aaa();
		
	}
}
