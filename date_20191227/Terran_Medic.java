package date_20191227;

public class Terran_Medic extends Terran{
	int 치유력;
	int mp;
	public Terran_Medic() {
		super();
		this.치유력 = 3;
		this.mp = 50;
	}

	void 치료하기(Terran_Marine x) {
		System.out.println("치료시작하겠습니다");
		x.hp += 치유력;
		this.mp -= 5;
	}
}
