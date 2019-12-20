package date_20191218;

import java.util.Scanner;

/*6. 화페교환기
사용자로부터 숫자를 입력받아  화면에 몇장으로 교환가능한지 메세지를 출력하시는 코드를 작성하시오*/


public class HwNo6 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("금액을 입력하세요 : ");
		int num=sc.nextInt();
		int jang=0;
		int money=num;
		
		
		//--스스로 풀이 
//		/*jang=num/50000;
//		System.out.print("5만원 : "+jang+ "장  ");
//		money=money-(jang*50000);
//		System.out.println("잔돈 :"+money+ "원");
//		jang=0;
//		
//		jang=money/10000;
//		System.out.print("만원 : "+jang+ "장  ");
//		money=money-(jang*10000);
//		System.out.println("잔돈 : "+money+ "원");
//		jang=0;
//		
//		jang=money/5000;
//		System.out.print("5천원 : "+jang+ "장  ");
//		money=money-(jang*5000);
//		System.out.println("잔돈 : "+money+ "원");
//		jang=0;
//		
//		jang=money/1000;
//		System.out.print("천원 : "+jang+ "장  ");
//		money=money-(jang*1000);
//		System.out.println("잔돈 : "+money+ "원");
//		jang=0;
//		
//		jang=money/500;
//		System.out.print("5백원 : "+jang+ "개  ");
//		money=money-(jang*500);
//		System.out.println("잔돈 : "+money+ "장");
//		jang=0;
//		
//		jang=money/100;
//		System.out.print("백원 : "+jang+ "개  ");
//		money=money-(jang*100);
//		System.out.println("잔돈 : "+money+ "장");
//		jang=0;*/
		
		
		
		int i =50000;
		int cnt;
		int sw=0;
		for(int j=0;j<8;j++){ //화폐 종류가 10종류이므로 10번 반복

			cnt = num/i;  //금액을 단위로 나누어 몇 매인지 계산

			System.out.println(i+"원 권 "+cnt+"매"); //출력

			num = num-(cnt*i); //금액에서 (단위*매수)만큼 제함

			if(sw==0){ //5로 시작하는 단위일 경우 5로 나누어 앞자리를 1로

				i=i/5;

				sw=1;

			}else{       //1로 시작하는 단위일 경우 2로 나누어 앞자리를 5로

				i=i/2;

				sw=0;
			}
		}



	}//main
}//class
