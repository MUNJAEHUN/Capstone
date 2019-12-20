package date_20191216;

import java.util.Scanner;


//국어 수학 영어 성적 차례대로 입력받기 
public class SwitchEx03 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int kor,eng,mat,sum;
		double ave;
		String grade="";
		System.out.print("국어 성적 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 성적 입력 : ");
		eng= sc.nextInt();
		System.out.print("수학 성적 입력 : ");
		mat = sc.nextInt();
		
		sum=kor+eng+mat;
		
		ave=sum/3;
		
		System.out.println("평균 점수는 "+sum+"점 입니다.");
		System.out.println("평균 점수는 "+ave+"점 입니다.");
		
		switch ((int)ave/10)
		{
	
		case 10:	
		case 9:	grade="A";break;
		case 8:	grade="B";break;
		case 7:	grade="C";break;
		case 6:	grade="D";break;
		default : grade="F";
		
		}
		
		System.out.println("당신의 학점은"+ grade+ "입니다.");
	}// main end
}//class end 
