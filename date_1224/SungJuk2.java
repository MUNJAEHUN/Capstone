package date_1224;

// call by value
public class SungJuk2 {
	void hap(int kuk, int eng) {
		int tot = kuk+eng;
		
		System.out.println("합계 : "+tot);
	}
	
	public static void main(String[] args) {
		SungJuk2 sungjuk = new SungJuk2();
		sungjuk.hap(90, 100);
		sungjuk.hap(70, 85);	// 유의사항
		sungjuk.hap(95, 90); 	// Parameter 쌍방간에 데이터타입과 개수가 일치해야 한다
		
	}
}
