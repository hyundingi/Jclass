package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5*5 배열 생성
		String[][] arr = new String[5][5];
		String[][] arr2 = new String[5][5];
		int[] num = new int[25];
		
		
		// 뽑기 글자 입력
		
		System.out.println("--------------------뽑기--------------------");
		System.out.println("좌표  | 0\t1\t2\t3\t4\t");
		System.out.println("-------------------------------------------");
		
		for (int i=0;i<arr.length;i++) {
			System.out.printf("%d    |",i);
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j] = "뽑기";
				System.out.printf("%s \t",arr[i][j]);
			}
			System.out.println();
		}
				
		
		// 25개 1차원 배열 생성
		for(int i=0;i<5;i++) {
			num[i] = 1;
		}
		
		// 배열 섞기
		int temp = 0;
		for (int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}
		
		//1차원 배열 값 넣기
		for (int i=0;i<arr2.length;i++) {
			for (int j=0;j<arr2[i].length;j++) {
				arr2[i][j] = num[5*i+j]+"";
			}
		}
		
		System.out.println(Arrays.toString(num));
		// 번호 입력
		System.out.print("X좌표 입력 >> ");
		int x = scan.nextInt();
		System.out.print("Y좌표 입력 >> ");
		int y = scan.nextInt();
		System.out.printf("입력한 좌표 : [%d,%d] \n", x,y);
		
		if (arr2[x][y].equals("1")) {
			arr2[x][y] = "당첨";
		}
		
		
		// 당첨 확인
		System.out.printf("당첨결과 : %s", arr2[x][y]);
		
		
		
		
		// 

	}

}
