package date_20191218;

public class ArrayEx4_1 {
	public static void main(String[] args) {
		//char 배열 10 ch
		// JavaWorld라는 글자를 대입후 출력
		//---스스로 풀이 
		char []ch2= {'J','a','v','a','W','o','r','l','d',' '};
		char[] ch=new char[10];
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=ch2[i];
		}
		System.out.println(ch);
		
		//--강사님 풀이
		System.out.println("\n" + "-----방법2-----");
	      char[] ch3 = {'J','a','v','a','W','o','r','l','d',' '};
	      for(int i=0; i<ch3.length; i++) {
	         System.out.print(ch3[i]);
	      }
	      
	      System.out.println("\n" + "-------------------");
	      String str = "JavaWorld ";
	      System.out.println(str);
	
	int [][]m=new int[3][2];
	System.out.println(m[0]);
	System.out.println("=======================");
	int [][]m=new int[3][2];
	System.out.println(m[0]);
	System.out.println(m.length);
	System.out.println(m[0].length);
//	2차원 배열의 길이를 구하면 ? 
//
//			m.length -> 3 참조변수에 있는 길이가 몇개인지 알려줌
//			system.out.println(m[0]); -> 주소값
//			m[0].length-> m동,0번에 있는 칸수 ->2개    
	
//	[3] ㅁ ㅁ ㅁ  -> 접근 [2]     		       ㅁㅁ 
//			 	  	[	           ㅁㅁ
//				  	[  		   ㅁㅁ
	
	}//main
}//class

