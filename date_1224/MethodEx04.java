package date_1224;
/*
	실행
	자바
	자바 A
	자바 A
	자바 A 1000
	자바 A 1000 10.5
	자바 A 1000 10.5 true
*/
	//한 클래스 (객체) 내에서 매개변수가 다르면, 메소드명이 같아도 괜찮다.

	// method overloading
//	 : 하나의 이름이지만 다양한 상황에서 동작하게 하는 기능
//	 : method 이름은 같게 하고 매개변수 타입, 이름, 순서, 개수를 다르게 하면 됨
//	 : 
public class MethodEx04 {
	void print(String str) { 
		System.out.println(str);
	}
	void print(String str, char ch) {
		System.out.println(str + " " + ch);
	}
	void print(String str, char ch, int a) {
		System.out.println(str + " " + ch + " " + a);
	}
	void print(String str, char ch, int a, double b) {
		System.out.println(str + " " + ch + " " + a + " " + b);
	}
	void print(String str, char ch, int a, double b, boolean c) {
		System.out.println(str + " " + ch + " " + a + " " + b + " "+ c);
	}	
	
	public static void main(String[] args) {
		MethodEx04 p = new MethodEx04();
		p.print("자바");
		p.print("자바",'A');
		p.print("자바",'A',1000);
		p.print("자바",'A',1000, 10.5);
		p.print("자바",'A',1000, 10.5, true);
		System.out.println("-------------------------");
		System.out.println("자바");
		System.out.println('A');
		System.out.println(1000);
		System.out.println(10.5);
		System.out.println(true);
		
	}
}
