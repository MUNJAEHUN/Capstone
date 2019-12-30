package date20191226;

public class DataUse {
	public static void main(String[] args) {
		
		
		Data data=new Data();
		// 기본생성자는 jvm이 자동으로 생성
		
		//name이 private로 접근이 불가 
		//data.name="홍길동";
		
		
		
		data.setName("홍길동"); //call by value 형태로 호출 
		System.out.println(data.getName());
		
		data.setSal(70000000);
		System.out.println(data.getSal());
		//연봉 70000000 == > 5% 인상해서 출력하여라 .
		
	
	
	}//main end
	
	
	
}//class end 
