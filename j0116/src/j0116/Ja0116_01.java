package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_01 {

	public static void main(String[] args) {
		
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		int[] ball = new int[45];
		int[] lotto = new int[6];
		int[] input = new int[6];
		int[] answer = new int[6];
		int count = 0;
		
		// 공 만들기
		for (int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		
		
		// 공 섞기
		int temp = 0;
		for (int i=0;i<300;i++) {
			int ran = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ran];
			ball[ran] = temp;
		}
		
		// ball 6개의 숫자를 lotto에 복사
		for (int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		
		// 번호 입력
		for (int i=0;i<6;i++) {
			System.out.printf(" %d번째 번호를 입력하세요. >> ",i+1);
			input[i] = scan.nextInt();
		}
		
		// 입력번호와 로또 번호 비교
		for (int i=0;i<6;i++) {
			for (int j=0;j<6;j++) {
				if (input[i] == lotto[j]) {
					answer[count] = input[i];
					count++;
					break;
				}
			}
		}
		
		// 공 출력
		System.out.println("[로또 번호 확인]");
		System.out.println("--------------------------------------");
		System.out.printf("로또번호 : %s\n", Arrays.toString(lotto));
		System.out.printf("입력번호 : %s\n", Arrays.toString(input));
		System.out.printf("맞춘개수 : %d\n", count);
		System.out.print("맞춘번호 : ");
		for (int i=0;i<count;i++) {
			System.out.print(answer[i]+" ");
		}
		System.out.println();
		
		
		
//		// 배열에 데이터 넣는 법 1
//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		// 배열에 데이터 넣는 법 2
//		int[] num2 = {1,2,3,4,5};
//		
//		// 배열에 데이터 넣는 법 3
//		int[] num3 = new int[5];
//		for (int i=0;i<5;i++) {
//			num3[i] = i+1;
//		}
//		
//		System.out.println(num); // 주소값 출력
//		System.out.println(num[0]); 
//		System.out.println(Arrays.toString(num)); 

	}

}
