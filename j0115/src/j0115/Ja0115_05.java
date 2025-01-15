package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_05 {

	public static void main(String[] args) {
		// 이름, 국어점수 - 5명의 학생의 국어성적을 입력하려고 함.
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		
		//이름과 국어, 영어를 입력받아 합계,평균 출력 소수점 3자리
		
		for (int i=0;i<name.length;i++) {
			System.out.println("이름을 입력하세요. ");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요. ");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요. ");
			eng[i] = scan.nextInt();
			total[i] = kor[i]+eng[i];
			avg[i] = total[i]/2;
		}
		
		for (int i=0;i<3;i++) {
			System.out.println("이름 : "+name[i]);
			System.out.println("국어 : "+kor[i]);
			System.out.println("영어 : "+eng[i]);
			System.out.println("합계 : "+total[i]);
			System.out.printf("평균 : %.3f \n",avg[i]);
			System.out.println("-------------------------");
		}
//		System.out.println(Arrays.toString(name));
//		System.out.println(Arrays.toString(kor));
	}

}
