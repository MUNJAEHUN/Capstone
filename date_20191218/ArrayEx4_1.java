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
	
	}//main
}//class

