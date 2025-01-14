package j0114;

import java.util.Scanner;

public class Ja0114_02 {

	public static void main(String[] args) {
		// input("데이터를 입력하세요")
		
		// 1. 입력을 위해서 객체 선언을 해야함 꼭!
		Scanner scan = new Scanner(System.in);
		// 정수형 - nextInt, nextLong, nextByte, nextShort
		// 실수형 - nextFloat, nextDouble
		// 문자열 - next, nextLine
				
		
		System.out.println("문자열을 입력하세요. ");
		String str1 = scan.next();
		System.out.println("문자열1 : "+str1);
		scan.nextLine();
		
		System.out.println("문자열을 입력하세요. ");
		String str2 = scan.nextLine();
		System.out.println("문자열2 : "+str2);
		
		
		/*
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		System.out.println("입력한 숫자 : "+num);
		
		System.out.println("실수를 입력하세요. ");
		float f = scan.nextFloat();
		System.out.println("실수 : "+f);
		
		System.out.println("실수를 입력하세요. ");
		double d = scan.nextDouble();
		System.out.println("실수 : "+d);
		*/
		
	}

}
