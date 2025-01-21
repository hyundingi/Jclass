package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		// card 52장을 만들어서 생성한 후 1-13, 모양 넣기
		
		Deck d = new Deck();
		
		// 출력
		d.print_all(52);
		
//		//카드섞기
		d.shuffle();
		
		// 10번째 카드를 선택
		Card c= d.pick(10);
		d.print_all(c);
//		
//		// 출력2
		System.out.println("---------------[랜덤섞기 후 출력]--------------");
		d.print_all(5);
//	

	}

}
