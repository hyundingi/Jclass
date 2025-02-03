package j0131;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop_Deck {
	
	Scanner scan = new Scanner(System.in);
	
	// user 아이디
	Buyer user1;
	
	// 상품등록
	ArrayList<Product> list = new ArrayList<Product>(); // 상품구매리스트
	
	// 화면 출력 메소드
	int mainPrint() {
		System.out.println("[쇼핑몰 프로그램]");
		System.out.println("------------------------------");
		System.out.println("1. 50인치 LED TV ");
		System.out.println("2. 75인치 LED TV ");
		System.out.println("3. 노트북");
		System.out.println("4. 냉장고 ");
		System.out.println("5. 세탁기 ");
		System.out.println("6. 배송지 및 상품 색상");
		System.out.println("7. 구매리스트 보기 ");
		System.out.println("8. 현금 충전 ");
		System.out.println("9. 상품등록 - 관리자");
		System.out.println("0. [프로그램 종료]");
		System.out.println("------------------------------");
		
		System.out.println("원하는 번호를 입력하세요. >> ");
		int choice = scan.nextInt();
		return choice;
	} // 화면 출력 메소드 끝
	
	// 구매 메소드
	void buy(Product p) {
		p.getPrice(); // 제품 금액
		p.getPoint(); // 제품 보너스 포인트
		user1.setMoney(user1.getMoney()-p.getPrice()); // 산 금액만큼 보유 머니 차감
		user1.setMyPoint(user1.getMyPoint()+p.getPoint()); // 포인트는 추가
		list.add(p);
		System.out.println("[구매상품]");
		System.out.println("상품 : "+p.getName());
		System.out.println("상품금액 : "+p.getPrice());
		System.out.println("현재잔액 : "+user1.getMoney());
		System.out.println("-----------------------------------------");
		System.out.println("상품을 구매하였습니다.");
		
	}
	
	// 로그인 메소드
	void login() {
		while(true) {
			System.out.println("[쇼핑몰 프로그램]");
			System.out.println("로그인을 하셔야 쇼핑몰 프로그램에 들어갈 수 있습니다.");
			System.out.println("<로그인>");
			System.out.print("아이디 : ");
			String id = scan.next();
			System.out.print("패스워드 : ");
			String pw = scan.next();
			
			
			if(id.equals("admin") && pw.equals("1111")) {
				
				// db접근
				user1 = new Buyer("admin","1111","관리자","서울",100000000,10000000);
				System.out.println(id+"님, 로그인 되었습니다.");
				System.out.printf("현재 충전 금액 : %,d\n",user1.getMoney());
				
				
				
				
				break;
			}else {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
			}
		} // while
	} // 로그인 메소드 끝
	
	// 구매 리스트 출력 메소드
	void proList() {
		int sum = 0;
		System.out.println("[구매리스트]");
		System.out.println("--------------------------");
		if(list.isEmpty()) {
			System.out.println("구매한 리스트가 없습니다.");
		}else {
			System.out.printf("상품리스트 개수 : %d \n",list.size());
			for(int i=0;i<list.size();i++) {
				System.out.printf("%s\t",list.get(i).getName());
				sum += list.get(i).getPrice();
			}
			System.out.println();
		}
		System.out.printf("상품 총 구매 금액 : %,d원 \n",sum);
	}// 구매 리스트 출력 메소드 끝

	// 현금충전 메소드
	public void charge() {
		System.out.println("[현금충전]");
		System.out.printf("현재 잔액 : %,d원\n",user1.getMoney());
		System.out.println("------------------------------");
		System.out.print("충전할 금액을 입력하세요. >> ");
		int m = scan.nextInt();
		user1.setMoney(user1.getMoney()+m);
		System.out.println("------------------------------");
		System.out.println("충전이 완료되었습니다.");
		System.out.printf("현재 잔액 : %,d원\n",user1.getMoney());
	} // 현금충전 메소드 끝
}
