package date_20191217;

import java.util.Scanner;

public class HwEx10 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("몇단? ");
		
		int num=sc.nextInt();
		
		System.out.println(num+"단 출력------");
		
		for (int i=1;i<=9;i++)
			System.out.println(num+" * "+i+" = "+ num*i);
	}
}
