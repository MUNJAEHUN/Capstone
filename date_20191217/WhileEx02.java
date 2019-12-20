package date_20191217;

public class WhileEx02 {
	public static void main(String[] args) {
		//1부터 100까지의 합
		
		int i, sum, j;
		i=1; j=1;
		sum=0;
		
		while(i<101) {
			sum+=i;	
			i++;
		}
		System.out.println("1부터 100까지의 합 : "+sum);
		
		System.out.println("------------------------------------");
		
		//1부터 100까지 출력, 100부터 1까지 출력 ( do while )
		
		
		while(j<=100) {
			
			System.out.print(j+",");
			j++;
		}//while end
		
		System.out.println("");
		
		
		do {
			System.out.print(j-1+",");
			j--;
		}while(j>1);
	}//main end	
}//class end 
