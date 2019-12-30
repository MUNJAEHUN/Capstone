package date20191226;


/* --실습 
 * 임의의 원의 반지름 정보를 전달하면
 * 원의 넓이를 계산하여 반환하는 메소드 생성
 * 결과를 출력하라
 * 
 * 반지름 : 12.2
 * 
 * 
 * 
 * 원의 둘레를 계산해서 반환하는 메소드 생성 
 * 결과를 출력하라 
 * 반지름 : 7.6
 * 
 * 원의 넓이 = r*r*3.14
 * 둘레 =2*3.14*r
 */
public class MethodEx05 {
	
	double circleArea(double radius) {
		double cirArea=Math.pow(radius, 2)*3.14;
		
			return cirArea;
	}
	 
	double circleLength(double radius) {
		double cirlength=2*radius*3.14;
		return	cirlength;
		
	}
	
	
	public static void main(String[] args) {
		MethodEx05 mt=new MethodEx05();
		
		
		double area=mt.circleArea(12.2);
		double length=mt.circleLength(7.6);
		
		
		System.out.println("원의 넓이 : "+area);
		System.out.println("원의 둘레 : "+length);
		
		
	}
	
	
}
