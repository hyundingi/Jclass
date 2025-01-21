package jjcard;

public class Card {
	
	String[] s = {"Spade","Diamond","Heart","Clover"};
	String[] n = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	Card(int shape, int number){
		this.shape = shape;
		this.number = number;
	}
	
	int shape;
	int number;
	
	@Override
	public String toString() {
		return String.format("[%s, %s]\n",s[shape],n[number]);
	}

}
