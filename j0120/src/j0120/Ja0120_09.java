package j0120;

import java.util.Scanner;

public class Ja0120_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stuscore[] s = new Stuscore[3]; // 배열 선언
		
		Stuscore s1 = new Stuscore();
		System.out.println(s1.count);
		s1.name = "강감찬";
		s1.kor = 80;
		s1.eng = 58;
		s1.math = 55;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		s1.print();
		
		for (int i=0;i<3;i++) {
			
		System.out.println("학생이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		s[i] = new Stuscore(name,kor,eng,math);
		s[i].print();
		}
		
		
		
		
		
//		
//		Car c1 = new Car("red","auto",5);
//		Car c2 = new Car();
//		
//		Car c3 = new Car(c1);
//		System.out.println(c1.color);
//		System.out.println(c2.color);
//		System.out.println(c3.color);
		
		// 객체 선언 후 1,홍길동,100,100,100 넣어서
		// 출력
		
//		Stuscore s1 = new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 100;
//		s1.total = s1.kor+s1.eng+s1.math;
//		s1.avg = (s1.kor+s1.eng+s1.math)/3.0;
//		
////		System.out.printf("출력 : %d, %s, %d, %d, %d, %d, %.2f\n",s1.no,s1.name,s1.kor,s1.eng,s1.math,s1.total,s1.avg);
//		
//		Stuscore s2 = new Stuscore(2,"유관순",100,99,88);
//		s2.print();
	}

}
