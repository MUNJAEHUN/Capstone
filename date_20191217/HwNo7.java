package date_20191217;


import java.util.Scanner;


public class HwNo7 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("몇줄 출력 ? :");
		int input=sc.nextInt();
		
		for (int i=0;i<input;i++) {
		  for (int j=0;j<=i;j++) {
			  System.out.print('*');
		  }
		System.out.println("");	
		}
		
	}
}
