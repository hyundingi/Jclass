package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Ja0123_01 {

	public static void main(String[] args) {
		Stu_Deck sd = new Stu_Deck();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		// 무한반복
		loop: while (true) {
			
		//화면 구현
		choice = sd.main_print();
		
		switch (choice) {
		case 1: 
			// 성적입력
			sd.input();
			break;
		
		case 2:
			// 성적출력
			sd.output();
			break;
		
		case 3:
			// 성적수정
			sd.modify();
			break;
			
		case 4:
			break;
		
		default:
			System.out.println("프로그램을 종료합니다.");
			break loop;
		}// swi0tch
		} // while

	}

}
