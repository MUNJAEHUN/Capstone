package date_20191213;

//식별자 
// 1. 정수형  - byte short int long 
public class VarEx01 {
	public static void main(String[] args) {
		System.out.println();
		 //변수 : 데이터를 저장,참조를 위해 메모리에 공간을 할당하는 그릇
		
		//변수 사용 : 식별자 변수명 ;
		byte b1; // -128~127 까지 
		// short (-2^16-1)~(2^16-1)-1
		
		//초기화
		b1= 12;
		System.out.println("b1의 값은 "+b1+"입니다");
		
		//선언
		short s1;
		// (-2^15-1)~(2^15-1) =-32768~32767
		
		s1=32767;
		
		System.out.println("s1의 값은"+s1+"입니다.");
		
		int it; // -2^31~2^31-1 =-2,147,483,648‬~2,147,483,647‬
		it=2147483646;
		
		long lo;// -9223372036854775808 ~ 9223372036854775807
		lo=999999999;
		
		System.out.println(it);
		System.out.println(lo);
		// 상수
		
		long LO2;  // 대문자로 변수명을 선언하면 상수
		LO2=20311811884L;
		System.out.println(LO2);
				
	}
}
