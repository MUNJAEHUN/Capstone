package date_20191218;


import java.util.Scanner;

//int 크기 배열 생성
//참조대상 변수는 3개(3칸 생성)
//3개의 변수에 임의의 값을 대입한후 출력 
public class ArrayEx02 {
	public static void main(String[] args) {
		
		
		/*--풀이1 스스
		 * int [] arr; arr=new int[3]; System.out.println("3개의 변수 입력하세요 "); Scanner
		 * sc=new Scanner(System.in); for (int i=0;i<3;i++) {
		 * System.out.print((i+1)+"번째 수 :\n"); arr[i]=sc.nextInt();
		 * 
		 * }
		 * 
		 */
		
		//풀이강사님
		
		int [] arr=new int[3]; //기본 형식
		
		arr[0]=1;
		arr[1]=2;  
		arr[2]=4;
		//arr[3]=6; // 3자리 생성으로 에러 발생 (추가로 넣으려고 하므로) --> 해결방법? 
		
		int [] b= {15,25,35}; //허용 형식
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"||");	
			System.out.println("");
			System.out.println(b[i]+"|");
		}
		
		//배열에 값이 없으면 자료형의 디폴드 값이 들어간다.
		
		//int => 0, float=>0.0f
		
		
		
	}
}
