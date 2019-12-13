package date_20191213;


//논리 연산자 && ||
public class OperEx06 {
	public static void main(String[] args) {
	
		boolean bl1,bl2;
		bl1= true;
		bl2= false;
		
		System.out.println("bl1 && bl2 : "+(bl1&&bl2));
		System.out.println("bl1 || bl2 : "+(bl1||bl2));
		
		//비트연산자가 논리연산 가능하다 
		System.out.println("bl1 & bl2 : "+(bl1&bl2)); // true =1 , false=0이므로 1&0 결과 반환 
		System.out.println("bl1 | bl2 : "+(bl1|bl2)); // true =1 , false=0이므로 1|0 결과 반환 
		
		//논리연산자로 비트연산은 안됨
		
		
	}
}
