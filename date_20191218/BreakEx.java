package date_20191218;

/*

break : 가장 가까운 반복문 탈출 
break 라벨명 : 라벨이 붙어있는 반복문 탈출
continue :라벨이 붙은 반복문에서 조건을 만족시키면 이번만 생략하라 (20번을 컨티뉴 붙이면 20번을 생략한 진행 )


*/
public class BreakEx {
	public static void main(String[] args) {
		
		outer ://라벨
			
			for(int i=1; i<=4; i++) {
				
				for (int j=1;j<=4;j++) {
					if(i==j) { //i와 j가 일치하는 부분에 가장 안쪽의 반복문 탈출
						break;
						//break,break outer,continue,continue outer등이 있음
					}
					System.out.println("i :"+i+","+"j :"+j);
				}
			}
		
	}
	}
