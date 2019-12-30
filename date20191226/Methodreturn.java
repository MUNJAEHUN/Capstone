package date20191226;

/*실행화면
 * 1. 자바
 * 2. A
 * 3. 1000
 * 4. 3.14
 * 5. true
 */

public class Methodreturn {
	
		
	 void Printstr(String str) {
		 System.out.println(str);
	 }
	 
	 String returnStr() {
		
		return "자바";
	}
	
	 char returnChr() {
		return 'A';
	}
	
	 int returnInt() {
		return 1000;
	}
	
	 double returnDub() {
		return 3.14;
	}
	
	 boolean returnbol() {
		return true;
	}
	
	public static void main(String[] args) {
		//인스턴스화  static클래스에서 static이 아닌 메서드(인스턴스)를 호출하기 위한 과정 
		Methodreturn mr= new Methodreturn();
		//mr.returnbol();
		
		mr.Printstr("SW 취업을 위한 정보처리산업기사 취득과정 B형");
		System.out.println("1. "+mr.returnStr());
		System.out.println("2. "+mr.returnChr());
		System.out.println("3. "+mr.returnInt());
		System.out.println("4. "+mr.returnDub());
		System.out.println("5. "+mr.returnbol());
		
	} 
	
	
	
}
