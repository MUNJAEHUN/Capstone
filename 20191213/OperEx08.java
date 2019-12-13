package date_20191213;


//대입연산자
public class OperEx08 {
	public static void main(String[] args) {
	
		int a = 10 ;
		a+=2;
		System.out.println("a : "+a);
		
		
		System.out.println("a+2 : "+ (a+=2)); //10 +2 
		System.out.println("a-2 : "+ (a-=2)); //12 -2 
		System.out.println("a*2 : "+ (a*=2)); 
		System.out.println("a/2 : " + (a /= 2)); /* 대입 연산 수행되며 a값이 계속 변함 */ 
	}
}
