package jjcard;

public class Deck {
	

	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];
	
	void input() {
		for (int i=0;i<4;i++) {
			for (int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
	}
	
	// 번호 출력 - 전체 52 / 아무 개수나 가능
	void print(int cnt) {
		for (int i=0;i<cnt;i++) {
			System.out.printf("[%s , %s]\n",c[i].shape,c[i].number);
		}
	}
	
	// 해당번호 출력
	void print(Card c) {
		System.out.printf("뽑은 카드 : [%s, %s]\n",c.shape,c.number);
	}
	
	// 카드섞기
	void shuffle() {
		Card temp = null;
		for (int i=0;i<300;i++) {
			int ran = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[ran];
			c[ran] = temp;
		}
	}
	
	// 카드 뽑기
	Card pick(int no) {
		return c[no];
	}
	
	

}
