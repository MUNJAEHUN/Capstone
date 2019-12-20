package date_20191216;
//성적을 입력받아 조건문으로 분기 

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {

		/*
		 * ------------------usage-------------------- 
		 * if (조건 1) {
		 * 
		 * } else if (조건 2) {
		 * 
		 * } else if ( 조건 3 ) {
		 * 
		 * } else {
		 * 
		 * }
		 *-------------------------------------------*/

		System.out.println("민승이의 성적을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		
		  if (score <=100 && score >=90) { System.out.println("학생의 등급은  A 입니다."); }
		  else if( score <=89 && score >=80 ) { System.out.println("학생의 등급은  B 입니다.");
		  
		  } else if( score <=79 && score >=70) { System.out.println("학생의 등급은 C 입니다.");
		  } else if( score <=69 && score >=60) { System.out.println("학생의 등급은 D 입니다.");
		  } else if(score <=59) { System.out.println("넌 F야 재수강해"); } else {
		  System.out.println("잘못된 값을 입력하셨습니다."); }
		 

		  //--------------간략화-------------------------
		  if (score >=90 && 100>=score) { System.out.println("학생의 등급은  A 입니다."); } 
		  else if( score >=80 ) { System.out.println("학생의 등급은  B 입니다."); } 
		  else if( score >=70) { System.out.println("학생의 등급은 C 입니다."); } 
		  else if( score >=60) {System.out.println("학생의 등급은 D 입니다."); } 
		  else if(score <=59) {System.out.println("넌 F야 재수강해"); } 
		  else {System.out.println("잘못된 값을 입력하셨습니다."); }
		
	}// MAIN END
}// CLSS END
