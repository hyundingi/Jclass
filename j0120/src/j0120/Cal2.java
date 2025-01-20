package j0120;

import java.util.Arrays;
import java.util.Scanner;

public class Cal2 {
	
	String[] print() {
		Scanner scan = new Scanner(System.in);
		String[] input = new String[3];
		
		for (int a=0;a<3;a++) {
		System.out.println("이름을 입력하세요.");
		input[a] = scan.next();
		}
		
		System.out.println(Arrays.toString(input));
		return input;
	}

}
