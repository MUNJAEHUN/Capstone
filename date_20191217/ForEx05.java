package date_20191217;

public class ForEx05 {
	public static void main(String[] args) {
		//다음식을 만족하는 a와 b의 조합을 모두 구하세요 
		// a   b
		//+b   a
		//---------
		// 9   9
		
		int i,j;
		System.out.println("위 식을 만족하는 조합 출력 ");
			for( i=1;i<=8;i++) {
				for(j=8;j>0;j--) {
					
				
				  if((i+j)==9) {
						System.out.println(i+" , "+j);
				  }//if end
				}//for2 end  
			}//for1 end 
			
		
			
			
	}//메인 엔드
}//클래스 엔드

