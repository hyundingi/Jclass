package j0123;

public class Person {
	long id; // 주민번호
	String name; // 주민등록상 이름
	
	
	Person(){}
	Person(long id){
		this.id = id;
	}
	
	Person(long id, String name){
		this.id = id;
		this.name = name;
				
	}
	
	@Override //Object 클래스 메소드
	public String toString() {
		return id+"";
	}
	
	@Override //Object 클래스 메소드
	public boolean equals(Object obj) { // 비교 대상 객체
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
}
