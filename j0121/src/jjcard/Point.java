package jjcard;

public class Point {
	
	Point(){} // 기본생성자는 무조건 생성
	
	int x;
	int y;
	
	Point (int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	String getLocation() {
		return "x : "+x+", "+"y : "+y;
	}

}
