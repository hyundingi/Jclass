package j0120;

import java.util.Arrays;

public class Cal3 {
	
	void op(int a, int b, int[] re) {
		
		re[0] = a+b;
		re[1] = a-b;
		re[2] = a*b;
		double div = a/b; 
		
		System.out.println(Arrays.toString(re));
		System.out.println("나눈값 : "+div);
		
	}

}
