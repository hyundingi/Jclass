package j0123;

import java.util.Scanner;

public class Ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		Scanner scan = new Scanner(System.in);
		String str = "안녕하세요. 성은 홍 입니다 ";
		String[] arr = {"홍길동임","유관순입니다.","이순신이다","강감찬일까요?","김구등장","길자임다"};
		
		
		
		String a = new String("a");
		StringBuffer strr = new StringBuffer("aaa");
		System.out.println(a+1);
		System.out.println(strr.append(2));
		
		
//		String a = "a";
//		for (int i=0;i<10;i++) {
//			a += i;
//		}
		
		
		
		//indexOf
//		String strr = "bbaaccAABBCCaaddeeffaaAA";
//		int count = 0;
//		for (int i=0;i<strr.length();i++) {
//			if(strr.indexOf("aa",i)!=-1) {
//				i = str.indexOf("aa",i);
//				System.out.println("존재하는 위치 : "+i);
//				count++;
//			}else {
//				break;
//			}
//		}
		
		
		//valueOf
//		int a = 10;
//		double b = 3.14;
//		String.valueOf(b);
		
		
//		for (int i=0;i<arr.length;i++) {
//			
//		System.out.println(arr[i].substring(1,arr[i].length()));
//		}
		
		
		
//		System.out.println(str.length());
//		
//		while (true) {
//			
//			System.out.println("글자를 입력하세요. 10자 이내!");
//			String input = scan.nextLine();
//			if (input.length()>10) {
//				System.out.println("10자 이내로 입력하세요.");
//			}else {
//				System.out.println(input);
//			}
//		}
		
		// trim
//		String str = "          안녕        하   세  요       ";
//		System.out.println(str);
//		System.out.println(str.trim());
//		
//		// replace - 원본은 변경되지 않음. 
//		System.out.println(str.replace(" ", ""));
		
		//indexOf : 존재하는 위치값을 알려줌 (없으면 -1)
//		String str = "안녕하세요. 성은 홍 입니다 ";
//		String input = "홍";
//		System.out.println("있는 위치 : "+ str.indexOf(input));
//		int no = str.indexOf(input);
		
		
		//contains : 문자열 포함되어 있는지 확인
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요. 성은 홍입니다.";
//		String input = "홍";
//		
//		// arr의 배열에서 홍이 있는 이름을 출력
//		for (int i=0;i<arr.length;i++) {
//			if(arr[i].contains(input)) {
//				System.out.printf("%s ",arr[i]);
//			}
//		}
//		
//		if(str.contains(input)) {
//			System.out.println("홍이라는 글자가 있습니다.");
//		}else {
//			System.out.println("홍이라는 글자는 업습니다.");
//		}
		
//		String str = "1,홍길동,100,100,100,0,0,0,0";
//		// 학번 이름 국어 영어 수학 합계 평균 등수
//		String[] arr = str.split(",");
//		int n = Integer.parseInt(arr[2]);
//		int n2 = Integer.parseInt(arr[3]);
//		int n3 = Integer.parseInt(arr[4]);
//		
//		System.out.println("번호"+arr[0]);
//		System.out.println("이름"+arr[1]);
//		System.out.println("국어"+arr[2]);
//		System.out.println("영어"+arr[3]);
//		System.out.println("수학"+arr[4]);
//		System.out.println("합계"+(n+n2+n3));
//		System.out.println("평균"+(n+n2+n3)/3.0);
//		System.out.println("등수"+arr[7]);
		
		
		
//		System.out.println("숫자를 입력하세요. >>");
//		
//		String num = scan.nextLine();
//		String[] arr = num.split(",");
//		
//		// 두 수의 합, 곱을 구하시오
//		String str = "5";
//		int n = Integer.parseInt(str);
//		System.out.println(n);
		
		// split : 특정 분리자로 분리
//		String str = "100 100 100";
//		String[] arr = str.split(" ");
//		for (int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		// concat : 문자열 합치기
		/*String str = "안녕";
		String str2 = "반가워";
		System.out.println(str.concat(str2));*/
		
		// charAt : 지정된 위치의 문자 반환
//		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
		
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
		// euqals:  대소문자 구분 / equalsIgnoreCase: 대소문자 구분 안 함
		
//		if(str.equalsIgnoreCase(str2)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다");
//		}
//		
//		if(str.equals(str3)) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다");
//		}
//		
		
