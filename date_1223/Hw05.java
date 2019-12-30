package date_1223;

/*
5. 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼‘*’
을 찍어서 알려주는 프로그램을 생성할 생각이다. 구현해보시오

int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
*/

//접근1
/*
public class Hw05 {
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] num = {0,0,0,0};
		for(int i=0; i<answer.length; i++) {
			if(answer[i]==1) {
				num[0]++;				
			}
			else if(answer[i]==2) {
				num[1]++;
			}
			else if(answer[i]==3) {
				num[2]++;
			}
			else{
				num[3]++;
			}		
		}
		
		for(int j=0; j<num.length; j++) {
			System.out.print((j+1)+ " -> "); //여기는 굳이 안써도댐
			
			for(int k=0;k<num[j];k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/

//강사님 풀이
public class Hw05 {
	public static void main(String[] args) {
		int [] answer = {1,4,4,3,1,4,4,2,1,3,2};
		
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
	
	
	
	

