package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_03 {

	public static void main(String[] args) {
		// 1-5까지의 랜덤숫자를 생성해서 
		// 5번 입력받고 몇번 맞췃는지 횟수 출력
		// 입력했던 숫자도 모두 출력
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random()*5)+1; // 랜덤숫자
		int[] input = new int[5]; // 입력한 숫자 배열
		
		for (int i=0;i<5;i++) {
			System.out.printf("%d 번째 도전 | 숫자를 입력하세요. \n", i+1);
			input[i] = scan.nextInt();
			if (ran == input[i]) {
				System.out.println("정답입니다.");
				break;
			}else if (ran > input[i]){
				System.out.println("입력한 숫자가 랜덤 숫자보다 작습니다. 큰 수를 입력하세요.");
			}else {
				System.out.println("입력한 숫자가 랜덤 숫자보다 큽니다. 작은 수를 입력하세요.");
			}
		}
		System.out.println("정답숫자 : "+ran);
		System.out.println(Arrays.toString(input));

	}

}
