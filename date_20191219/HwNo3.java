package date_20191219;

import java.util.Arrays;

//3. 1000까지 정수 중 0부터 9까지 값이 몇개씩일지 구하시오
//1부터 1000까지 
/*0 = 10 20 30 40 ..... -> 10으로 떨어지는 수 
1 = 1 11 21 31 41 51 -> 1이 남는 수 
2 = 2 12 22 32 42 52 -> %가 2가 남는 수 
3 = 3 13 23 33 43 53 . . .*/
public class HwNo3 {
	public static void main(String[] args) {
		
		
		int box[] = new int[10];//각 숫자를 저장할 공간
        for (int i = 1; i <= 1000; i++) {
            box[i%10]++;//일의 자리
            if (i>=10)  box[i/10%10]++;//십의 자리
            if (i>=100) box[i/100%10]++;//백의 자리
            if (i==1000) box[i/1000%10]++;//천의 자리
        }
        
        
        System.out.println(Arrays.toString(box));
		
        
        System.out.println("===========================");
        int []num= {0,0,0,0,0,0,0,0,0,0};
        
        for (int i=1;i<=1000;i++) {
        	for (int j=0;j<10;j++) {
        		
        		if (i%10==j) {
            		num[j]++;
        		}
            	if ((i>=10) && i/10%10==j) {
            		num[j]++;
            	}
            	if ((i>=100) && i/100%10==j) {
            		num[j]++;
            	}
            	if ((i==10) && i/1000%10==j) {
            		num[j]++;
            	}
        	}
        }
        
        	
        
		for (int i=0;i<10;i++) {
			System.out.print(num[i]+" \t");
		}
		
	}//main
}//class

