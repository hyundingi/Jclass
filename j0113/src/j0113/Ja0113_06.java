package j0113;

public class Ja0113_06 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = 65;
		System.out.println(ch2);
		
		int ch3 = 65;
		System.out.println(ch3);
		
		// char ch4 = 'AB';
		String ch4 = "AB";
		System.out.println(ch4);
		
		String num = "3.14";
		System.out.println(num);
		
		String s1 = "A"+"B";
		System.out.println(s1); 
		
		System.out.println(""+7); // 7
		System.out.println(""+7+7); // 77
		System.out.println(7+7+""); // 14
		System.out.println(7+7+""+7); // 147
		
		char ch5 = ' '; // 사이에 공백 가능 / '' 없는 건 에러
		
		byte b1 = 127;
		
		// 정수의 오버플로우
		int n1 = 2147483647;
		int n2 = n1 + 1;
		int n3 = n1 + 2;
		
		System.out.println(n2); // -2147483648
		System.out.println(n3); // -2147483647
		System.out.println();
	}

}
