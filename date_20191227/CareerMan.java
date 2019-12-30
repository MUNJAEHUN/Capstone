package date_20191227;

//직책 직위에 이름까지 알고싶으면 ?=> 상속받아서 쓰면대지 
public class CareerMan extends Man {
	String job;
	String position;

//	CareerMan(String job,String position){
//		//super(super.name); // name이 private이므로 접근을 못한다.
//		super(super.name); // name이 private이므로 접근을 못한다.
//		this.job=job;
//		this.position=position;
//		
//	}
	public CareerMan(String name,String job,String position ) {
		super(name);
		this.job=job;
		this.position=position;
		// TODO Auto-generated constructor stub
	}
	
	
	void tellInfo() {
		
		System.out.println("Job is "+this.job);
		System.out.println("Position is "+this.position);
		tellName();
		
	}
	
}
