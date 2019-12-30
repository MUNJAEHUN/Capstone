package date_1224;

// date_1216 package의 SwitchEx03 클래스와 같은 결과가 나오도록 출력하기
// 사용자로부터 입력을 받아야 함

import java.util.Scanner;
public class MethodParam {

//	void tot(int tot) {
//		tot = kor + eng + math;
//		System.out.println("총 점수 : " +tot);
//	}
//	void avg(int avg) {
//		avg = tot/3;
//		System.out.println("평균점수 : " +avg);
//	}
	
	void paramDemo(int tot) {
		
		double avg = tot/3;
		
		String grade;
		switch((int)avg/10) {
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F";
		}
		System.out.println("당신의 학점은 " +grade +" 입니다.");		
	}// paramDemo end	
	
	public static void main(String[] args) {
		//사용자로부터 점수 입력을 받는다
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		//call by value 형태로 메소드를 호출하여 결과(평균점수와 학점) 출력
		//메소드명 : paramDemo()
		int tot = kor + eng + math;
		MethodParam M = new MethodParam();
		M.paramDemo(tot);	
	} // main end
	
	
}