//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone(); // 객체복사
//		Point p3 = new Point(p1); // 객체복사
//		
//		p1.x = 10;
//		p2.x = 100;
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		Stu s = new Stu();
//		System.out.println(s);
//		
//		Class s2 = Stu.class;
//		System.out.println(s2.getName());
//		
//		int a = 10;
//		int b = 1;
//		a += b;
//		System.out.println(a);
//		
//		String sa = "10";
//		String sb = "1";
//		sa += sb;
//		System.out.println(sa);
		
		
//		String txt = "소나무가 많아서 '송악松岳'이라 불린다는 송악산은 지금은 잊혀진 '절울이'라는 예쁜 우리말 이름을 가졌다. 박용후의 <제주도 옛땅이름 연구>에 따르면 거친 파도가 절벽에 부딪히는 소리가 우레 같다는 뜻이라고 한다. 모슬포 앞바다로 요새 마냥 툭 튀어나온 송악산은 바다에 접한 면이 전부 깎아지른 절벽을 이룬 채 쉴 새 없이 거친 파도를 맞닥뜨리고 있다.\r\n"
//				+ "\r\n"
//				+ "송악산은 오름이다!\r\n"
//				+ "\r\n"
//				+ "송악산은 '오름'으로보다 산방굴사를 품은 산방산, 용머리해안, 하멜상선전시관과 함께 서귀포 남서쪽을 대표하는 '관광지'로 널리 알려진 곳이다. 그래서 수학여행에 나선 학생이나 내외국인 단체 관광객을 태운 버스가 꼬리를 물고 송악산을 찾는다. 이렇게 송악산을 찾은 이 대부분은 오름 트레킹보다는 전망대가 있는 부남코지까지 왕복하는 짧은 코스를 택한다. 송악산이 가진 매력이 워낙 대단해서 부남코지까지 다녀오는 것만으로도 감동이 적지 않지만, 송악산의 진가를 보기엔 어림도 없는 걸음이다. 정상 굼부리를 오르내리고, 탐방로 전체를 한 바퀴 걸어봐야 송악산이 가진 매력을 가늠할 수 있다.";
//		
//		String txt2 = "소나무가 많아서 '송악松岳'이라 불린다는 송악산은 지금은 잊혀진 '절울이'라는 예쁜 우리말 이름을 가졌다. 박용후의 <제주도 옛땅이름 연구>에 따르면 거친 파도가 절벽에 부딪히는 소리가 우레 같다는 뜻이라고 한다. 모슬포 앞바다로 요새 마냥 툭 튀어나온 송악산은 바다에 접한 면이 전부 깎아지른 절벽을 이룬 채 쉴 새 없이 거친 파도를 맞닥뜨리고 있다.\r\n"
//				+ "\r\n"
//				+ "송악산은 오름이다!\r\n"
//				+ "\r\n"
//				+ "송악산은 '오름'으로보다 산방굴사를 품은 산방산, 용머리해안, 하멜상선전시관과 함께 서귀포 남서쪽을 대표하는 '관광지'로 널리 알려진 곳이다. 그래서 수학여행에 나선 학생이나 내외국인 단체 관광객을 태운 버스가 꼬리를 물고 송악산을 찾는다. 이렇게 송악산을 찾은 이 대부분은 오름 트레킹보다는 전망대가 있는 부남코지까지 왕복하는 짧은 코스를 택한다. 송악산이 가진 매력이 워낙 대단해서 부남코지까지 다녀오는 것만으로도 감동이 적지 않지만, 송악산의 진가를 보기엔 어림도 없는 걸음이다. 정상 굼부리를 오르내리고, 탐방로 전체를 한 바퀴 걸어봐야 송악산이 가진 매력을 가늠할 수 있다.";
//		
//		String txt3 = "안녕하세요";
//		
//		String str1 = new String(txt2);
//		String str2 = new String(txt);
//		String str3 = new String(txt);
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
//		Stu s1 = new Stu("홍길동",100,90,90);
//		Stu s2 = new Stu("홍길동",70,70,70);
//		
//		if (s1.equals(s2)) {
//			System.out.println("같은 사람");
//		}else {
//			System.out.println("다른 사람");
//		}
		
		
//		Person p1 = new Person(200101011111111L);
//		Person p2 = new Person(200101011111111L);
//		
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람 입니다.");
//		}else {
//			System.out.println("다른 사람 입니다.");
//		}
	}

}
