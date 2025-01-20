package j0120;

import java.util.Scanner;

public class Cal4 {
	
	void input(String[] name, int[] kor) {
		// 이름 국어점수 ㅇ입력
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<3;i++) {
			System.out.printf("이름 %d 을 입력하세요\n", i+1);
			name[i] = scan.next();
			System.out.printf("국어점수 %d 을 입력하세요\n", i+1);
			kor[i] = scan.nextInt();
		}
		
	}

}
