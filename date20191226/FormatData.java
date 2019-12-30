package date20191226;
//
//6. 다음 출력 결과를 얻을 수 있게 FormatData 클래스를 작성하시오
//public class Hw6 {
//  public static void main(String[] args){
//      int a = 20;
//      int[] b = {10, 20, 50, 30};
//      float f = 240.3f;
//
//      FormatData fd = new FormatData();
//
//      fd.print(a);
//      fd.print(b);
//      fd.print(c);
import java.util.Arrays;

public class FormatData {
	
	public void print(int[] b) {
		System.out.println(Arrays.toString(b));
		
		/*
		 * //case2 for (int i=1;i<=b.length;i++) { System.out.println(b[i]+" ");
		 */
		}
	
	public void print(int a) {
		System.out.println(a);
	}
	
	public void print(float f) {
		System.out.println(f);
	}
	
	
	
	public static void main(String[] args) {
		
		int a=20;
		int []b= {10,20,50,30};
		float f=240.3f;
		
		FormatData fd= new FormatData();
		
		fd.print(a);
        fd.print(b);
        fd.print(f);
		
	}
	
	
}

