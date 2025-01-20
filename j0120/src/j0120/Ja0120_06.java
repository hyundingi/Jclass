package j0120;

public class Ja0120_06 {

	public static void main(String[] args) {
		
		// Ja0120_06() {} 기본생성자
		
		
		// 같은 클래스 내에 있는 거는 선언 안 하고 써도 됨
		System.out.println(fac(5));

	}
	
	static long fac(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		}else {
			// 자기 자신을 호출하는 재귀호출
			result = n*fac(n-1);
			// 출력값 120 - 5* 4(재귀)*3(재귀) ,, 1이 될때까지
		}
		return result;
	}

}
