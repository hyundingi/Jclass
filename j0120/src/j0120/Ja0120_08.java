package j0120;

public class Ja0120_08 {

	public static void main(String[] args) {
		Car c = new Car();
		c.color = "White";
		c.gearType = "auto";
		c.door = 4;
		
		//red, stick, 5
		Car c2 = new Car("red","stick",5);
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
	}

}
