package j0123;

public class Ja0123_04 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("프로그램 실행");
		System.out.println(1);
//		method1();
//		method2();
		System.out.println("호");
		System.out.println("출");

	}
	
	static void method1() {
		System.out.println(1);
		try {
			System.out.println(3);
			System.out.println(4/0); // 에러발생
		} catch (Exception e) {
			System.out.println(5);
		}finally {
			System.out.println("파이널 : 에러가 있어도, 없어도 무조건 실행");
		}
		System.out.println(6);
	}
	
	static void method2() throws Exception{
		// throws는 예외를 다른쪽으로 던짐  >> 다른쪽에는 try catch가 있어야함 없으면 에러
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
		System.out.println(1);
	}

}
