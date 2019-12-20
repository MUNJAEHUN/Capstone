package date_20191216;

import java.util.Scanner;

//학점을 구하는 스위치문
public class SwitchEx02 {
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("당신의 학점을 입력하세요 : ");
		int score=sc.nextInt();
		/* ------------------스스로 풀이 
		 * switch(score/10){
		 * 
		 * case 10: case 9 : System.out.println("당신의 학점은 A 입니다");break; case 8 :
		 * System.out.println("당신의 학점은 B 입니다");break; case 7 :
		 * System.out.println("당신의 학점은 C 입니다");break; case 6 :
		 * System.out.println("당신의 학점은 D 입니다");break; case 5 : case 4 : case 3 : case 2
		 * : case 1 : case 0 :System.out.println("당신의 학점은 F 입니다. 재수강하십시오");break;
		 * default :System.out.println("올바른 형식이 아닙니다.");break;
		 * 
		 * }
		 */
		//------------------풀이
		String grade="";
		switch(score/10) 
		{
		case 10:
		case 9: grade ="A"; break;
		case 8: grade ="B"; break;
		case 7: grade ="C"; break;
		case 6: grade ="D"; break;
		default : grade = "F"; 
		}
		System.out.println("당신의 학점은  "+grade+" 입니다.");
	}
}
