package date_1223;


public class ArrayEx05 {
	public static void main(String[] args) {
//		2차 배열
		
		/*
		 * int[][] m = new int[3][2]; // -> 배열선언
		 * 
		 * System.out.println("m : " +m); System.out.println("m[1][0] : " +m[1][0]);
		 * System.out.println("m[0] : " +m[0]); System.out.println("m.length : "
		 * +m.length); System.out.println("m[0].length : " + m[0].length);
		 */
		
//		전체주석 : ctrl shift /
		
		int[][] m = {{2,7}, {5,10}, {12,7}}; // -> 배열선언 및 초기화.
		
		System.out.println(m[0][0] + " , " + m[0][1]);
		System.out.println(m[1][0] + " , " + m[1][1]);
		System.out.println(m[2][0] + " , " + m[2][1]);
		
		System.out.println("------------------------");
		
//		반복문으로 출력하기
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.print("m[" +i + "][" +j + "]" + " : " + m[i][j] +"  ");
			}
			System.out.println();
		}
		
		
	}
}





