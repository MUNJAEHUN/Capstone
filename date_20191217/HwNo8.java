package date_20191217;


//******
//****
//***
//**
//*     
public class HwNo8 {
	public static void main(String[] args) {
		
		
		//------접근 1 ( 조건절에 5개가 들어가는 경우를 빼는 것 . 한줄의 공백을 없애야함 )
		for (int i=0;i<6;i++) {
			int k=6-i;
			for(int j=1;j<=k;j++) {
				if(k==5) {System.out.print("");}
				else System.out.print('*');		
			}
			System.out.println("");		
		}
		System.out.println("======================");
		//------접근 2 단순히 ******만 표현해주고 나머지만 해결 
		
		System.out.println("******");
		
		for (int i=0;i<4;i++) {
			int k=4-i;
			for(int j=1;j<=k;j++) {
				 System.out.print('*');		
			}
			System.out.println("");		
		}
	}
}
