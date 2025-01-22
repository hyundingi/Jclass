package Jbuy;

import java.util.Scanner;

public class JaMain {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner scan = new Scanner(System.in);
		
		// 로그인 구현
		// 보유한 금액, 보너스 포인트 설정
		Buyer b = new Buyer(); 
		
		loop:while (true) {
			
		System.out.println("[전자제품 쇼핑몰]");
		System.out.println("1. TV");
		System.out.println("2. COMPUTER");
		System.out.println("3. AUDIO");
		System.out.println("9. 구매 정보 보기");
		System.out.println("0. 종료");
		System.out.println("구매를 원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1:
			Tv t = new Tv();
			b.buy(t);
			b.myInfo();
			break;
		case 2:
			b.buy(new Computer());
			b.myInfo();
			break;
		case 3:
			b.buy(new Audio());
			b.myInfo();
			break;
		case 9:
			b.cartInfo();
			break;
		case 0:
			System.out.println("쇼핑몰 프로그램을 종료합니다.");
			break loop;
		} // switch
		
		
		
		} // while
		
	}

}
