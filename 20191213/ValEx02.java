package date_20191213;

public class ValEx02 {
	public static void main(String[] args) {
		byte b2=127;
		
		System.out.println("b2 :"+b2);
		System.out.println("-----------------------------------");
		
		byte b1=10;
		byte b3=20;
		
//		b2=(b1+b3); 
//		java -> int 이하의 연산에서는 모두 int로 자동변환하여 계산  -> 현재 b2 -> byte 이므로 형변환하거나 새 변수 선언 
		int c =b1+b3;
		
		System.out.println("c :"+ c);
		
		c = b1;
		//b1 =c; <- 자료형 차이때문에 불가 
		b1=(byte) c; // 강제 형변환 
		System.out.println("c : "+	c);
		System.out.println("b1 :"+b1);

		int num=(int)3.15;
		System.out.println(num);
		
	}
}
