package date_1224;

import java.util.Scanner;
public class MultiParam {
	// 로그인
	void loginDemo(String id, int pw) {
		// id가 java이고 pw가 1234이면 로그인 성공 메세지 출력
		
		//if(id=="java" && pw==1234) {			// <---- 에러남
		if(id.equals("java") && pw==1234) {		// 이렇게 쓰는것을 추천
			System.out.println("로그인 성공했습니다.");
		}		
		else {
			System.out.println("회원가입 하세요.");
		}
	}// loginDemo end
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = ""; // 문자열 선언 및 초기화 방법
		int pw = 0;		// 정수 선언및 초기화
		System.out.println("로그인 하시겠습니까?");		
		
		System.out.println("아이디를 입력하세요. : ");
		id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요. :");
		pw = sc.nextInt();
		
		MultiParam mp = new MultiParam();
		mp.loginDemo(id, pw);
		
	}//main end
}

