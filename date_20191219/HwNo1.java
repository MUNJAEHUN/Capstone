package date_20191219;

import java.util.Scanner;

public class HwNo1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("원의 크기를 입력하세요(단 4이상): ");
		int line=sc.nextInt();
		char star='*';
		
		
		
	/*	if(line %2==0) {
			for (int i=1;i<=line;i++) {
				if(i==1 || i==line) {
						 System.out.print(" ");
						for (int j=0;j<line-2;j++) {
							System.out.print("*");
						}
						
				}
				else{
					for (int j=0;j<line;j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			
			}
		}
		if (line %2==1) {*/
			for (int i=1;i<=line;i++) {//줄입력
				if(i==1 || i==line) {//첫줄, 마지막줄 
						 System.out.print(" ");//출력
						for (int j=0;j<line-2;j++) {
						
							System.out.print("*");
						}
						
				}
				else{
					
					for (int j=0;j<line;j++) {
						System.out.print("*");
					}
				}
				System.out.println();
				
			}
		//}

		
	}
				
			
}

