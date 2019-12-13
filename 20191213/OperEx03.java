package date_20191213;

//시프트 연산자  

//암호화 등에 활용
public class OperEx03 {
	public static void main(String[] args) {
	
		byte b = 10; // 0000 1010
		
		// >> 최상단 비트 0이면 0, 1이면 1로 들어옴
		// >>>는 비트값과 관계없이 0으로 들어옴 
		
		System.out.println("b >> 2 : "+(b>>2)); // 0000 0010
		System.out.println("b << 2 : "+(b<<2)); // 0010 1000
		
	}
}



			
				