package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 5,5 배열 생성
		String[][] arr = new String[5][5];
		String[][] arr2 = new String[5][5];
		int money = 0;
		int count = 0;
		
		int[] num = new int[25];
		for (int i=0;i<5;i++) {
			num[i] = 1;
		}
		
		// 섞기
		int temp = 0;
		for (int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}
		
//		System.out.println(Arrays.toString(num));
		
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				arr2[i][j] = num[5*i+j]+"";
				arr[i][j] = "뽑기";
			}
		}
		
		int no = 0;
		while(no<10) {
			
		// 뽑기 출력
		System.out.println("                  [ 뽑기 게임 ]");
		System.out.println("--------------------------------------------");
		System.out.println("좌표 |\t0\t1\t2\t3\t4\t");
		System.out.println("--------------------------------------------");
		
		for (int i=0;i<arr.length;i++) {
			System.out.printf("%d   |\t",i);
			for (int j=0;j<arr[i].length;j++) {
				System.out.printf("%s\t",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		
		// 좌표 입력
		System.out.print("X좌표를 입력하세요. >> ");
		int x = scan.nextInt();
		if (x == -1) {
			System.out.println("프로그램이 종료됩니다.");
			break;
		}
		System.out.print("Y좌표를 입력하세요. >> ");
		int y = scan.nextInt();
		System.out.printf("입력한 좌표 : [%d,%d]\n",x,y);
		
		if (x>=0 && x<=4 && y>=0 && y<=4) {
			
		if(arr2[x][y].equals("1")) {
			arr[x][y] = "당첨";
			count ++;
			if (count == 1) {
				money = 100000000;
			}
			money = money*count;
			}else {
				arr[x][y] = "꽝";
			}

		System.out.printf("결과 : %s \n",arr[x][y]);
		System.out.printf("내 코인 : %d \n",money);
		
		no++;
		}else {
			System.out.println("좌표를 잘못 입력하셨습니다. 다시 입력하세요.");
		}
		}
		
	
		
//		// 번호 출력
//		System.out.println("                  [ 뽑기 게임 ]");
//		System.out.println("--------------------------------------------");
//		System.out.println("좌표 |\t0\t1\t2\t3\t4\t");
//		System.out.println("--------------------------------------------");
//		
//		for (int i=0;i<arr2.length;i++) {
//			System.out.printf("%d   |\t",i);
//			for (int j=0;j<arr2[i].length;j++) {
//				System.out.printf("%s\t",arr2[i][j]);
//			}
//			System.out.println();
//		}
		
		
		

	}

}
