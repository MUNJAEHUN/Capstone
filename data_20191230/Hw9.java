package data_20191230;

import java.util.Scanner;

//9. 사용자로부터 금액을 입금받아서 잔돈을
//바꿔주는 프로그램을 작성하고자한다.
//
//
//public class Hw9{
//    public static void main(String[] args){
//    System.out.print("금액을 입력하세요:");
//        Scanner sc = new Scanner(System.in);
//    int money = sc.nextInt();
//
//    Exchange ec = new Exchange();
//        ec.chage(money);
//    }
//}
//
//
//실행
//------------------------
//금액을 입력하세요: 2970
//500원 : 5
//100원 : 4
//50원 : 1
//10원 : 2

public class Hw9{
	public static void main(String[] args){
			System.out.print("금액을 입력하세요:");
			Scanner sc = new Scanner(System.in);
			int money = sc.nextInt();

			Exchange ec = new Exchange();
			ec.change(money);
	}
}
