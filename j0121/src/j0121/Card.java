package j0121;

class Card {
	// card 한장
	
	Card(){}
	
	Card(int shape,int number){
		this.shape = shape;
		this.number = number;
	}
	
	String[] s = {"","Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	int shape;
	int number;
	
	// 주소값을 바꿔줌
	@Override
	public String toString() {
		String p = "["+s[shape]+", "+n[number]+"]";
		return p;
	}
	

}
