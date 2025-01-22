package Jbuy;

import java.util.ArrayList;

public class Buyer {
	
	int money = 10000000; // 내가 보유한 현금
	int bonusPoint = 0; // 내 포인트
	ArrayList cart = new ArrayList();
	
	Buyer(){}
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	
	
	// 나의 정보 메소드
	void myInfo() {
		System.out.printf("[ 보유금액 : %,d]\n", money);
		System.out.printf("[ 보유포인트 : %,d]\n", bonusPoint);
	}
	
	void cartInfo() {
		System.out.println("[구매목록]");
		int sum = 0;
			for (int i=0;i<cart.size();i++) {
				System.out.printf("%s ",((Product)cart.get(i)).name);
				sum += ((Product)cart.get(i)).price;
			}
			System.out.println();
			System.out.printf("구매개수 : %d\n",cart.size());
			System.out.printf("구매금액 : %d원\n",sum);
	}
	
	// 구매매소드
	void buy(Product p) {
		cart.add(p);
		System.out.printf("%s를 구매합니다.\n",p.name);
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
//	void buy(Tv t) {
//		System.out.println("TV를 구매합니다.");
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Computer c) {
//		System.out.println("COMPUTER를 구매합니다.");
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	void buy(Audio a) {
//		System.out.println("AUDIO를 구매합니다.");
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
}
