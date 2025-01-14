package j0114;

import java.util.Scanner;

public class Ja0114_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("소문자를 입력하세요. ");
		char str = scan.next().charAt(0);
		char str2 = (char)(str-32);
		System.out.println(str2);
		
		
//		char ch1 = 'a';
//		char ch2 = (char)(ch1-32);
//		System.out.println(ch2);
//		
//		char ch3 = 'A';
//		char ch4 = (char)(ch3+32);
//		System.out.println(ch4);
		
//		char c1 = 'A';
//		char c2 = (char)(c1+1);
//		System.out.println(c2);
//		
//		int n1 = c1 +1;
//		System.out.println(n1);
//		
//		char c3 = ++c1;
//		System.out.println(c3);
//		
//		int n2 = 'B' - 'A';
//		System.out.println(n2);
//		
//		int n3 = '9' - '0';
//		System.out.println(n3);
//		
//		int n4 = '2' - '0';
//		System.out.println(n4);
//		
		
//		int a = 100000000;
//		int b = 200000000;
//		long c = (long)a*b; // int * int = int(21억 정도 까지 들어감) -- 21억이 넘어가면 -나옴 (이항연산자)* 하면 안됨
//		System.out.println(c);
//		
//		int n1 = 2100000000;
//		int n2 = 2000000000;
//		long n3 = n1+n2;
//		System.out.println(n3);
		
		// byte, short, char > 사칙연산을 하면 int로 타입이 변경됨
//		byte a = 1;
//		byte b = 2;
//		byte c = (byte)(a+b);
//		byte d = (byte)a+(byte)b; 안됨. 에러
//		
//		char ch = 'a';
//		char ch2 = 'b';
//		int ch3 = ch+ch2;
//		System.out.println(ch3);
//		
//		
//		double d1 = 3.14;
//		int num = (int)d1;
//		System.out.println(num);
		
		
//		int a = 10;
//		int b = ++a;
//		int b1 = a++;
//		System.out.println("a : "+a);
//		System.out.println("b : "+b);
//		System.out.println("b1 : "+b1);

	}

}
