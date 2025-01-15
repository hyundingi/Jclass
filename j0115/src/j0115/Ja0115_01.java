package j0115;

public class Ja0115_01 {

	public static void main(String[] args) {
		// 배열
		
		//score 배열 100개를 만들어서 100까지 숫자를 입력해서 출력
//		int[] score = new int[100];
//		int sum = 0;
//		for (int i=0;i<100;i++) {
//			score[i] = i;
//			System.out.println(score[i]);
//			sum += score[i];
//		}
//		System.out.println("합계 : "+sum);
		
		// 1-10 까지의 랜덤숫자를 입력해서 합계 출력
		int [] score = new int[100];
		int sum = 0; 
		for (int i=0;i<100;i++) {
			int ran = (int)(Math.random()*10)+1;
			score[i] = ran;
			sum += score[i];
			System.out.println("랜덤 숫자 : "+score[i]);
		}
		System.out.println("합계 : "+sum);
		
		
		
		
		
		
		// 배열에 데이터 넣기
		// 1번
//		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		score[6] = 7;
//		score[7] = 8;
//		score[8] = 9;
//		score[9] = 10;
//		
//		// 2번
//		int[] score2 = {1,2,3,4,5,6,7,8,9,10};
//		
//		// 3번
//		int[] score3 = new int[10];
//		for (int i=0;i<10;i++) {
//			score[i] = i+1;
//		}
		
//		int[] num = new int[10];
//		for (int i=0;i<10;i++) {
//			num[i] = i+1;
//		}
//		
//		for (int i=0;i<10;i++) {
//			System.out.println(num[i]);
//		}
//		
//		int[] score; // 선언은 했지만 new 가 없어서 생성된건 아님 (주소값만 생김) 생성하면 기본값으로 셋팅됨
		
//		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		System.out.println(score[0]);
//		
//		System.out.println(score); // 배열의 주소값이 출력됨 (new 라고 되어있는 건 다 주소값이 나옴)
		
		
//		String str = new String("abc");
//		String str2 = "abc";
//		System.out.println(str);
		
//		if (str==str2) {
//			안됨
//		}
//		if (str.equals(str2)) {
//			이렇게 해애함
//		}
	}

}
