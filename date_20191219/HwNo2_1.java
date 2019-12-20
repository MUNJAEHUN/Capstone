package date_20191219;

public class HwNo2_1 {
	public static void main(String[] args) {
		
	/*	for (int i=0;i<line;i+=2) {//줄 수 입력
			for (int j=line;j>=i;j-=2) {
				System.out.print(" ");
			}
			for (int k=0;k<=i;k++) {
				System.out.print('*');
			}
			System.out.println();*/
			String m="*";
			
		for (int i=0;i<5;i+=2) {//행
			for (int a = 0; a < 5-1; a++) {
                System.out.print(" ");
            }
			for(int j=5;j>=i;j-=2) { //i=0 j=5,i=2 j=3 //2회 수행 
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) { // 공백 이후 i=2만큼 *출력 ( 2회 수행)
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		int cnt=(5*3);
		
		for (int i=0;i<5*3;i++) {
			for (int j=0;j<cnt;j++) {
				System.out.print(m);	
				cnt-=2;
			}
			System.out.println("");
			
		}
		
			
		
		
		
	}
}
