package date_1223;

/*
1. 컴퓨터가 3자리 정수를 랜덤하게 생성
2. 각각 자리수에 수(0~9)가 서로 일치하지 않는지 검사
3. 사용자로부터 입력값 받기 - 3자리 정수
4. 사용자가 입력한 값과 컴퓨터가 생성한 값을 비교
	-> 자리값과 숫자가 모두 일치하는지 비교
	-> 자리값과 숫자가 모두 일치-> 1S 증가
	-> 다른자리에서 일치하면 1B을 증가
5. 판정 결과를 화면에 출력
6. 3S가 되면 경기를 종료, 아니면 반복.
*/

import java.util.Scanner;
public class ArrayBaseBall {
	public static void main(String[] args) {
		//1. 컴퓨터가 3자리 정수를 랜덤하게 생성
		int[] compnum = new int[3];
		
		//2. 각 자리수에 수가 서로 일치하지 않는지 검사
		boolean flag = true;
		
		while(flag ) {
			compnum[0] = (int)(Math.random()*10);
			compnum[1] = (int)(Math.random()*10);
			compnum[2] = (int)(Math.random()*10);
			
			if(compnum[0]!=compnum[1] && compnum[1]!=compnum[2] && compnum[2]!=compnum[0]) {				
			flag = false;
			}
//			System.out.println("" + compnum[0]+ compnum[1]+ compnum[2]);
		}//while flag 끝
		
		boolean flag2 = true;
		int count = 0;
		
		while(flag2) {
			//3. 사용자로부터 입력값 받기.
			count ++;
			Scanner sc = new Scanner(System.in);
			System.out.println("3자리 정수를 입력하세요 : ");
			int num = sc.nextInt();
			
			System.out.println("사용자가 입력한 값 : " + num);
			
			//4. 사용자가 입력한 값과 컴퓨터가 생성한 값을 비교
			
			int[] usernum = new int[3];
			usernum[0] = num/100;
			usernum[1] = (num%100)/10;
			usernum[2] = num%10;
			
			int strike = 0;
			int ball = 0;
			
			for(int i=0; i<3; i++) {
				if(compnum[i] == usernum[i]) {
					strike++;
				}
				else {
					for(int j=0; j<3; j++) {
						if(compnum[j] == usernum[i]) {
							ball ++;
						}
					}
				}
			}
			//5. 판정 결과를 화면에 출력하기
			System.out.println(strike + " strike, " + ball + " ball");	
		
		
		
		//6. 3S가 되면 경기 종료, 아니면 반복
		
			if(strike==3) {
				flag2 = false;
			}
		} // while(flag2) end
		System.out.println("와우~ " + count + " 번 만에 맞추셨습니다.");		
	}
}
