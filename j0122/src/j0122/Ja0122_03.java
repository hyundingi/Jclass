package j0122;

public class Ja0122_03 {

	public static void main(String[] args) {
		
		// text, caption()
		CaptionTv c = new CaptionTv();
		c.text = "[뮤직비디오] 로제 - APT.";
		c.caption();
		
		System.out.println("자막 : "+c.text);
		// power, channel, power(), channelUP&Down()
		Tv t2 = new Tv();
//		t2.text = "자막기능이 없음";

		
		// 부모 = 자손  | 반대로 자손 = 부모 는 선언조차 안됨
		Tv t = new CaptionTv(); 
//		t.text = "자막"; (사용못함 - 공간은 있지만 사용은 안됨)
		CaptionTv c3;
		c3 = (CaptionTv)t;
		c3.text = "aaa";
		
//		안됨 (t2 (부모=부모)에는 자손의 공간조차 없어서)
//		c3 = (CaptionTv)t2;
		
		
		

	}

}
