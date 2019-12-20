package date_20191217;

public class WhileBasic {
	public static void main(String[] args) {
		
		//for
		System.out.println("===   9단	(for)===");
		for(int i=0;i<=8;i++) {
			System.out.println("9 * "+(i+1)+" = "+9*(i+1));
		}//for end
		
		System.out.println("=========while===========");
		//while
		int i=1;
		while(i<10) { //i->10될때까지 루프 수행
			System.out.println("9 * "+i+" = "+9*i);
			i++;
		}
		
		
		//do while
		int j=1;
		do {
			System.out.println(9*j);
			j++;
		}while(j<=9);
		
		
	}
}
