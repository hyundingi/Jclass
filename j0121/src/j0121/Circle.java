package j0121;

public class Circle extends Shape{
	
	// 아래의 p < 객체선언
	// Point p = new Point();
	
	// 생성자
	Circle(){
		this(new Point(0,0),100);
	}
	
	// 괄호 안에 있는 거 - 매개변수 (지역변수)
	Circle(Point center, int r){
		// this 가 있어야 아래에 변수가 되는것임. 
		// 지금 center는 위에 매개변수
		// center = new Point();
		this.center = center;
		this.r = r;
	}
	
	// 인스턴스 변수 선언
	Point center; // 클래스 선언 (인스턴스변수)
	int r;
}
