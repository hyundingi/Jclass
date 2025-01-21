package jcard;

public class Deck {
	
	Deck(){
		for (int i=0;i<4;i++) {
			for (int j=0;j<13;j++) {
				c[i*13+j] = new Card(s[i],j+1);
			}
		}
	}
	
	Card[] c = new Card[52];
	String[] s = {"Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	// 출력
	void print_deck() {
		for (int i=0;i<52;i++) {
			System.out.printf("[%s, %s]\n",c[i].sh, n[c[i].num]);
		}
	}
	
	// 원하는 거만 출력
	void print_deck(int no) {
		System.out.printf("고른 번호\n[%s, %s]\n",c[no].sh, n[c[no].num]);
	}
	
	// 카드섞기
	void shuffle() {
		Card[] cc = new Card[1];
		for (int i=0;i<300;i++) {
			int ran = (int)(Math.random()*52);
			cc[0] = c[0];
			c[0] = c[ran];
			c[ran] = cc[0];
			
		}
	}

}
