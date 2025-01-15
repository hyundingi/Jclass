package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_09 {

	public static void main(String[] args) {
		// 로또번호 6개와 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력
		// 로또 번호
		// 입력번호
		// 맞춘개수
		// 맞춘번호
		
		// -------------------------------- 로또 만들기 -----------------------------------
		// 1. 변수 선언
		Scanner scan = new Scanner(System.in);
		int[] num = new int[45];   // 1-45번호
		int[] lotto = new int[6];  // 로또번호
		int[] input = new int[6];  // 내가 입력한 번호
		int[] answer = new int[6]; // 맞춘 번호
		int i = 0;
		
		// 2. 로또 번호 num에 넣기
		for (i=0;i<45;i++) {
			num[i] = i+1;
		}
		
		// 3. 로또 번호 뽑기
		int l = 0;
		loop:while (l<6) {
			int ran = (int)(Math.random()*45)+1;
			
			for (int j=0;j<l;j++) {
				if (ran == lotto[j]) {
					continue loop;
				}
			}
			lotto[l] = ran;
			l++;
		}
		
//		System.out.println("로또번호 : "+Arrays.toString(lotto));
		// 4. 로또 맞추기 (번호, 개수)
		
		String[] balls = new String[45];
		for (i=0;i<45;i++) {
			balls[i] = i+1+"";
		}
		int k = 0;
		while(k<6) {
			System.out.println("              [로또맞추기]");
			
			for (i=0;i<balls.length;i++) {
				if (i%5==0) {
					System.out.println();
				}
				System.out.print(balls[i]+"\t");
			}
			
			System.out.println();
			System.out.println("원하는 번호를 입력하세요. >> ");
			input[k] = scan.nextInt();
			
			balls[input[k]-1] = "X";
			k++;
		}
		
		
		int count = 0;
		for (i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (lotto[i] == input[j]) {
					answer[j] = lotto[i];
					count += 1;
				}
			}
					
		}
		
		// 5. 출력
		System.out.print("이번주 로또번호 : \n");
		for (i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		System.out.println("내가 입력한 번호 : ");
		for (i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------");
		System.out.printf("맞춘 개수 : %d \n", count);
		
		
		System.out.printf("맞춘 번호 : ");
		for (i=0;i<answer.length;i++) {
			if (answer[i] != 0) {
				System.out.print(answer[i]+" ");
			}
		}
		
		

	}

}
