package j0120;

import java.util.Arrays;

public class Ja0120_04 {

	public static void main(String[] args) {
		
		
		// 두 수를 cal3에 보내면 +-*의 값을 리턴해서 출력
		Cal3 c3 = new Cal3();
		int[] re = new int[3];
		int a = 10;
		int b = 3;
		
		c3.op(a,b,re);
		
		
		// cal2 에서 이름을 입력받아 
		// main 메소드에서 출력
		
//		Cal2 p = new Cal2();
//		String[] a = p.print();
		
		
		
		// 입력부분을 class로 분리
//		
//		Input i = new Input();
//		// 5개를 입력받아 출력
//		// 배열
//		int input = i.valInput();
//		System.out.println("입력값 : "+input);
//		
//		int[] inputArr = new int[5];
//		for (int j=0;j<inputArr.length;j++) {
//			inputArr[j] = i.valInput();
//		}
//		
//		System.out.println(Arrays.toString(inputArr));
		
		
		
//		int a = 3;
//		int b = 10;
//		
//		Cal c = new Cal();
//		
//		int result = c.multi(a,b);
//		System.out.println(result);
//		
//		int result2 = c.add(a, b);
//		System.out.println(result2);
//		
//		double result3 = c.div(a, b);
//		System.out.println(result3);
		
	}

}
