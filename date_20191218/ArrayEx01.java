package date_20191218;

public class ArrayEx01 {

	//int 크기 변수 5개 생성하고 각변수에 임의의값을 대입한후 콘솔출력
	public static void main(String[] args) {
		int n1,n2,n3,n4,n5;
		
		n1=10;
		n2=20;
		n3=30;
		n4=40;
		n5=0;
		System.out.println(""+n1+n2+n3+n4+n5);
	
		
		//배열 선언 : 자료형 [] 변수명;
		int[] num;
		num=new int[5];// 해당 선언으로 스택영역에올라감 5칸의 배열 생성 
		//배열의 칸들은 인덱스로 접근 가능
		
		num[0]=0;
		num[1]=10;
		num[2]=20;
		num[3]=40;
		num[4]=50;  // 5개의 힙영역에 생성값 생성, 인덱스를 포함해 행성
		
		//배열의 크기
		System.out.println("배열의 크기 : "+num.length);
		
		for(int i=0;i<=4;i++)
		System.out.println(num[i]);
		
		for(int i=0;i<=num.length;i++)
			System.out.println(num[i]);
	
	
	
		
	
	}
	
	
}
