package j0117;

public class Ja0117_01 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv(); // Tv 클래스를 객체선언함
		t1.color = "red"; // Tv 클래스에 있는 color 값 설정(참조변수)
		t1.power = false;
		t1.channel = 7;
		
		t1.power();
		t1.channelUp();
		
		System.out.println("현재채널 : "+t1.channel);

	}

}
