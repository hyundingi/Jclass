package j0121;

import java.util.Scanner;

public class Ja0121_05 {

	public static void main(String[] args) {
		// 카드게임
		// 카드게임을 실행합니다
		// 컴퓨터가 랜덤 한개
		// 내가 한개 뽑아서
		// 무늬가 같으면 숫자가 높은 사람이 승리 
		// 이기면 100만원 지급
		
		Scanner scan = new Scanner(System.in);
		Card[] compick = new Card[1];
		Card[] mypick = new Card[1];
		String[] s = {"Spade","Heart","Clover","Diamond"};
		String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		int money = 0;
		Deck d = new Deck();
		d.shuffle();
//		d.print_all(52);
		
		while(true) {
		// 컴퓨터가 뽑은 거
		int ran = (int)(Math.random()*52);
		compick[0] = d.c[ran];
		
			
		// 내가 뽑은 거
		System.out.println();
		System.out.print("[0-51] 카드 뽑아요 >> ");
		int no = scan.nextInt();
		if (no==99) {
			break;
		}
		mypick[0] = d.c[no];
		
		System.out.printf("[결과]");
		System.out.printf("컴퓨터 : %s, %s\n",s[compick[0].shape], n[compick[0].number]);
		System.out.printf("나 : %s, %s\n",s[mypick[0].shape], n[mypick[0].number]);
		
		if(compick[0].shape == mypick[0].shape) {
			if (compick[0].number > mypick[0].number) {
				System.out.println("컴퓨터 승");
			}else {
				System.out.println("현지 승");
				money += 100;
				System.out.printf("게임머니 : %d 만원\n",money);
			}
		}else if(compick[0].shape > mypick[0].shape) {
			System.out.println("현지 승");
			money += 100;
			System.out.printf("게임머니 : %d 만원\n",money);
		}else {
			System.out.println("컴퓨터 승");
		}
		
		}
		
		
		

	}

}
