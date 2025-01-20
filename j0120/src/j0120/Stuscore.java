package j0120;

public class Stuscore {
	// 초기화 블럭
	{
		++count;
		this.no = count;
	}
	
	Stuscore(){} // 기본생성자
	
	// 매개변수 생성자
	Stuscore(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = (kor+eng+math)/3.0;
		this.rank = 0;
	}
	
	// 학생성적
	static int count; //클래스 변수 - 객체선언 없이 클래스명.변수명(공용)
	int no; // 인스턴스 변수
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void print() {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",no,name,kor,eng,math,total,avg,rank);
	}
	

}
