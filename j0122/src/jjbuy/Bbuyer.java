package jjbuy;

import java.util.ArrayList;

public class Bbuyer {
	
	int mymoney = 1000000000;
	int mypoint = 0;
	ArrayList list = new ArrayList();
	
	Bbuyer(){}
	
	// 내정보
	void mypage() {
		System.out.printf("[보유금액 : %,d]\n",mymoney);
		System.out.printf("[보유포인트 : %,d]\n",mypoint);
	}
	
	// 물건구입
	void buying(Product p) {
		list.add(p);
		System.out.printf("%s를 구매합니다.\n", p.name);
		mymoney -= p.price;
		mypoint += p.point;
	}
	
	// 구매내역 출력
	void cart() {
		int sum = 0;
		for (int i=0;i<list.size();i++) {
			System.out.printf("%s ",((Product)list.get(i)).name);
			sum += ((Product)list.get(i)).price;
		}
		System.out.println();
		System.out.println("구매개수 : "+list.size());
		System.out.println("구매금액 : "+sum);
	}
	

}
