package jcard;

public class Ja01 {

	public static void main(String[] args) {
		
		// 52장 카드를 생성 > 52장 카드를 순차적으로 출력
		Deck d = new Deck();
		d.print_deck();
		// 랜덤으로 섞기 해서 52장 출력
		d.shuffle();
		System.out.println("------------[랜덤섞기]----------------");
		d.print_deck();
		// 0-51까지의 숫자를 입력받아 해당되는 카드 출력
		d.print_deck(50);
		
		
				

	}

}
