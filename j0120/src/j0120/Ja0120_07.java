package j0120;

public class Ja0120_07 {
	
	Ja0120_07() {} // 기본생성자 - 안 만들어도 자동으로 들어감
	// 모든 클래스에는 하나의 생성자가 반드시 있어야한다.
	
	
	public static void main(String[] args) {
		
//		Cal c = new Cal(); // 객체선언 / new Cal() : 생성자 호출(인스턴스 초기화 매소드)
		
		Data1 d1 = new Data1();
		d1.value = 10;
		d1.name = "홍길동";
		d1.kor = 100;
		d1.eng = 100;
		d1.math = 99;
		System.out.println(d1.value);

		Data2 d2 = new Data2();
		d2.value = 11;
		d2.name = "유관순";
		d2.kor = 99;
		d2.eng = 98;
		d2.math = 97;
		
		Data2 dd = new Data2(1,"홍길동",100,100,99);
		Data2 dd2 = new Data2(2,"유관순",99,92,99);
		
				
		System.out.println(d2.value);
		

	}

}

class Data1{
	int value; // 인스턴스 변수 - 객체선언 후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	double avg;
	
}

class Data2{
	Data2(){} // 기본생성자
	
	Data2(int a, String b, int c, int d, int e){
		value = a;
		name = b;
		kor = c;
		eng = d;
		math = e;
	}
	
	
	int value; // 인스턴스 변수 - 객체선언 후 참조변수명.변수명
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

}
