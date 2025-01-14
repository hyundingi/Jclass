package j0113;

public class Ja0113_07 {

	public static void main(String[] args) {
		 // -------------------------------------
		 //    1       2       4      8
		 // boolean
		 //           char
		 //  byte     short   int    long
		 //                  float  double
		 // ----------------------------------------------
		       
		// 형변환
		int n1 = 65;
		char ch1 = (char)n1; // int > char : 강제 형변환 하려는 타입을 붙여줌
		System.out.println(n1); // 65
		System.out.println(ch1); // A
		
		char ch2 = 'a';
		int n2 = ch2;
		System.out.println(n2); //97
		
		float f1 = 3.14F;
		int n3 = (int)f1;
		System.out.println(n3); // 3 : int로 바꾸면 소수점은 안 들어감
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2); // 10.0 : float 으로 바꾸면 소수점이 자동으로 붙음
		
		

	}

}
