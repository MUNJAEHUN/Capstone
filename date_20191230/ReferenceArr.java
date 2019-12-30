package date_20191230;

public class ReferenceArr {
	public static void main(String[] args) {
		토끼 r=new 토끼();
		고래  w=new 고래();
		다람쥐 s=new 다람쥐();
	
		r.먹기();
		w.먹기();
		s.먹기();   
	
		//각 클래스들이 동일안 메소드가 있네? 반복해도 되겟는데?
		
		//배열을 통한 작업 
		
		/* Primitive 배열 선언 
		 * int []= new int[3];
		 * 
		 */
		System.out.println("배열로 선언된 객체들의 메서드 호출");
		포유류[] moList=new 포유류[3];
		
		moList[0]=r;
		moList[1]=w;
		moList[2]=s;
		
		for (int i=0;i<3;i++) {
			moList[i].먹기();
		}
		
		
	System.out.println("---------------------------");
	
	
	// 참조변수여부를 확인하는 키워드 (원객체 여부를 확인하는 것):instanceof
	System.out.println(w instanceof 고래);
		
		
	}
}
