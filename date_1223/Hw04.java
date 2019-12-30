package date_1223;

/*
4. 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하도록 할 생각이다.
변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하시오.
(단 가능한 한 적은 수의 동전으로 거슬러 주어야한다)

  int money = 2680;
*/
//접근1
/*
public class Hw04 {
	public static void main(String[] args) {
		int money = 2680;
		int [] coin = {500,100,50,10};
		int [] n = new int[coin.length];
		for(int i=0; i<coin.length; i++) {
			if(money>=coin[i]) {
				n[i] = money/coin[i];
				money = money%coin[i]; 
			}
			// 2680 = 500*5 + 100 + 50 + 10*3
			System.out.println(coin[i]+"원 짜리 "+n[i]+"개 ");
		}
		
	}
}
*/

//강사님풀이
public class Hw04 {
	public static void main(String[] args) {
		int money = 2680;
		int [] coin = {500,100,50,10};
		System.out.println("투입 된 돈 : " +money);
		
		for(int i=0; i<coin.length; i++) {
			System.out.println("거스름돈 : " + coin[i] + "원 권 " + money/coin[i]);
			money %= coin[i];
		}		
	}
}

	
	
	
	
	
	
	
	
	
	
	