package data_20191230;


//화폐변환기	
public class Exchange {
	public void change(int val) {
		System.out.println(val+"원 입력.");
		
		int oman=val/50000;
		int man=(val%50000)/10000;
		int ocheon =(val%10000)/5000;
		int cheon= (val%5000)/1000;
		int obek= (val%1000)/500;
		int bek= (val%500)/100;
		int osib=(val%100)/50;
		int sib=(val%50)/10;
		
		System.out.println(
				
				"교환금액은 \n"+"오만원 :"+oman+" 장\n"
				+"만원 :"+man+" 장\n"+"오천원 :"+ocheon+" 장\n"+
				"천원 :"+cheon+" 장\n"+"오백원 :"+obek+" 장\n"+
				"백원 :"+bek+" 장\n"+"오십원 :"+osib+" 장\n"+
				"십원 :"+sib+" 장\n");
						
				
	}
}
