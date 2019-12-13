package date_20191213;


//비트 연산자  비트끼리 비교하는 연산 
//큰 연산을 수행할 경우 산술보다 빠른 처리가 가능 
public class OperEx05 {
	public static void main(String[] args) {	
	
		byte a,b;
		a=10;
		b=22;
		
		System.out.println("a&b : "+(a&b));
		System.out.println("a|b : "+(a|b));
		
		//논리연산자로 비트연산은 안됨
		
		//System.out.println("a&&b : "+(a&&b));
	}
}

