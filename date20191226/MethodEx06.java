package date20191226;

/*
 * 
 * 소수 출력하기
 * 
 * main()에서 1이상 100이하의 소수를 전부 출력하라.
 * isprimenumber()를 통해 전달된 값이 소수인지 아닌지를 판단하여 반환 
 * 
 * 
 */

public class MethodEx06 {

	public boolean isprimenumber(int x) {
		
		/*
		 * 
		 * //소수 풀이 1
		 * for (int i =2; i<=100; i++) { if( i==2 || i==3 || i==5) { System.out.print(i+
		 * " "); } if (i%5!=0 && i%2!=0 && i%3!=0 && i%7!=0) {
		 * 
		 * System.out.print(i+" "); }
		 * 
		 * }
		 */
		for (int i=2;i<x;i++) {
			if(x%i==0) {
				
				return false;
			}
			
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
//		--풀이 1
		MethodEx06 mt= new MethodEx06();
//		
//		mt.isprimenumber();
		
		for (int i=1;i<101;i++) {
			//System.out.println(i+ " : " +mt.isprimenumber(i));
			if(mt.isprimenumber(i)==true) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
	}
}
