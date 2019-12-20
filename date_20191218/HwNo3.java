package date_20191218;

//3. 두개 주사위를 던졌을때 합이 4가 되는 모든 경우의수를 출력하는 프로그램을 작성하시오. 13 22 31
public class HwNo3 {
	public static void main(String[] args) {
		int []dice={1,2,3,4,5,6};
		int []dice2={1,2,3,4,5,6};
		
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (dice[i]+dice2[j]==4) {
					System.out.println(dice[i]+" , "+dice2[j]);
				}
			}			
		}
		
	}
}
