package j0113;

public class Ja0113_08 {

	public static void main(String[] args) {
		// 연산자
		System.out.println(10/3.0);
		
		// %d - 정수형 byte, short, int, long 
		// %f - 실수형 float, double
		// %s - 문자형 String
		// %c - 문자형 char
		System.out.printf("%.3f \n", 10/3.0); // 3.333 
		System.out.printf("%,d \n", 1000000); // 1,000,000
		System.out.printf("%,d \n", 0x1A); // 26
		System.out.printf("%#X \n", 65); // 0X41
		System.out.printf("나이 : %d, 생년월일 : %d \n", 27, 2017);
		System.out.println("나이 : "+14 + " 생년월일 : "+2017);

	}

}
