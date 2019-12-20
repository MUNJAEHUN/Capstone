package date_20191217;

/*
for (초기,조건,증감){
}

*/
public class ForEx03 {
	public static void main(String[] args) {
	//1~16까지 짝수만 출력
		System.out.println("1부터 16까지의 짝수만 출력 ");
		int sum=0;
		//----------------------------스스로 풀이 
		/*for (int i=1;i<=16;i++) {
			if(i%2==0) {	//짝수면  println 기능 수행 
				if(i==16) {
					System.out.print(i);
				}else System.out.print(i+", ");
			}*/
			
		//-----------------------------풀이 
		for ( int i=2;i<=16;i+=2) { // for 문안에 증감부분에는 연산도 가능하다.
			System.out.println(i);
		}
		
		System.out.println("=================================");
		//1부터 9까지 옆으로 출력
		for (int i=1;i<=9;i++) { // for 문에서 선언된 지역변수 (일정구역에서만 작동하는 변수)
			System.out.print(i+" "); 
			
			
			//print 의 종류 : printf,print,println . . 
		}System.out.println("-------------");// print문이 왼쪽의 구문까지 같이 옆으로 출력하게 됨. 바로윗줄빈공간에 print()를 넣으면 해결.//for end
		
		
		//1부터 10까지의 합 출력
		for (int i=1;i<=10;i++) {
			sum+=i;
			
			System.out.println(sum);
			
		}
	}//main end
}//class end
