package date_20191213;


// 문자형 : char
// char는 ''안에 1자만 가능 

public class VarEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch1 = 'J';
		char ch2 = 'A';
		char ch3 = 'V';
		char ch4 = 'A';
		
		System.out.println(""+ch1+ch2+ch3+ch4); // + -> 연결연산자
		// 출력식에 "" 없으면 아스키 값이 그대로 출력
		
		String  str= "JAVA";
		System.out.println(str);
		
		//자바는 유니코드도 지원(사용잘안함)
		
		String 한글 = "한글 변수";
		
		System.out.println(""+한글);
	
		
	}

}
