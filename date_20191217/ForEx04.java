package date_20191217;

public class ForEx04 {
public static void main(String[] args) {
		/*
		 * //1. 구구단 출력 
		 * for(int i=1; i<=9; i++) {
		 *  for(int j=1; j<=9; j++) {
		 *  
		 *   System.out.println( i+ " * " + j + " = " + (i*j));
		 *  }
		 *   }
		 * System.out.println("==================================================");
		 * //2. 짝수단 출력 for(int i = 2; i<= 8; i+=2) {
		 * 	 	for(int j=1; j<=9; j++) {
		 * 		System.out.println( i+ " * " + j + " = " + (i*j)); 
		 * 		} 
		 * }
		 * System.out.println("==================================================");
		 * //3. 2단은 2*2까지 ~~~~~~8단은 8*8까지 
		 *	 for(int i = 2; i<= 8; i+=2) { 
		 * 		for(int j=1;j<=i; j++){
		 *  	 System.out.println( i+ " * " + j + " = " + (i*j));
		 *   	} 
		 * }
		 */
		
	
	System.out.println("-----------------------");
	
	for (int i=2;i<=9;i++)
		for(int j=1;j<=9;j++) {
			if(i%2==0 && i==j) {
				System.out.println(i+" * "+j+" = ");
				
			}
		}
	}
}

