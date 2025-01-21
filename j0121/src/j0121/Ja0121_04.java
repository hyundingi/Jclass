package j0121;

import java.util.Scanner;

public class Ja0121_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			
		System.out.println("[카드게임]");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		
		// 클래스는 객체선언 해야함
		// 클래스 변수 (클래스 명.변수명 >> 객체선언 없음)
		
		// 클래스 != 객체
		// Deck클래스 > 객체를 만들어야 (객체 선언) 클래스를 쓸 수 있음
		// 객체는 저장공간 / 클래스는 설명서 (~~ 식으로 만들어라)
		// 클래스 였다가 저장공간이 생기면(객체선언 후) 객체가 됨
		
		// 오버라이딩 메소드 재정의 - 선언부는 다 같아야함 / 상속일 때만 가능
		// 파이널이 붙어있으면 오버라이딩 할 수 없음
		
		// 패키지 : 폴더
		// 임폴트 : 위에 정의하면 사용할 때 앞에 패키지 명 생략가능하다
		
		/*
		제어자
		 * 접근 제어자 : 퍼블릭, 프로텍티드, 디폴트, 프라이빗 그 외 : 스태틱, 파이널 등 미완성의 메소드 - abstract 사용 :::
		 * 무조건 재정의 하고 싶을 때
		 */
		
		switch(choice) {
		case 1:
			Deck d = new Deck(); // 클래스 였다가 저장공간이 생기면(객체선언 후) 객체가 됨 !!
		}
		} // while

	}

}
