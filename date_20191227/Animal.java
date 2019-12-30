package date_20191227;
//(이름)은 물고기를 먹는다 ,사료를 먹는다.
public class Animal {
	//멤버변수
	String name;
	String food;
	
	
	//생성자
	Animal(String name,String food){
		this.name=name;
		this.food=food;
	}


	//멤버 메소드
	void eat() {
		System.out.println(this.name+"는 "+this.food+"를 먹는다");
	}
	
	void walking(String str) {// 걷는 행위 (부사)받기위해 call by value
		System.out.println(this.name+"는 "+str+" 걷는다.");
	}
	
	void breathe() {
		System.out.println(this.name+"는 호흡한다.");
	}
	/* 스스로 풀이 (작동)
	 * public String name; public String food; Animal(){ name=""; food=""; }
	 * Animal(String name,String food){ this.name=name; this.food=food; } public
	 * void eat() { System.out.println(name+"는 "+food+"를 먹는다."); } public void
	 * breathe() { System.out.println(name+"는 호흡한다."); }
	 */
	
	
}
