package date_1224;

// 1. 임의의 두 정수를 입력받기 - 한 세번?
// 2. 두 수 차의 절대값을 계산하여 출력하는 메소드
// 메소드명 : abs()

public class MethodEx02 {
	
	void abs(int x, int y) {
		if(x>y) {
			System.out.println("두 수의 차 :"+(x-y));
		}
		else {
			System.out.println("두 수의 차 :"+(y-x));
		}
	}
	
	public static void main(String[] args) {
		MethodEx02 a = new MethodEx02();
		a.abs(7, 17);
		a.abs(-20, 60);
		a.abs(9, -37);
	}
}
