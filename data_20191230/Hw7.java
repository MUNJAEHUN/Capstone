package data_20191230;

public class Hw7 {

	
	public static void main(String[] args) {
		Animal a=new Animal("원숭이",26);
		a.show();

	
	}


}


class Animal{
	
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(String str, int i) {
		this.name=str;
		this.age=i;
	}
	
	public void show() {
		System.out.println(name +"님은"+ age +" 살입니다.");
	}
	
	
	
}