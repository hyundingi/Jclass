package j0115;

import java.util.Scanner;

public class Ja0115_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 로또 번호 입력을 3개 받아 출력하시오
//		int[] input = new int[3];
//		
//		for (int i=0;i<3;i++) {
//			System.out.println("번호 입력");
//			input[i] = scan.nextInt();
//		}
		
		int[] input = new int[3];
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		String[] name = new String[3];

		// 국어 영어 수학 점수 , 합계 3명
		int [][] score = new int[3][5];
		for (int i=0;i<3;i++) {
			System.out.println("이름을 입력하세요 >> ");
			name[i] = scan.next();
			int total = 0;
			for (int j=0;j<score[i].length-2;j++) {
				System.out.printf("%s 점수를 입력하세요. >> ",title[j+1]);
				score[i][j] = scan.nextInt();
				}
			total = score[i][2]+score[i][1]+score[i][0];
			score[i][3] = total;
			score[i][4] = total/3;
		}
		// 출력
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t\n", title[0], title[1], title[2], title[3], title[4], title[5]);
		System.out.println("--------------------------------------------");
		for (int i=0;i<3;i++) {
			System.out.print(name[i]+"\t");
			for (int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
