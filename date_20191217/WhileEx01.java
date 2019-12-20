package date_20191217;

//for 보다 같은 반복문
//조건이 for보다 간단하다
public class WhileEx01 {
	public static void main(String[] args) {
	
		//2단 출력
		int i=1;
		int dan =2;
		while(i<10) {
			System.out.println(dan + " * "+ i+" = "+dan*i);
			i++;
		}//while end
		System.out.println("=======================");
		//while의 중첩 , 9단까지의 출력

			while(dan<10) {
				while(i<10) {
					System.out.println(dan +" * "+i+" = "+ dan*i);
					i++; 
				}
				i=1;
				dan++;
			}
	}//main end
}//class end
