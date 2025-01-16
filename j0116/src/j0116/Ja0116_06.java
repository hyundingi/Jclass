package j0116;

import java.util.Scanner;

public class Ja0116_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 변수선언
		int[] no = new int[5];
		String[] name = new String[5];
		int[][] score = new int[5][4];
		double[] avg = new double[5];
		int i = 0;
		int count = 0;
		
		// 화면구현
		loop:while (true) {
			
		System.out.println("[학생성적프로그램]");
		System.out.println("--------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("0. 종료");
		System.out.println("--------------");
		System.out.print("원하는 번호 입력 >> ");
		int choice = scan.nextInt();
		
		// 번호선택 switch
		switch (choice) {
		// 학생성적입력
		case 1: {
			while (true) {
				System.out.println("[학생성적입력]");
				i = count;
				no[i] = i+1;
				System.out.println("이름을 입력하세요. (0. 종료)");
				name[i] = scan.next();
				if (name[i].equals("0")) {
					System.out.println("뒤로가기");
					break;
				}
				int total = 0;
				for (int j=0;j<3;j++) {
					System.out.println("점수를 입력하세요.");
					score[i][j] = scan.nextInt();
					total += score[i][j];
				}
				score[i][3] = total;
				avg[i] = total/3.0;
				i++;
				count++;
			}//while
			break;
		}
		// 학생성적출력
		case 2: {
			System.out.println("[학생성적출력]");
			for (i=0;i<count;i++) {
				System.out.printf("%s\t",no[i]);
				System.out.printf("%s\t",name[i]);
				for (int j=0;j<4;j++) {
					System.out.printf("%d\t",score[i][j]);
				}
				System.out.printf("%.2f\n",avg[i]);
			}
			break;
		}
		default:
			System.out.println("프로그램을 종료합니다.");
			break loop;
		}// switch 
		}// while

	}

}
