package j0117;

public class Ja0117_05 {

	public static void main(String[] args) {
		
		// 변수
		// 1. 클래스변수 (앞에 static이 붙어있음) - F11 눌렀을 때 만들어짐
		// 2. 인스턴스 변수 (앞에 아무것도 없음) - 실행되자마자 만들어짐 new ~ 하고 정의했을 때
		// 3. 지역변수 (void method안에 있음) - 변수 선언문 수행시 만들어짐
		
		
		
		// 객체 선언
		// aaa, 1111, 홍길동, 20
		// bbb, 2222, 유관순, 24
		// ccc, 3333, 이순신, 22
		
		Stu[] s = new Stu[3];
		
		s[0] = new Stu();
		s[0].id = "aaa";
		s[0].pw = "1111";
		s[0].name = "홍길동";
		s[0].age = 20;
		
		s[1] = new Stu();
		s[1].id = "bbb";
		s[1].pw = "2222";
		s[1].name = "유관순";
		s[1].age = 24;
		
		s[2] = new Stu();
		s[2].id = "ccc";
		s[2].pw = "3333";
		s[2].name = "이순신";
		s[2].age = 23;

	}

}
