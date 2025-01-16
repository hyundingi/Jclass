package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 로또 맞추기 -- 9번처럼
		// 1-45까지 로또번호 6개와
		// 입력한 숫자 6개를 비교해서 맞춘 개수와 번호를 출력하시오.
		//1. 변수선언
		//2. 1-45 번호저장
		//3. 배열섞기
		//4. 6개 로또번호
		//5. 입력창만들기
		// 6. 맞춘번호 확인 - input,lotto
		// 7. 출력
		
		// 1. 변수선언
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int[] balls = new int[45];
		int[] lotto = new int[7];
		int[] input = new int[6];
		int[] answer = new int[7];
		
		
		// 2. 번호저장
		for (i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		
		// 3. 배열 섞기
		int temp = 0;
		for (i=0;i<300;i++) {
			int ran = (int)(Math.random()*45);
			temp = balls[0];
			balls[0] = balls[ran];
			balls[ran] = temp;
			
		}
//		System.out.println(Arrays.toString(balls));
		
		// 4. 6개 +1 로또 번호
		for (i=0;i<lotto.length;i++) {
			lotto[i] = balls[i];
		}
		
		// 5. 입력창 만들기
		for (i=0;i<input.length;i++) {
			System.out.printf("로또 번호 %d 입력 >> ", i+1);
			input[i] = scan.nextInt();
			
		}
		
		// 6. 맞춘 번호 확인
		int count = 0;
		for (i=0;i<lotto.length;i++) {
			for (int j=0;j<input.length;j++) {
				if (lotto[i] == input[j]) {
					answer[count] = lotto[i];
					count +=1 ;
				}
			}
		}
		
		// 7. 출력
		System.out.println("[로또 번호]");
		for (i=0;i<lotto.length-1;i++) {
			System.out.print(lotto[i]+"\t");
		}
		System.out.println();
		System.out.println("보너스 번호 : "+lotto[lotto.length-1]);
		
		System.out.println("[내가 입력한 번호]");
		for (i=0;i<input.length-1;i++) {
			System.out.print(input[i]+"\t");
		}
		System.out.println();
		
		System.out.println("[맞춘 번호]");
		for (i=0;i<count;i++) {
			System.out.print(answer[i]+"\n");
		}
		
		System.out.println("맞춘 개수 : "+count);
		
		
		
		
	}

}
