package date_20191218;


//int 배열 3칸 a
//int 배열 3칸 b 
//int 배열 3칸c

//a,b 는 임의의 값을 대잆

//c는 a,b의 값을 합함
public class ArrayEx04 {
	
	public static void main(String[] args) {
		//int [] aa=new int[5];
		int a[]= {10,20,30};
		int b[]= {40,50,60};
		//int []c=new int[3];
		int []c=new int[3];
		//= {a[0]+b[0],a[1]+b[1],a[2]+b[2]};
		for (int i=0;i<c.length;i++) {
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
		//다른 인덱스끼리의 연산도 수행가능 
	
		
	}
}
