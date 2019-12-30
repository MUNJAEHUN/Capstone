package date_1224;

/*
	실행
	1.A
	2.1000
	3.10.5
	4.false
	
*/

public class MethodEx03 {
	void printChar(char ch) {
		System.out.println("1. " +ch);
	}
	void printInt(int a) {
		System.out.println("2. " +a);
	}
	void printDouble(double b) {
		System.out.println("3. " +b);
	}
	void printBoolean(boolean c) {
		System.out.println("4. " +c);
	}
	
	public static void main(String[] args) {
		MethodEx03 me3 = new MethodEx03();
		me3.printChar('A');
		me3.printInt(1000);
		me3.printDouble(10.5);
		me3.printBoolean(false);
	}
	
}




















