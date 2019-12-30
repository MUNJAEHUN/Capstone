package date_20191227;
/* 
 * 실습파일 참조 
 * 
 * 
 */
public class ExtendsMain3 {
//데이터 전달 - 생성자로 구현 
	
	public static void main(String[] args) {

		Cat cat=new Cat("야옹이","물고기");
		cat.eat();
		cat.walking("살금살금");
		cat.breathe();
		
		Dog dog=new Dog("멍멍이","사료");
		dog.eat();
		dog.walking("터벅터벅");
		dog.breathe();
		
//--스스로풀이1 
//		Cat c=new Cat("고양이","물고기");
//		Dog d=new Dog("강아지","사료");
//		c.eat();
//		d.eat();
//		c.walking();
//		d.walking();
//		c.breathe();
//		d.breathe();
		
		
		
	}
	
	
}
