package j0120;

import java.util.Scanner;

public class Ja0120_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[10];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
		String name = "";
		int[] score = new int[3];
		int choice = 0, count = 0, temp = -1;
		
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
			case 1: {
				System.out.println("학생성적입력");
				while (count<10) {
					System.out.printf("%d번째 학생 입력",count+1);
					System.out.println("이름을 입력하세요. (0. 뒤로가기)");
					name = scan.next();
					if (name.equals("0")) {
						System.out.println("뒤로 갑니다.");
						break;
					}
					for (int i=0;i<score.length;i++) {
						System.out.printf("%s점수를 입력하세요.",title[i+2]);
						score[i] = scan.nextInt();
					}
					
					s[count] = new Stuscore(name, score[0], score[1], score[2]);
					System.out.printf("%d번째 학생이 저장되었습니다.\n",count+1);
					count++;
				} // while
				break;
			}
			case 2:{
				System.out.println("학생성적출력");
				System.out.println("-----------------------------------------------------");
				for (int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("----------------------------------------------------");
				for (int j=0;j<count;j++) {
					s[j].print();
				}
				System.out.println();
				break;
			}
			case 3:{
				System.out.println("학생성적수정");
				System.out.println("수정할 학생의 이름을 입력하세요.");
				name = scan.next();
				temp = -1;
				for (int i=0;i<count;i++) {
					if (name.equals(s[i].name)) {
						temp = i;
						System.out.printf("%s학생을 찾았습니다.\n",s[i].name);
					}
				}
				if (temp == -1) {
					System.out.println("찾는 학생이 없습니다.");
					break;
				}else {
					System.out.printf("[ %s 학생 성적 수정 ]\n", s[temp].name);
					System.out.println("1. 국어점수수정");
					System.out.println("2. 영어점수수정");
					System.out.println("3. 수학점수수정");
					System.out.println("----------------------------------");
					System.out.println("원하는 번호를 입력하세요. >> ");
					choice = scan.nextInt();
					
					switch (choice) {
					case 1: {
						System.out.println("국어 점수를 수정합니다.");
						System.out.printf("현재 국어 점수 : %d\n", s[temp].kor);
						System.out.println("변경 점수 입력 >> ");
						s[temp].kor = scan.nextInt();
						System.out.println("수정이 완료되었습니다.");
						break;
					}
					case 2: {
						System.out.println("영어 점수를 수정합니다.");
						System.out.printf("현재 영어 점수 : %d\n", s[temp].eng);
						System.out.println("변경 점수 입력 >> ");
						s[temp].eng = scan.nextInt();
						System.out.println("수정이 완료되었습니다.");
						break;
					}
					case 3: {
						System.out.println("수학 점수를 수정합니다.");
						System.out.printf("현재 수학 점수 : %d\n", s[temp].math);
						System.out.println("변경 점수 입력 >> ");
						s[temp].math = scan.nextInt();
						System.out.println("수정이 완료되었습니다.");
						break;
					}
				}// switch
				s[temp].total = s[temp].kor+s[temp].eng+s[temp].math;
				s[temp].avg = s[temp].total/3.0;
				}
				break;
			}
			case 4:{
				System.out.println("등수처리");
				for (int i=0;i<count;i++) {
					int rankC = 1;
					for (int k=0;k<count;k++) {
						if(s[i].total<s[k].total) {
							rankC++;
						}
					}
					s[i].rank = rankC;
				}
				System.out.println("등수처리가 완료되었습니다.");
				break;
			}
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}// switch
		}// while
	}

}
