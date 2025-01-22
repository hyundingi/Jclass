package j0122;

import java.util.ArrayList;

public class Ja0122_05 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Car c = new Car();
		c.color = "red";
		c.gearType = "auto";
		c.door = 4;
		
		list.add(c);
		list.add(new Car("white","stick",5));
		list.add(new Car("yellow","stick",3));
		System.out.println("개수 : "+list.size());
		
		Car car = (Car)list.get(0);
		System.out.println("0번째 데이터 : "+car.color);
		System.out.println("1번째 데이터 : "+((Car)list.get(1)).color);

	}

}
