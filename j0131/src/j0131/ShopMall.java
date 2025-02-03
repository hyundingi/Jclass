package j0131;

import java.util.Scanner;

public class ShopMall {

	public static void main(String[] args) {
		// 상품관리 - Product - Tv, Computer, Refrigerator, Washing
		// 유저관리 - Buyer
		// 메소드 관리 - shop_Deck
		// 메인 - ShopMall
		
		Scanner scan = new Scanner(System.in);
		Shop_Deck sd = new Shop_Deck();
		int choice = 0;
		
		sd.login();
		
		loop:while(true) {
			
			// 화면 출력
			choice = sd.mainPrint();
			
			switch(choice) {
			case 1:
				Tv tv50 = new Tv();
				sd.buy(tv50);
				break;
			case 2:
				Tv tv75 = new Tv("LG75TV",1500000,150000,75,"LED","BLACK");
				sd.buy(tv75);
				break;
				
			case 3:
				Computer com = new Computer();
				sd.buy(com);
				break;
			case 4:
				Refrigerator re = new Refrigerator();
				sd.buy(re);
				break;
			case 5:
				Washing wa = new Washing();
				sd.buy(wa);
				break;
				
			case 7:
				// 구매 리스트 출력
				sd.proList();
				System.out.println();
				break;
				
			case 8:
				// 현금충전
				sd.charge();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			} // switch
		} // while
		

		
		
	}

}
