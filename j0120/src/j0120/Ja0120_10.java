package j0120;

import java.util.Scanner;

public class Ja0120_10 {

	public static void main(String[] args) {
		
		// 학생성적프로그램
		// 변수선언 - 번호, 이름, 국어, 영어, 수학, 합계, 평균
		// 1. 변수선언
		// 2. 화면구현
		// 3. 번호선택 switch
		// 4. 학생성적입력
		
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[10]; // 배열선언
		
		int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		String name = "";
		double avg = 0;
		
		int[] score = new int[3];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		int choice = 0, temp = 0, rankC = 0, count = 0; // 번호선택, 검색확인, 등수확인, 학생 카운트 
		
		loop: while (true) {
			
		System.out.println("[학생성적프로그램]");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("3. 학생성적수정");
		System.out.println("4. 등수처리");
		System.out.println("0. 종료");
		System.out.println("-----------------------------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		
		switch (choice) {
		case 1:{
			System.out.println("[학생성적입력]");
			while (count<10) {
				System.out.printf("[%d 번째]\n", count+1);
				System.out.println("이름을 입력하세요.");
				name = scan.next();
				if (name.equals("0")) {
					break;
				}
				// 국어 영어 수학
//				System.out.println("국어점수를 입력하세요.");
//				kor = scan.nextInt();
//				System.out.println("영어점수를 입력하세요.");
//				eng = scan.nextInt();
//				System.out.println("수학점수를 입력하세요.");
//				math = scan.nextInt();
				
				for (int i=0;i<score.length;i++) {
					System.out.printf("%s점수를 입력하세요.", title[i+2]);
					score[i] = scan.nextInt();
				}
				
//				s[count] = new Stuscore(name, kor, eng, math);
				s[count] = new Stuscore(name, score[0], score[1], score[2]);
				s[count].print();
				System.out.println("학생성적이 저장되었습니다.");
				
				count++;
			} // while
			break;
		}// case 1
		case 2:{
			System.out.println("        [학생성적출력]");
			for (int i=0;i<count;i++) {
			System.out.printf("%s\t",title[i]);
			}
			System.out.println();
			System.out.println("---------------------------------------");
			for (int i=0;i<count;i++) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",s[i].no,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg, rank);
			}
			break;
		}
//		case 3:{
//			System.out.println("[학생성적수정]");
//			System.out.println("성적을 수정할 학생의 이름을 입력하세요.");
//			String input = scan.next();
//			temp = -1;
//			for (int i=0;i<3;i++) {
//				if (s[i].name==input) {
//					temp = i;
//					System.out.printf("%s학생을 찾았습니다.",s[i].name);
//					
//				}
//			}
//			if (temp==-1) {
//				System.out.println("검색한 학생을 찾지 못했습니다.");
//			}else {
//				System.out.printf("[ %s 학생 성적 수정 ]\n", s[temp].name);
//				System.out.println("1. 국어점수수정");
//				System.out.println("2. 영어점수수정");
//				System.out.println("3. 수학점수수정");
//				System.out.println("----------------------------------");
//				System.out.println("원하는 번호를 입력하세요. >> ");
//				choice = scan.nextInt();
//				switch (choice) {
//				case 1:
//					System.out.println("[국어점수수정]");
//					System.out.printf("현재 국어 점수 : %d \n", score[temp][0]);
//					System.out.println("변경점수를 입력하세요. >> ");
//					score[temp][0] = scan.nextInt();
//					break;
//				case 2:
//					System.out.println("[영어점수수정]");
//					System.out.printf("현재 영어 점수 : %d \n", score[temp][1]);
//					System.out.println("변경점수를 입력하세요. >> ");
//					score[temp][1] = scan.nextInt();
//					break;
//				case 3:
//					System.out.println("[수학점수수정]");
//					System.out.printf("현재 국어 점수 : %d \n", score[temp][2]);
//					System.out.println("변경점수를 입력하세요. >> ");
//					score[temp][2] = scan.nextInt();
//					break;
//				}// switch
//				score[temp][3] = score[temp][0]+score[temp][1]+score[temp][2];
//				avg[temp] = score[temp][3]/3.0;
//			}
//			break;
//		}
		case 4:{
			break;
		}
		
		default:
			System.out.println("프로그램을 종료합니다.");
			break loop;
		
		} // switch
		
		} // while
	}
	
}

