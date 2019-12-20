package date_20191216;

import java.io.IOException;


//문자를 입력받아 소문자는 -> 대문자 , 대문자는 소문자로 변경 a=97, z=122 ,A=65, Z=90


public class IfEx04 {
	public static void main(String[] args) throws IOException {
		
		/*
		 * System.out.println("문자 입력 : ");
		 * 
		 * int val = System.in.read(); // 한 자만 받을수있음. 키보드로 입력을 받으므로 int로 받는다 ( ascii )
		 * 
		 * System.out.println("처음 입력한 값  : "+val);
		 */
		System.out.println("문자 입력 : ");
		
		int cap= System.in.read();
		
		// 대문자 : 65~90 , 소문자 : 97~122 
		if(cap>96 && cap<123) {// 소문자이면 
		
		System.out.println("처음 입력한 값 : "+(char)cap);
		
		cap=cap-32;
		System.out.println("변환된 값 : "+(char)cap);
		}
		
		else if (cap<91 && cap>64) // 대문자이면
		{
			
			System.out.println("처음 입력한 값 : "+(char)cap);
			
			cap=32+cap;
			System.out.println("변환된 값  : "+(char)cap);
		}
		
		else
		{
			System.out.println("잘못된 형식의 문자.");
		}
	}// main end
	
}//class end 
