package j0122;

public class Time {
	Time(){
		
	}
	
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	private int hour;
	private int minute;
	private int second;
	
	void setHour(int hour) {
		this.hour = hour;
	}
	
	int getHour() {
		return hour;
	}
	void setminute(int minute) {
		this.minute = minute;
	}
	
	int getminute() {
		return minute;
	}
	void setsecond(int second) {
		this.second = second;
	}
	
	int getsecond() {
		return second;
	}

}
