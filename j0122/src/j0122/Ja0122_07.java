package j0122;

import java.util.ArrayList;

public class Ja0122_07 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Time t = new Time(1,1,1);
		// 20개를 생성 > 20개 출력
		
		
		for (int i=0;i<20;i++) {
			int ran = (int)(Math.random()*24); 
			int ranm = (int)(Math.random()*60); 
			list.add(new Time(ran,ranm,ranm));
			Time tt = (Time)list.get(i);
			System.out.printf("%d시 %d분 %d초 \n",tt.getHour(),tt.getminute(),tt.getsecond());
		}
	}

}
