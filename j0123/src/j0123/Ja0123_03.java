package j0123;

import java.util.Scanner;

public class Ja0123_03 {

	public static void main(String[] args) {
		
		
		try {
			// 정상적으로 돌아가는 프로그램
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			Exception e1 = new Exception("고의로에러발생");
			throw e1;
			
		} catch (Exception e) {
			// 에러났을 때 도는 프로그램
			System.out.println(e.getMessage());
			e.printStackTrace(); // 무슨 에러인지 보는 구문
			System.out.println("에러발생3-1");
			System.out.println("에러발생4-1");
		}
		System.out.println(5);
		System.out.println(6);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("안녕하세요.");
//		int[] n = new int[3];
//		for (int i=0;i<4;i++) {
//			System.out.println("숫자를 입력하세요.");
//			n[i] = scan.nextInt();
//		}
	}

}
