package date_20191219;

import java.util.Scanner;

public class HwNo2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. (단 홀수 , 양수만 입력) :");
		int line = sc.nextInt();
		
		//마름모
		
		if(line%2==0 ||line<0) {System.out.println("잘못된 입력입니다. 다시 입력하세요. ");}
		
		if(line%2==1) {
			
			
			for (int i=0;i<line;i+=2) {//줄 수 입력
				for (int j=line;j>=i;j-=2) {
					System.out.print(" ");
				}
				for (int k=0;k<=i;k++) {
					System.out.print('*');
				}
				System.out.println();
			
			}				
			for (int m=0;m<line-2;m+=2) {  //줄 
				System.out.print(" ");  // 기본 공백 1 회 
				for (int n=0;n<=m;n+=2) { // 추가 공백 n회 
					System.out.print(' ');
				}
				
						
				for (int o=line-2;o>m;o--) {
					System.out.print('*');
				}
				System.out.println();
				
			}
				
				
				
			
		}//if 
		
		
		
	}//main
}//class
