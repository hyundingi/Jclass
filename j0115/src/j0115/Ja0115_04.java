package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1-100 까지의 랜덤숫자 생성
		// 10번의 도전 정답 맞추면 종료
		// 랜덤숫자보다 큰 수 작은 수 
		// 입력한 숫자를 모두 출력
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random()*100)+1;
		int[] input = new int[10];
		int count = 0;
		for (int i=0;i<10;i++) {
			System.out.printf("%d 번째 도전 | 1-100 숫자를 입력하세요. \n",i+1);
			input[i] = scan.nextInt();
			count += 1;
			if (ran == input[i]) {
				System.out.println("정답입니다.");
				break;
			}else if (ran > input[i]) {
				System.out.println("입력한 숫자가 랜덤 숫자보다 작습니다. 큰 수를 입력하세요.");
			}else {
				System.out.println("입력한 숫자가 랜덤 숫자보다 큽니다. 작은 수를 입력하세요.");
			}
		}
		System.out.println("정답숫자 : "+ran);
		System.out.println("지금까지 입력한 숫자 : ");
		System.out.print("[");
		for (int i=0;i<count;i++) {
			System.out.printf(" %d ",input[i]);
		}
		System.out.print("]");
	}

}
