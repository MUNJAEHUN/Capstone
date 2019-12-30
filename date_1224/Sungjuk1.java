package date_1224;

// == call by name ==
/*
public class Sungjuk {
	void hap() {
		int kuk = 90;
		int eng = 100;
		int tot = kuk + eng;
		
		System.out.println("합계 : "+tot);
	}
	
	public static void main(String[] args) {
		Sungjuk sungjuk = new Sungjuk();		// 인스턴스화
		sungjuk.hap();							// 호출
	}
}
*/

// == call by value ==

public class Sungjuk1{
	void hap(int kuk, int eng) { 				// <-인수 (가인수, parameter)
		int tot = kuk + eng;
		System.out.println("합계 : "+tot);
	}
	
	public static void main(String[] args) {
		Sungjuk1 sungjuk = new Sungjuk1();
		sungjuk.hap(90, 100);					// <-인수 (실인수, parameter, 전달값)
	}
}


















