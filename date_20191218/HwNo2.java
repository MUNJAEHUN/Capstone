package date_20191218;


//2. 1부터 100사이의 정수 중 2 또는 3의 배수가 아닌 수의 합계를 구하시오.
public class HwNo2 {
	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1;i<=100;i++) {
			if(i%2!=0 && i%3!=0) {
				sum+=i;
			}
		}
		System.out.println("2또는 3의 배수가 아닌 수의 합 : "+sum);
	
	}
}
