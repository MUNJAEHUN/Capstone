package date_20191227;

public class TestMedic {
	public static void main(String[] args) {
		Medic me = new Medic();
		
		me.이동하기(4, 9);
		me.status();
		
		System.out.println("--------------------------");
		
		Marine m1 = new Marine(); // 일반마린	피 100
		
		Marine m2 = new Marine(500); // 영웅마린	피 500
		
		
		Marine m3 = m1; // m1의 주소값도 바뀌어버려서 hp출력시 m3과 똑같은hp가 나옴
		m3.hp = 50;
		
		System.out.println("m1.hp : " + m1.hp + " " + m1);
		System.out.println("m2.hp : " + m2.hp + " " + m2);
		System.out.println("m3.hp : " + m3.hp + " " + m3); // m3,m1의 주소가 같음
		
		m1.공격하기(m2);
		m2.stasus(); //<- m2.hp가 m1.att만큼 깎임.
		//마린 객체가 공격하기 가 필요
		me.치료하기(m2);
		m2.stasus();
	}
}
