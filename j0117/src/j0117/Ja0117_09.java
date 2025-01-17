package j0117;

import java.util.Scanner;

public class Ja0117_09 {

	// 매소드 안에는 매소드를 작성할 수 없음
//	int add(int a, int b) {
//		int result = a+b;
//		return result;
//	}
//	
//	boolean power; // 인스턴스 변수 - 객체선언 후, 참조변수명.변수명
//	// void 에는 return 값이 필요없음. 있으면 에러남 
//	void power() {
//		power = !power;
//	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 2개의 값을 넘겨주면
		// 메소드 3개
		while (true) {
			
		Cal2 c = new Cal2();
		System.out.print("번호 1 입력");
		int a = scan.nextInt();
		if (a==1) {
			System.out.println("프로그램 종료");
			break;
		}
		System.out.print("번호 2 입력");
		int b = scan.nextInt();
		
		// a,b > a,b 각각 10을 더해서 두 수 더하기를 해서 리턴
		System.out.println(c.plus(a, b));
		// a,b > a,b 각각 10을 곱해서 두 수를 더하기 해서 리턴 
		System.out.println(c.plmulti(a, b));
		// a,b > a,b 곱해서 리턴
		System.out.println(c.multi(a, b));
		
		}
		
		
		
		
		
//		Cal c = new Cal();
//		
//		int num = 100;
//		int num2 = 20;
////		int result = c.add(num, num2);
//		int result = c.add(num, num2);
//		System.out.println("더하기 : "+c.add(num, num2));
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : "+c.sub(num, num2));
//		
//		c.mult(num, num2);
		
		
		
//		int a = 0; //지역변수
//		
//		Ja0117_09 j = new Ja0117_09(); // 인스턴스 변수 사용하기 
//		j.power = true;
//		System.out.println(j.power);

	}

}
