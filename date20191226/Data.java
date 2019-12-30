package date20191226;


/*Encapsulation
 * 
 * 객체를 하나의 캡슐처럼 안전하게 밀봉한 상태 (정보은닉)
 * 
 * 멤버변수  private, 멤버 메소드 getter/setter를 통해 접근 (기본)
 * setter에 권한이 있는 검사, 검사기록을 생성해서 더 넣어 캡슐화를 완성 
 */

public class Data {
	
	private String name= "유관순"; // 멤버변수를 프라이빗 타입으로 설정하여 직접 접근못하게 하며, setter,getter를 이용하여 접근한다.
	private int fullsal=0;//연봉
	
	
	//setter : 멤버변수에 값을 대입한다.
		public void setName(String name) {
			this.name=name; // 홍길동을 가져와 멤버변수에 대입 
		}
	//getter : 멤버변수 값을 가져오는 메소드
		public String getName() { // String형의 멤버변수를 가져오는 메소드
			return " * "+ this.name+" * "; //홍길동이 대입되어있는 멤버변수를 반환한다.
		}
	
		
		
		public void setSal(int fullsal) {
			this.fullsal=fullsal;
			// this.fullsal=fullsal+(fullsal*0.05); --> getter에서 처리하는게 ..맞다
		
		}
	
	
		public int getSal() {
			return this.fullsal=(int)(this.fullsal*1.05);
		}
	
		
	
}
