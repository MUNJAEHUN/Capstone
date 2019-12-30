package date_20191227;

public class Man {

	private String name; //상속 불가 private
	
	//생성자를 통해 데이터를 받기.(게터 , 세터사용안하고)
	
	Man(String name){
		this.name=name;
	}
	
	void tellName() {
		System.out.println("Name is "+this.name);
	}
	
	
}
