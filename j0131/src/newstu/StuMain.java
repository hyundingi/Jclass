package newstu;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		// TODO 자동 생성된 메소드 스텁
		StuDeck sd = new StuDeck();
		Scanner scan = new Scanner(System.in);
		int choice=0,temp=0,count=0;
		
		// 파일 읽어오기
		sd.fileread();
		
		loop:while(true) {
			
			System.out.println("-------------------------");
			System.out.println("   [ 학생성적프로그램 ]");
			System.out.println("-------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("5. 학생성적검색");
			System.out.println("6. 학생등수정렬");
			System.out.println("7. 학생이름정렬");
			System.out.println("8. 등수처리");
			System.out.println("9. 파일저장");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: //학생성적입력
				sd.inputstu();
				break;
			case 2: //학생성적출력
				sd.listPrint();
				break;
			case 3: // 학생성적수정
				sd.stumodi();
				break;
			case 4: // 학생성적삭제
				sd.studel();
				break;
			case 5: // 학생성적검색
				sd.stusearch();
				break;
			case 6: // 학생등수정렬
				break;
			case 7: // 학생이름정렬
				break;
			case 8: // 등수처리
				sd.rank();
				break;
			case 9: // 파일저장
				sd.savefile();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			} // switch
		} // while
		

	}

}
