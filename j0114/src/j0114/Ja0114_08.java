package j0114;

import java.util.Scanner;

public class Ja0114_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//break : 반복문을 중지
		// continue : 1번만 중지
		
		for (int i=2;i<=9;i++) {
			for (int j=1;j<=9;j++) {
				if (j==3) {
					continue;
				}
				System.out.printf("%d");
			}
		}
		
		
		
		
		
		
		
		// 반복문 : for , while
		// boolean, char, byte, short, int, long, float, double 기본형 타입
		// == 등가비교
		
		
		
		
//		String str = "홍길동";
//		String str2 = "홍길동";
//		System.out.println("이름을 입력하세요 >> ");
//		String input = scan.next();
//		
////		if (str==str2) {  는 같은 주소를 사용하기 때문에 같다고 나옴 
//		if (str.equals(input)) { // 인풋으로 입력받으면 같은 주소를 사용하지 않기 때문에 == 은 다르다고 나옴. equals 사용해야함.
//			System.out.println("홍길동이 맞습니다");
//		}else {
//			System.out.println("홍길동이 아닙니다.");
//		}
//		
//		String str = "안녕하세요.";
//		String str2 = "안녕";
//		String str3 = "안녕하세요.";
//		String str4 = new String("안녕하세요.");
//		
//		System.out.println(str);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		// 다릅니다 출력. 8가지 기본형 타입 이외의 등가 비교는 equals()를 사용해야함.
//		// String 2개 이상의 값을 저장하기 때문에 == 비교가 안 됨.
////		if(str==str4) {
//		if(str.equals(str4)){
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//			
//		}
		
//		if (str == str2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		
//		System.out.println("----------------------------------------");
//		if(str==str3) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
//		int num = 10;
//		int num2 = 10;
//		
//		if(num == num2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		// 1-100 랜덤 숫자를 입력받아 10번을 입력해서 숫자 맞추기 게임 구현
		// 10번 이후에는 정답 공개
		
//		int hidden = (int)(Math.random()*100)+1;
//		int i = 1;
//		while (i<=10) {
//			System.out.println("1-100사이 숫자 입력");
//			int num = scan.nextInt();
//			if (num==hidden) {
//				System.out.printf("[%d번째 도전] 정답입니다.\n",i);
//				break;
//			}else if (num> hidden){
//				System.out.printf("[%d번째 도전]정답 숫자보다 큽니다. 작은 수를 입력하세요.",i);
//			}else if (num < hidden) {
//				System.out.printf("[%d번째 도전]정답 숫자보다 작습니다. 큰 수를 입력하세요. ",i);
//			}
//			i++;
//		}
//		System.out.println("정답숫자 : "+hidden);

		//1-100 랜덤 숫자
//		for (int i=0;i<=5;i++) {
//		int ran = (int)(Math.random()*100)+1;
//		System.out.println(ran);
//		}
		
//		double num = Math.random();
//		System.out.println();
		
		// 반복문을 사용해서 
		// 000~999까지 출력
		// 000,001...010...999
		
//		for (int i=0;i<1000;i++) {
//			System.out.printf("%03d \n",i);
//		}
//		
//		for (int i=0;i<=9;i++) {
//			for(int j=0;j<=9;j++) {
//				for(int k=0;k<=9;k++) {
//					System.out.printf("%d %d %d \t",i,j,k);
//				}
//				System.out.println();
//			}
//		}
	}

}
