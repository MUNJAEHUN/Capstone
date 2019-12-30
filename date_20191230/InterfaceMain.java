package date_20191230;

public class InterfaceMain {
	
	public static void main(String[] args) {
		
		Horse h=new Horse();
		Marine m=new Marine();
		
		h.달리기();
		h.비행();
		
		m.stasus();
		m.move(100, 200);
		m.비행();
	
		System.out.println("------------------- ");
		//interface를 통해서 배열 사용 가능
		
		
		Flyable[] fList= new Flyable[2];
		System.out.println("fList :"+ fList);
		// 인터페이스는 간접적인 상속(has - a) 관계
//		 			직접상속은(is - a) 관계
		
		
		fList[0]=h;
		fList[1]=m;
		
		
		for (int i=0;i<fList.length;i++) {
			fList[i].비행();
		}
		
	}
	
	
	
	
	
}
