package j0121;

class Deck {
	// 카드에 사용되는 메소드
	
	// 생성자
	Deck(){
		for (int i=0;i<4;i++) {
			for (int j=0;j<13;j++) {
				c[i*13+j] = new Card(i,j+1);
			}
		}
	}
	
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM]; // 배열
	String[] s = {"Spade","Heart","Clover","Diamond"};
	String[] n = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	
	// 카드 출력 메소드
	void print_all(int no) {
		for (int i=0;i<no;i++) {
			System.out.printf("[%s, %s]\n",c[i].shape, c[i].number);
		}
	}
	
	// 오버로딩
	void print_all(Card c) {
		System.out.printf("[카드확인]\n");
		System.out.printf("[%s, %s]\n",c.shape, c.number);
	}
	
	// 섞기 메소드,
	void shuffle() {
		Card[] cc = new Card[1];
		for (int i=0;i<300;i++) {
			int ran = (int)(Math.random()*52);
			cc[0] = c[0];
			c[0] = c[ran];
			c[ran] = cc[0];
		}
	}

	Card pick(int no) {
		if (no>=0 && no<52) {
			return c[no];
		}else {
			System.out.println("[경고] 번호 확인을 하셔야 합니다.");
			return c[0];
		}
	}
}
