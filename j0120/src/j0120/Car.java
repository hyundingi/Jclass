package j0120;

public class Car {
	
	Car(){
//		color = "black";
//		gearType = "auto";
//		door = 4;
		this("white","auto",4);
	}
	
	// 이렇게 많이 씀.
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	String color;
	String gearType;
	int door;

}
