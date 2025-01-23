package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0123_08 {

	public static void main(String[] args) {
		
		// set - 중복 x 순서 x
		HashSet set = new HashSet();
		set.add(3);
		set.add(1); 
		set.add(2);
		
		Iterator i = set.iterator(); // 일회용 선언
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
//		ArrayList list = new ArrayList();
//			
//		for (int j=0;j<10;j++) {
//			list.add(j+1); // 값입력
//		}
//		
//		Iterator i1 = list.iterator();
//		while (il.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		// 편하게 사용하는 형태
//		for (int i=0;i<list.size();i++) {
//			System.out.println(list.get(i);
//		}
		
	}

}
