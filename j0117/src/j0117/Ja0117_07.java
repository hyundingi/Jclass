package j0117;

public class Ja0117_07 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Stu.count = 10; // 클래스 변수 - 클래스명.변수명 / 객체선언 없이 사용 가능
		System.out.println(Stu.count);
		
		Stu s1 = new Stu(); // 객체 선언 (참조변수 생성)
		s1.id = "aaa"; // 인스턴스변수 - 참조변수.변수명 / 객체선언 후 사용 가능
		s1.count = 100;
		s1.age = 100;
		System.out.println(Stu.count);
		
		Stu s2 = new Stu();
		s2.id = "bbb";
		s2.count = 500;
		s2.age = 500;
		System.out.println(s1.count);
		System.out.println(s2.count);
		

	}

}
