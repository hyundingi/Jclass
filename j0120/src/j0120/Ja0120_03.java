package j0120;

public class Ja0120_03 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Data d = new Data();
		d.x = 10;
		System.out.println(d.x);
//		cal(d);
		d.x = cal(d.x);
		System.out.println(d.x);
	}
	
	static int cal(int x) {
//		d.x = d.x+10;
		x = x+10;
		return x;
	}

}
