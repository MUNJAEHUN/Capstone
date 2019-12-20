package date_20191216;

public class IfEx03 {
	public static void main(String[] args) {
		
		int num1,num2;
		num1=25;
		num2=-230;
		// 큰값을 구하는 내용 
		
		int big;
		
	
		if (num1 > num2) {
			
			big=num1;
			
			System.out.println("큰 값은 num1 = "+num1+"이며 따라서 big은 "+big+"입니다");
		}
		else {
			
			big=num2;
			
			System.out.println("큰값은 num2 = "+num2+"이며 따라서 big은"+big+"입니다");
		}
		
		System.out.println("=========================================");
		
		
		
		// 두 수의 차이(절대값)를 구하기  ( 절댓값 = 큰수  - 작은수)
		
		//------------------스스로 푼거
		int dif;
		
		if (num1>=num2) {
			
			dif=num1- num2;
			System.out.println(dif);
		}
		else {
			dif=num2-num1;
			
			System.out.println(dif);
		}


		 
		
		
	//	--  삼항 연산자( 절대값들의 차이 
		
	num1=(num1>0)?num1:-num1;
	num2=(num2>0)?num2:-num2;
	if (num1>=num2) {
		
		dif=num1-num2;
		System.out.println(dif);
		
		}
	
	else{
		dif = num2-num1;
		System.out.println(dif);
		}
	
	
	}// main end

	
}// class end 
