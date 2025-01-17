package j0117;

public class Ja0117_06_여러변수 {
	
	static int c = 0; //1. 클래스 변수 - 프로그램이 실행되면 사용 가능
	int num = 10; //2. 인스턴스 변수 - 객체선언을 해야 사용 가능
	
	
	public static void main(String[] args) {
		int a = 5; // 3. 지역변수 - 객체선언을 해야 사용 가능 (메인method에 있을 땐 자동으로 실행이 됨)
		
		System.out.println(Stu.count);
		// 1-100 합
		// 200을 넘는 시점의 i의 값
//		int sum = 0;
//		int num = 0;
//		for (int i=1;i<101;i++) {
//			sum += i;
//			if (sum > 200) {
//				num = i;
//				break;
//			}
//		}
//		System.out.println(num);
//		System.out.println(sum);

	}

}
