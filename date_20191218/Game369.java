package date_20191218;


//박수가 필요한 경우의 수를 출력 
public class Game369 {
	public static void main(String[] args) {
		//접근 1 -- string 
		/*
		 * int cnt=0; int J=0;
		 * 
		 * 
		 * for (J=1;J<=100;J++) { String to = Integer.toString(J);
		 * if(to.contains("3")||to.contains("6")||to.contains("9")) {cnt+=1;}
		 * System.out.println(to); System.out.println(cnt);
		 * 
		 * //if end
		 * 
		 * }//for end
		 */	
		
		
		/*
		 * //--접근 2 -- 구분하여 3으로 남기는거
		 * 
		 * 
		 * 
		 * for (int i=1;i<=100;i++) {
		 * 
		 * if(i%3==0 ||i%6==0 ||i%9==0) { System.out.print(i+"");
		 * System.out.println("짝"); if((i/10)%3==0||(i/10)%6==0||(i/10)%9==0) {
		 * System.out.print("짝"); }
		 * 
		 * }
		 * 
		 * }
		 */
		
		//풀이 --------
		int num=55;
		int tem=0;
		int re=0;
		
		for (int i=1;i<=100;i++) {
			tem=i/10;
			re=i%10;
			
			if (tem==3||tem==6||tem==9) {//십의자리 3,6,9 체크
				if(re==3||re==6||re==9){
					System.out.println(i+" 짝짝");
				}else System.out.println(i+" 짝");//일의 자리 십의 자리 동시 처리
			}
			
			else if(re==3||re==6||re==9) {
				System.out.println(i+ " 짝");
			}
			else System.out.println(i);//3,6,9 가아닌 수 그냥출력 
		}//for end
	}//main en
}//class end
