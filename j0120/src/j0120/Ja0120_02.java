package j0120;

import java.util.Arrays;

public class Ja0120_02 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Arr a = new Arr();
		
		System.out.println(Arrays.toString(a.num));
		cal(a.num);
		System.out.println(Arrays.toString(a.num));
		

	}
	
	static void cal(int[] num) {
		// num 배열에 10을 더해서 값을 돌려줌.
		for (int i=0;i<num.length;i++) {
			num[i] = num[i]+10;
		}
	}

}
