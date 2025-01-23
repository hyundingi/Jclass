package j0123;

import java.util.ArrayList;
import java.util.List;

public class Ja0123_07 {
	public static void main(String[] args) {
	
		ArrayList list = new ArrayList();
	//	List list2 = new ArrayList();
		
		for (int j=0;j<10;j++) {
			list.add(j+1); // 값입력
		}
		
		list.add(4,100);
		
		for (int j=0;j<list.size();j++) {
			System.out.println(list.get(j)); // 값 출력
		}
		
		for (int j=list.size()-1;j>=0;j--) {
			list.remove(j); // 값 지우기
		}
		
		// 1 > 기본타입, list > 객체타입/ 순서 ㅇ, 중복 ㅇ
	//	list.add(1); 
	//	list.add(2); 
	//	list.add(3); 
	//	list.add(4); 
	//	
	//	for (int i1=0;i<list.size();i++) {
	//		System.out.println(list.get(i1));
	//	}
	//	
	//	list.remove(3); // index 번호 삭제
	//	System.out.println("-----------------");
	//	for (int i=0;i<list.size();i++) {
	//		System.out.println(list.get(i1));
	//	}
	//	
	//	list.clear(); // 전체 삭제
	//	System.out.println("-----------------");
	//	for (int i=0;i<list.size();i++) {
	//		System.out.println(list.get(i1));
	//	}
	//	
	//	System.out.println(list.get(i));
	
	
	}
}
