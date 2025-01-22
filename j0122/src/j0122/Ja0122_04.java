package j0122;

public class Ja0122_04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Car c = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		Ambulance a = null;
		Ambulance a2 = new Ambulance();
		fe.water();
		
		c = fe;
//		c.water(); // 공간은 있지만 출력은 되지 않음 - 에러
		c = a2;
		
		if (c instanceof FireEngine) {
			fe2 = (FireEngine)c;
			fe2.water();
		}else if (c instanceof Ambulance) {
			a = (Ambulance)c; // 에러 표시는 없지만 실행은 안됨
			a.siren();
		}
		
		//FireEngine > ambulance
		
		
		

	}

}
