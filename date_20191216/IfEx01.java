package date_20191216;

public class IfEx01 {

	public static void main(String[] args) {

		int x = 50;
		int y = 100;
	
		/*
		 * if ( x>50 ){ System.out.println("x는 50보다 큽니다. 현재 x의 값 : "+ x ); }
		 * 
		 * else{ System.out.println("x는 50보다 작습니다 . 현재 x의 값  : "+ x ); }
		 */

		if (x < y) {
			System.out.println("x는 y보다 작습니다.");
		}
		
		
		/*
		 * if (x > y) { System.out.println("x는 y보다 큽니다."); } else{
		 * System.out.println("x는 y보다 작습니다."); }
		 */
		
		
		if (x==y) {
			System.out.println("x와 y가 같습니다.");
		}
		
		else {
			System.out.println("x와 y는 다릅니다.");
		}
	
		  System.out.println("x : "+x+"\t"+"y : "+y);

	}// main end()

}// class end()
