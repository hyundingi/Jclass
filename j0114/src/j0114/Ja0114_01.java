package j0114;

public class Ja0114_01 {

	public static void main(String[] args) {
		boolean temp = true; // 논리형
		char ch = 'a';       // 문자형
		byte n1 = 1;         // 정수
		short n2 = 2;        // 정수형
		int num = 100;       // 정수형
		long num2 = 10000L;  // 정수형
		float f = 3.14F;     // 실수형
		double d = 10.35;    // 실수
		String str = "abc";  // 문자열
		
		
		System.out.println(temp);
		System.out.println(ch);
		System.out.println(num);
		
		// printf
		System.out.printf("논리형 : %b \n", temp);
		System.out.printf("문자형 : %c \n", ch);
		System.out.printf("정수형 : %d, %d \n", num, num2);
		System.out.printf("실수형 : %.2f, %f \n", f, d);
		System.out.printf("실수형 : %s \n", str);
		

	}

}
