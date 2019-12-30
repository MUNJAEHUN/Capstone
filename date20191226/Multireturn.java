package date20191226;

import java.util.Scanner;

// id , pw(int) 입력받아 로그인.
public class Multireturn {

	public static void main(String[] args) {
		System.out.println("로그인 하시겠습니까? ");
		Scanner sc= new Scanner(System.in);
		System.out.println("ID를 입력하세요 :");
		String id= sc.nextLine();
		System.out.println("PW를 입력하세요 :");
		int pw=sc.nextInt();
		
		
		System.out.println(""+id+" , "+pw);
		
		//객체 호출 (인스턴스화)
		LoginTest lt= new LoginTest();
		//call by value 
		boolean login = lt.loginCheck(id, pw);
		lt.loginMsg(login);
		
		
		
	}// main
	
}//Multireturnclass



//로그인 정보 확인 클래스 
class LoginTest{ 
	
	public boolean loginCheck(String id,int pw) {
		
		//id :java, pw:1234이면 true 아니면 false
		boolean login=false;
		
		if (id.equals("java") && pw==1234) {
			login=true;
		}
		
		return login;
		
		
	}//loginCheck method
	
	
	public void loginMsg(boolean check) {
		if(check) { // 조건식()의 true면 진행
			System.out.println("로그인에 성공하였습니다.");
		}else System.out.println("로그인에 실패하였습니다.");
	
	}//loginMsg method
	
}//LoginTest class
