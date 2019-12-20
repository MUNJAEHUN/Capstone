package date_20191217;

public class WhileEx03 {
	public static void main(String[] args) {
		//1000 이하의 정수중 2의배수면서 7의 배수인 숫자 출력
		//----------스스로-풀이
	int sum=1; 
	int i=0;
	int sum2=0;	
		while(sum<=1000) {
			i++;
			sum=14*i;
				if(sum<=1000) {
					sum2+=sum;
					System.out.println(sum);
				}
		}
	sum=0;
	System.out.println("2의 배수이며 7의 배수인 숫자들의 합 : "+sum2);
	
	
//-------------------강사님 풀이  
	
	
	int x=1; int sum3=0;
		while(x<=1000) {
		//2의 배수ㅇ이며 7의 배수인 숫자들 모두 추출
			if(x%2==0 && x%7==0) {
			System.out.println(x);
			// 그 숫자들을모두 더하기 
			sum3+=x;
			}
			x++;
		}
		System.out.println("14의 배수인 수들의 합 : " +sum3);
	}//main
}//class
