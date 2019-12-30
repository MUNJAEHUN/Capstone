package date_1223;

/*
6.
주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서
배열 의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램을 작성하시오
- 주어진 2차원 배열
 int[][] score = {
		{100, 100, 100}
		, {20, 20, 20}
		, {30, 30, 30}
		, {40, 40, 40}
		, {50, 50, 50}
  };

 - 최종 출력
100 100 100 300
 20 20  20  60
 30 30  30  90
 40 40  40  120
 50 50  50  150
240 240 240 720
*/
public class Hw06 {
	public static void main(String[] args) {
		
		int[][] score = {
				{100, 100, 100}
				, {20, 20, 20}
				, {30, 30, 30}
				, {40, 40, 40}
				, {50, 50, 50}
		  };
		
		int[][] score2 = new int[6][4];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score2[i][j] = score[i][j];
			}
		}
	
//		for (int[] is : score2) {
//			for (int is2 : is) {
//				System.out.print(is2+"\t");
//			}
//			System.out.println();
//		}
//		
		
		int rowsum=0;
		int columnsum=0;
				
		for(int i=0; i<score2.length; i++) {
			rowsum = score2[i][0]+score2[i][1]+score2[i][2];
			score2[i][3] = rowsum;
			
			for(int j=0; j<score2[i].length; j++) {
				columnsum = score2[0][j]+score2[1][j]+score2[2][j]+score2[3][j]+score2[4][j];
				score2[5][j] = columnsum;			
				System.out.print(score2[i][j] + "\t");
			}
			System.out.println("");
			
			
		}
		
	}
}
