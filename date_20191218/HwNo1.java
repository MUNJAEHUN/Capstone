package date_20191218;

import java.util.Scanner;

/*1. 사용자로부터 입력받은 값이 3의 배수인지 아닌지 출력
ex1) 입력: 9
9는 3의배수입니다.
ex2) 입력: 7
7은 3의배수가 아닙니다.
*/
public class HwNo1 {
	public static void main(String[] args) {	
	
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 :");
		int val=sc.nextInt();
		
		if(val%3==0) {
			System.out.println(val+"은 3의 배수입니다.");
		}else System.out.println(val+"은 3의 배수가 아닙니다.");
	}
}

