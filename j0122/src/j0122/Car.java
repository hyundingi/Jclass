package j0122;

public class Car extends Object {
	
	// 컴파일이 되면 자동으로 생김 
	Car(){
		//super(); // 자동으로 생김
	}
	// 
	
	Car(String color, String gearType, int door){
		super(); // 자동으로 생김
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	String color;
	String gearType;
	int door;
	void drive() {
		System.out.println("자동차가 출발합니다.");
	}
	
	void setDoor(int door) {
		if (door>0 && door<10) {
			this.door = door;
		}
	}
	
	int getDoor() {
		return door;
	}
	
	String getColor() {
		return color;
	}
	

}
