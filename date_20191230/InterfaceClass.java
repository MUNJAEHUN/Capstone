package date_20191230;



//
public class InterfaceClass implements InterFaceEx01,InterFaceEx02 {

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		String result="실제 구현될 부분, 문자열을 얻어오는 부분";
		return result;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("실제로 구현될부분");
		System.out.println("연산로직 수행부분");
	}

}
