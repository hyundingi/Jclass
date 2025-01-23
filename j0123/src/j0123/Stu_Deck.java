package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	Scanner scan = new Scanner(System.in);
	// 학생성적프로그램
	// 번호, 이름, 국어, 영어, 수학, 합계, 평균
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
	String name = "";
	double avg = 0;
	int temp = 0; // 검색 확인
	int rankC = 0;
	int choice = 0;
	
	// 1. 상단 메뉴 메소드
	int main_print() {
		System.out.println("[학생성적프로그램]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 등수처리");
		System.out.println("0. 종료");
		System.out.println("-----------------------------------------------");
		System.out.println("원하는 번호를 입력하세요. >> ");
		choice = scan.nextInt();
		return choice;
	}
	
	// 2. 입력 메소드
	void input() {
		System.out.println("[학생성적입력]");
		while (true) {
			System.out.printf("[ %d 번째 ] \n",list.size());
			// 이름
			System.out.println("이름을 입력하세요. (0. 종료)");
			name = scan.next();
			
			//0인지 확인
			if (name.equals("0")) {
				break;
			}
			
			// 점수 (국영수)
			System.out.printf("국어 점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.out.printf("영어 점수를 입력하세요.\n");
			eng = scan.nextInt();
			System.out.printf("수학 점수를 입력하세요.\n");
			math = scan.nextInt();
			
			// list 저장
			list.add(new Stu(name,kor,eng,math));
			
			System.out.printf("%s 학생이 저장되었습니다. \n", name);
			
		}// while
	} // 2. 입력 메소드 끝
	
	// 3. 출력 메소드
	void output() {
		System.out.println("\t\t\t[ 학생성적출력 ]");
		System.out.println("-----------------------------------------------------------");
		for (int j=0;j<title.length;j++) {
			System.out.printf("%s\t",title[j]);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		for (int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j); // Object
			System.out.printf("%d\t",s.getNo());
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKor());
			System.out.printf("%d\t",s.getEng());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.getTotal());
			System.out.printf("%.2f\t",s.getAvg());
			System.out.printf("%d\n",s.getRank());
		}
		System.out.println();
	} // 3. 출력 메소드 끝
	
	// 4. 수정 메소드
	void modify() {
		System.out.println("\t\t\t[ 학생성적수정 ]");
		System.out.println();
		temp = -1;
		System.out.print("수정할 학생 이름 입력 >> ");
		String name = scan.next();
		for (int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j); // Object
			if (name.equals(s.getName())) {
				temp = j;
			}
		}
		
		if (temp == -1) {
			System.out.println("없는 학생입니다.");
		}else {
			System.out.printf("%s 학생을 찾았습니다.",((Stu)list.get(temp)).getName());
		System.out.println("-----------------------");
		System.out.println("수정할 과목 선택");
		System.out.println("-----------------------");
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");
		System.out.println("-----------------------");
		choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("현재 국어 점수: "+((Stu)list.get(temp)).getKor());
			System.out.printf("수정 점수 입력 : ");
			int modikor = scan.nextInt();
			((Stu)list.get(temp)).setKor(modikor);
			System.out.println("점수가 수정되었습니다.");
			break;
		case 2:
			System.out.println("현재 영어 점수: "+((Stu)list.get(temp)).getEng());
			System.out.printf("수정 점수 입력 : ");
			int modieng = scan.nextInt();
			((Stu)list.get(temp)).setEng(modieng);
			System.out.println("점수가 수정되었습니다.");
			break;
		case 3:
			System.out.println("현재 수학 점수: "+((Stu)list.get(temp)).getMath());
			System.out.printf("수정 점수 입력 : ");
			int modimath = scan.nextInt();
			((Stu)list.get(temp)).setMath(modimath);
			System.out.println("점수가 수정되었습니다.");
			break;
		} // switch 끝
			
		}
		
		
	}// 4. 수정 메소드 끝 
	
	// 5. 삭제 메소드
	void delete() {
		System.out.println("\t\t\t[ 학생성적삭제 ]");
		System.out.println();
		temp = -1;
		System.out.print("삭제할 학생 이름 입력 >> ");
		String name = scan.next();
		for (int j=0;j<list.size();j++) {
			Stu s = (Stu)list.get(j); // Object
			if (name.equals(s.getName())) {
				temp = j;
			}
		}
		
		if (temp == -1) {
			System.out.println("없는 학생입니다.");
		}else {
			System.out.printf("%s 학생을 찾았습니다.",((Stu)list.get(temp)).getName());
			System.out.printf("%s 학생을 정말 삭제할까요?",((Stu)list.get(temp)).getName());
			System.out.println("-----------------------");
			System.out.println("1. 예");
			System.out.println("2. 아니오");
			System.out.println("-----------------------");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.printf("%s 학생을 삭제합니다.",((Stu)list.get(temp)).getName());
//				((Stu)list.get(temp));
				break;
			case 2:
				System.out.println("취소되었습니다.");
				break;
			} // switch 끝
		}
		
	} // 5. 삭제 메소드 끝

}
