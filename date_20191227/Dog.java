package date_20191227;

public class Dog extends Animal { //부모가 기본생성자가 없는경우 에러가 발생한다. 기본생성자를 받거나 부모의 오버로딩된 생성자를 받아야한다

	Dog(String name,String food){//위의 에러 해결을 위해 생성한 오버로딩된 생성자 
		super(name,food);
	}
	
	/* 스스로풀이
	 * Dog(String name, String food) { super(name, food); // TODO Auto-generated
	 * constructor stub }
	 * 
	 * 
	 * Animal a=new Animal("강아지","사료");
	 * 
	 * 
	 * public void walking() { System.out.println(name+"는 터벅터벅걷는다."); }
	 */
	
}
