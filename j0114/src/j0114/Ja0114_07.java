package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// for문 : 반복 횟수가 있는 경우
		// while문 : 조건이 주어졌을 때
		
		// while 로 구구단 출력
		int i = 2;
		while(i<=9) {
			System.out.printf("[%d 단] \n",i);
			int j = 1;
			while(j<=9) {
				System.out.printf("%d * %d = %d \t",i,j,i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		// while  문
//		int i = 1;
//		while(i<=5) {
//			System.out.println("안녕");
//			i++;
//		}
//		
//		// for 문
//		for (int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//		}
		
		// 두개의 숫자를 입력받아 둘 사이의 구구단 구현
//		System.out.println("숫자1을 입력하세요. ");
//		int num = scan.nextInt();
//		System.out.println("숫자2을 입력하세요. ");
//		int num2 = scan.nextInt();
//		
////		int max, min;
////		if (num>num2) {
////			max = num;
////			min = num2;
////		}else {
////			max = num2;
////			min = num;
////		}
////		
//		int max = Math.max(num, num2);
//		int min = Math.min(num, num2);
//		
//		for (int i=min; i<=max; i++) {
//			System.out.printf("[%d 단] \n", i);
//			for (int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t", i,j,i*j);
//			}
//			System.out.println();
//		}
		
		// 입력받은 숫자부터 9단까지 출력 프로그램 구현
//		System.out.println("숫자를 입력하세요. ");
//		int num = scan.nextInt();
//		for (int i=num; i<=9; i++) {
//			System.out.printf("[%d 단] \n", i);
//			for (int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t", i,j,i*j);
//			}
//			System.out.println();
//		}
		
		
		// 구구단
//		for (int i=2; i<=9; i++) {
//			System.out.printf("[%d 단] \n", i);
//			for (int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t", i,j,i*j);
//			}
//			System.out.println();
//		}
		
		// 모두 영문자 일때만 1개씩 출력하시오
//		System.out.println("영문자를 입력하세요.");
//		String input = scan.next();
//		int result = 1;
//		
//		for (int i=0; i<input.length();i++) {
//			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z' || input.charAt(i) >= 'A' && input.charAt(i) <= 'Z' ) {
//				result = ++i;
//			}else {
//			result = 0;
//			}
//		}
//		
//		if (result == input.length()) {
//			for (int i=0; i<input.length();i++) {
//				System.out.println(input.charAt(i));
//			}
//		}else {
//			System.out.println("모두 영문자가 아닙니다. 다시 입력하세요.");
//		}
		
		// 입력받은 글자를 1개씩 출력하는 프로그램을 구현하시오
//		System.out.println("글자를 입력하세요.");
//		String input = scan.next();
//		for (int i=0; i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
//		
//		String input ="abcdefghigk";
//		System.out.println(input.length());
//		System.out.println(input.charAt(4));
//		System.out.println(input.charAt(input.length()-1));
		
		
//		System.out.println("글자를 입력하세요. (영문자만 입력가능) : ");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
//			System.out.println("출력 : "+ch);
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요.");
//		}
		
		
		
		
		
		
//		for(int i=1;i<=5;i++) {
//			System.out.println("안녕하세요.");
//		}

	}

}
