package j0122;

import java.util.ArrayList;

public class Ja0122_06 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		ArrayList list = new ArrayList();
		list.add(new Car("white","auto",4));
		list.add(new Car("red","stick",5));
		list.add(new Car("blue","auto",2));
		list.add(new Car("black","stick",4));
		list.add(new Car("yellow","auto",6));
		
		for (int i=0;i<list.size();i++) {
			Car c = (Car)list.get(i);
			System.out.printf("[%s, %s, %d]\n",c.color,c.gearType,c.door);
		}

	}

}
