package j0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ja0115_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] input = new int[6];
		String[] balls = new String[45];
		for (int i=0;i<45;i++) {
			balls[i] = i+1+"";
		}
		int k = 0;
		while(k<6) {
			System.out.println("              [로또맞추기]");
			
			for (int i=0;i<balls.length;i++) {
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
		System.out.println(Arrays.toString(input));
		// 입력번호 : 모두 출력되도록 하시오
		
		
//		int[] num = {1,151,3,84,5,2,7};
//		Integer[] num2 = {1,151,3,84,5,2,7};
//		System.out.println(Arrays.toString(num));
		// 순차정렬
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
		// 역순정렬
//		Arrays.sort(num2,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num2));

	}

}
