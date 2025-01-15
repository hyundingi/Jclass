package j0115;

import java.util.Arrays;

public class Ja0115_06 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		
		// 1-45 번호저장
		for (int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		
		// 1-45 순차출력 
		for (int i=0;i<ball.length;i++) {
			System.out.println(ball[i]+ " ");
		}
		System.out.println();
		
		// 랜덤숫자 (배열섞기)
		int temp = 0;
		for (int i=0;i<300;i++) {
			int ranNum = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ranNum];
			ball[ranNum] = temp;
		}
		
		for (int i=0;i<6;i++) {
		System.out.println(ball[i]+ " ");
		}
		System.out.println();
	}

}
