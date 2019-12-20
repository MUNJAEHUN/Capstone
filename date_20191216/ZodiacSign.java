package date_20191216;
import java.util.Scanner;

public class ZodiacSign {
	
	public static void main(String[] args) {
		//사용자로부터 태어난 년도를 4자리로 입력받고 띠로 표현
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("생년월일 입력하세요 : ");
		int bir=sc.nextInt();
		int ddi=bir%12;
		System.out.println("나머지 :"+(bir%12));
		
		System.out.println("=====================================");
		/*--스스로 풀이 
		 * switch(ddi) { case 11:System.out.println("당신은 양띠입니다.");break; case
		 * 10:System.out.println("당신은 말띠입니다.");break; case
		 * 9:System.out.println("당신은 뱀띠입니다.");break; case
		 * 8:System.out.println("당신은 용띠입니다.");break; case
		 * 7:System.out.println("당신은 토끼띠입니다.");break; case
		 * 6:System.out.println("당신은 범띠입니다.");break; case
		 * 5:System.out.println("당신은 소띠입니다.");break; case
		 * 4:System.out.println("당신은 쥐띠입니다.");break; case
		 * 3:System.out.println("당신은 돼지띠입니다.");break; case
		 * 2:System.out.println("당신은 개띠입니다.");break; case
		 * 1:System.out.println("당신은 닭띠입니다.");break; case
		 * 0:System.out.println("당신은 원숭이띠입니다.");break; default :
		 * System.out.println("잘못된 형식의 입력입니다."); }
		 */
		
		// 접근 (if)
		if (ddi==11) {
			System.out.println("당신은 양띠입니다.");
		}else if(ddi==10) {
			System.out.println("당신은 말띠입니다.");
		}else if(ddi==9) {
			System.out.println("당신은 뱀띠입니다.");
		}else if(ddi==8) {
			System.out.println("당신은 용띠입니다.");
		}else if(ddi==7) {
			System.out.println("당신은 토끼띠입니다.");
		}else if(ddi==6) {
			System.out.println("당신은 범띠입니다.");
		}else if(ddi==5) {
			System.out.println("당신은 소띠입니다.");
		}else if(ddi==4) {
			System.out.println("당신은 쥐띠입니다.");
		}else if(ddi==3) {
			System.out.println("당신은 돼지띠입니다.");
		}else if(ddi==2) {
			System.out.println("당신은 개띠입니다.");
		}else if(ddi==1) {
			System.out.println("당신은 닭띠입니다.");
		}else System.out.println("당신은 원숭이띠입니다.");
		
		
		
	
		//08 09 10 11  2 3 4 5  6 7 8 9 
		//자    축    인     묘   진   사  오  미   신   유 술  해
		//쥐소호토 용뱀말양 원닭개돼
		//4 5 6 7   8 9 10 11   0 1 2 3
		// 당신은 ~ 띠입니다.
	}
}
