package j0116;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ja0116_02 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("1-100까지 숫자를 입력하세요.");
		
		System.out.println("입력숫자 : "+input);
		
//		int[] num = {1,2,3,4,5};
//		int[] num2 = new int[6];
////		num[5] = 6; 에러
//		
//		for (int i=0;i<num.length;i++) {
//			num2[i] = num[i];
//		}
//		
//		num = num2;
//		num2[5] = 6;
//		
//		System.out.println(Arrays.toString(num));
		
//		
//		int[][] score1 = new int[4][6];
//		
//		for (int i=0;i<score1.length;i++) {
//			for (int j=0;j<score1[i].length;j++) {
//				score1[i][j] = (6*i)+j+1;
//			}
//		}
//		
//		for (int i=0;i<score1.length;i++) {
//			
//			for (int j=0;j<score1[i].length;j++) {
//				System.out.print(score1[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		
//		int[][] score = new int[5][5];
//		//1-25 번호 입력
//		for (int i=0;i<score.length;i++) {
//			for (int j=0;j<score[i].length;j++) {
//				score[i][j] = (5*i)+j+1;
//			}
//				
//		}
//		
//		// 출력
//		for (int i=0;i<score.length;i++) {
//			for (int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}

//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		int[] num2 = {1,2};
//		
//		// 얕은 복사
//		num2 = num;
//		
//		
//		num[0] = 200;
//		
//		System.out.println(Arrays.toString(num));
//		System.out.println(Arrays.toString(num2));

	}

}
