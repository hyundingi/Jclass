package j0117;

import java.util.Scanner;

public class Ja0117_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1명의 학생 성적을 입력
		
		StuScore s1 = new StuScore();
		
		s1.no = 1;
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 80;
		s1.cal_total();
		s1.cal_avg();
		
		StuScore s2 = new StuScore();
		
		s2.no = 2;
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 100;
		s2.cal_total();
		s2.cal_avg();
		
		System.out.printf("%s 성적 \n",s1.name);
		System.out.printf("국어 : %d\n", s1.kor);
		System.out.printf("영어 : %d\n", s1.eng);
		System.out.printf("합계 : %d\n", s1.total);
		System.out.printf("평균 : %.2f\n", s1.avg);
		System.out.print(s1);


	}

}
