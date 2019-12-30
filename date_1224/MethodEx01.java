package date_1224;
// 임의의 두 정수를 받아서 사칙연산을 출력하는 메소드를 작성
// 단 나눗셈의 몫과 나머지는 따로 출력하기
// 메소드명 : operMethod()

public class MethodEx01 {
	void operMethod(int a, int b) {
		System.out.println("덧셈 : "+(a+b));
		System.out.println("뺄셈 : "+(a-b));
		System.out.println("곱셈 : "+(a*b));
		System.out.println("나눗셈 : "+(a/b));
		System.out.println("나머지 : "+(a%b));
	}
		
	public static void main(String[] args) {
		MethodEx01 me1 = new MethodEx01();
		me1.operMethod(50, 4);
		System.out.println("--------------");
		me1.operMethod(10, 10);
		
	}
}
