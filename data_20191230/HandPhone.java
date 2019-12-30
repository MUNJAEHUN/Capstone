package data_20191230;


//캡슐화 
public class HandPhone {
	private String pdname;		 //클래스내 변수는 프라이빗으로 설정하자 
	private String pdtype;
	private int price;
	private int phoneNum;
	
//게터와 세터 생성   : 왜만드냐 ? getter, setter는 private 필드의 값을 외부에서 읽어가거나 덮어쓰는 용도로 만드는 것입니다.
	
//	생성자는 클래스에 소속된 멤버입니다.
//	때문에 private 변수에 자유롭게 접근이 가능하므로 굳이 setter 안 써도 문법적으로는 문제 없습니다.
//	다만 변수가 의미적으로 범위를 제한해야 할 경우(예: 1년은 12개월이므로
//	private int month;
//	이런 변수가 있다면 1-12사이의 값만 설정되게끔 범위검사해주는 setter 필요)
//	반드시 setter를 거쳐서 값설정하는것이 좋습니다
	
	
	public String getproductName() {
		return this.pdname;
	}
	
	public void setproductName(String str) {
		this.pdname=str;
	}

	public String getPdtype() {
		return pdtype;
	}

	public void setPdtype(String pdtype) {
		this.pdtype = pdtype;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
	
	
	
	
}
