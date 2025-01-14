package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		
		// -----------------------------------------------------------------------------------------
		// 값만 봐도 타입을 알 수 있게 해줘야함 (타입 때문에 오류가 많이 나기 때문)
		// boolean : true, false
		// char : ''표시, 아스키코드값 65-'A', 97-'a', 48 - '0'
		// 정수형 : byte, short 거의 사용 안 함 | int(기본형) 값을 입력 | long - 접미사 L을 마지막에 붙여야함
		// 실수형 : float - 접미사 F, double - 접미사 D (생략가능)
		// -----------------------------------------------------------------------------------------
		
		
		char ch = 'A';
		System.out.println(ch);
		
		// 16진수
		char ch2 = '\u0041'; // 16*4 + 1*1 = 65
		System.out.println(ch2);
		
		char ch3 = 97;
		System.out.println(ch3);
		
		// \t : tab키 | print : 옆으로 출력 | println : 엔터쳐져서 출력
		char ch4 = '\t';
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		
		boolean p = true;
		boolean p2 = false;
		
		// long 할 때는 마지막에 무조건 L을 넣어야함
		long l = 10000000000L;
		System.out.println(l);
		
		float f = 3.14F;
		float f2 = 100; // 대부분 일부러 실수형이라는 것을 알려주기 위해 F를 붙임
		float f3 = 100.0F;
		
		double d = 3.14; // 실수인데 뒤에 접미사가 없으면 double 인 줄 앎
		double d2 = 3.14D;
	}

} 
