package j0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아 저장하고, 출력, 합계
		Scanner scan = new Scanner(System.in);
		int[] input = new int[5];
		int sum = 0;
		for (int i=0;i<5;i++) {
			System.out.printf("숫자 %d를 입력하세요 \n",i+1);
			input[i] = scan.nextInt();
			System.out.printf("%d번째 숫자 : %d \n",i+1,input[i]);
			sum += input[i];
		}
		System.out.println("합계 : "+sum);
		
		
		// ---------------------------------------------
//		System.out.println("숫자 1을 입력하세요");
//		int num1 = scan.nextInt();
//		System.out.println("숫자 2을 입력하세요");
//		int num2 = scan.nextInt();
//		System.out.println("숫자 3을 입력하세요");
//		int num3 = scan.nextInt();
//		System.out.println("숫자 4을 입력하세요");
//		int num4 = scan.nextInt();
//		System.out.println("숫자 5을 입력하세요");
//		int num5 = scan.nextInt();
//		
//		int[] nums = {num1, num2, num3, num4, num5};
//		int sum = 0;
//		for (int i=0;i<5;i++) {
//			System.out.println(nums[i]);
//			sum += nums[i];
//		}
//		System.out.println("합계 : "+sum);
	}

}
