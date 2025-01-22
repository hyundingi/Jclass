package j0122;

import stu.Shape;

public class Ja0122_01 {

	public static void main(String[] args) {
		// private - 같은 클래스 , default - 같은 클래스 같은 패키지
		// protected - 같은 클래스 같은 패키지 자손클래스, public - 전체
		
		
		Time t1 = new Time(12,05,10);
		System.out.println(t1.getHour());
		t1.setHour(t1.getHour()+4);
		System.out.println(t1.getHour());
		
		// 17,35,30 
		Time t2 = new Time(17,35,30);
		System.out.printf("%d시 %d분 %d초",t2.getHour(),t2.getminute(),t2.getsecond());
		
		
		
//		Car c = new Car();
//		System.out.println(c.getColor());
//		System.out.println(c.getDoor());
//		c.setDoor(5);
//		System.out.println(c.getDoor());
//		
//		Car c2 = new Car("white","auto",5);
//		System.out.println(c2.getColor());
//		
//		Shape s = new Shape();

	}

}
