package date_20191216;


import java.util.Scanner;

//제한적인 조건문, if보다 빠른 조건파악 - 직관적이므로 
//키값이 필요함 ( 정수형 이외에도 문자, 열거형도 허용)

public class SwitchEx01 {
	public static void main(String[] args) {
		//1부터 5까지 숫자정보가 생성되면 해당 요일을 영문으로 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키값 입력 : ");
		int key=sc.nextInt();
		String day="";

		/* -- 스스로 풀이  1 
		 * switch(key) {
		 * 
		 * case 1 : { System.out.println("Today is Monday"); break; } case 2 : {
		 * System.out.println("Today is Thusday"); break; } case 3 :{
		 * System.out.println("Today is Wendsday"); break; } case 4 :{
		 * System.out.println("Today is Thursday"); break; } case 5 :{
		 * System.out.println("Today is Friday"); break; } default: {
		 * System.out.println("It is invaild key."); break; } }
		 */
		
		switch(key) {
		
		case 1: 
			day+="Monday";
			break;
		case 2:
			day+="Thusday";
			break;	
		case 3:
			day+="Thusday";// break가 없으면 3인경우 3,4,5,디펄트까지 수행
			break;		
		case 4:
			day+="Thusday";
			break;	
		case 5:
			day+="Firday";
			break;	
		
		default : System.out.println("잘못된입력.");
		
		break;	
		}
		
		System.out.println("Today is "+day);
		
	}//main end
}//class end 
