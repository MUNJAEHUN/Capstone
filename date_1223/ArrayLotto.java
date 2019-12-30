package date_1223;

//로또번호 45개 중 6개를 랜덤하게 추출해보기

public class ArrayLotto {
	public static void main(String[] args) {
		
		int[] rnd = {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
				41, 42, 43, 44, 45
				};
		
		/*
		 * 0.0 < Math.random(); < 1.0 : double type 값으로 출력된다.
		 * 0.0 < Math.random()*10 < 10.0 : double type
		 * 0.0 < Math.random()*45 < 45.0 : double type
		 * 
		 * 정수값을 얻도록 하려면?
		 * 0 <= (int)Math.random()*45 < 45 : int type 값
		 * 
		 */
		
//		System.out.println((int)(Math.random()*45));
		
//		for(int i=0; i<6; i++) {
//			System.out.println((int)(Math.random()*45));
		 // 그냥 출력문을 쓰게되면 중복이 가능한 문제와 0이출력되는 문제와 45가 출력이 안되는 문제가 있다.
		  // 따라서 (int)(Math.random()*45)를 배열rnd의 인덱스번호로 사용해야 한다.
				
		//중복을 제거하면서 6개의 번호를 추출
		
		for(int i=0; i<1000; i++) {
			int first = (int)(Math.random()*45);
			int second = (int)(Math.random()*45);
			int temp = 0;
			temp = rnd[first];
			rnd[first] = rnd[second];
			rnd[second] = temp;
		}
		for(int i=0; i<6; i++) {
			System.out.print(rnd[i] + " ");
		}		
		
	}
}
