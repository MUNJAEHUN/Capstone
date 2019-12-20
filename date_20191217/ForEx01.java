package date_20191217;

import java.io.IOException;
import java.util.Scanner;


public class ForEx01 {
	public static void main(String[] args) throws IOException{
		//사용자로부터 숫자를 받아 해당 구구단을 출력 
		
		/*	System.out.print("숫자를 입력하세요 : ");
		Scanner sc= new Scanner(System.in);
		int dan=sc.nextInt();
			System.out.println("-------"+dan+"단 출력하기 ------- ");
		for (int i=1;i<=9;i++)
			{
			System.out.println(dan+ "*" + i +" = "+ (dan*i));
			}*/
	
		//--접근 2 System.read()
		System.out.print("숫자를 입력하세요 :  ");
		int dan2 =System.in.read();
		//System.out.println(dan2);//> 55로 출력되는데 이는 아스키값으로 출력되는 System.in.read()때문이다
		
		dan2-=48;
		System.out.println(dan2);// 47만큼의 차이를 빼줌으로써 입력값=출력값 일치시켜줌.
		System.out.println("-------"+dan2+"단 출력하기 ------- ");
		for (int i=1;i<=9;i++)
			{
			System.out.println(dan2+ "*" + i +" = "+ (dan2*i));
			}
		
	}//main end
}//class end 
