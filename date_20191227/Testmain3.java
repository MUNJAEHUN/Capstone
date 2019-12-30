package date_20191227;

public class Testmain3 {
	public static void main(String[] args) {
		Terran_Marine m1 = new Terran_Marine();
		Terran_Marine m2 = new Terran_Marine();
		
		m1.공격하기(m2);
		System.out.println("m2.hp : "+m2.hp);
		
		//같은방식으로 Medic객체 생성해서 m2를 치료하세요
		Terran_Medic me = new Terran_Medic();
		me.치료하기(m2);
		System.out.println("m2.hp : "+m2.hp);
		
	}
}
