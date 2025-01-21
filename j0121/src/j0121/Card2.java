package j0121;

public class Card2 {
	// card 한장
	
	Card2(){}
	
	Card2(String shape,String number){
		this.shape = shape;
		this.number = number;
	}
	
	String[] s = {"","Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	String shape;
	String number;
	
	// 주소값을 바꿔줌
//	@Override
//	public String toString() {
//		String p = "["+shape+", "+n[number]+"]";
//		return p;
//	}
	

}
