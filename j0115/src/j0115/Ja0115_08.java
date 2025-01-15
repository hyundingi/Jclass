package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		// 1-10 랜덤숫자를 입력받아 동일한 번호가 없게 저장
		
		// 배열을 랜덤 섞기 출력
		int[] num2 = new int[10];
		//입력
		for (int j=0;j<10;j++) {
			num2[j] = j+1;
		}
		// 섞기
		int temp = 0;
		for (int j=0;j<300;j++) {
			int ran = (int)(Math.random()*10);
			temp = num2[0];
			num2[0] = num2[ran];
			num2[ran] = temp;
		}
		System.out.println("랜덤입력숫자 :");
		for (int j=0;j<num2.length;j++) {
			System.out.println(num2[j]+" ");
		}
		System.out.println();
		
		// for 사용
		int[] num = new int[10];
		
		loop:for (int i=0;i<10;i++) {
			int ran = (int)(Math.random()*10)+1;
			for (int j=0;j<i;j++) {
				if (num[j] == ran) {
					System.out.println("동일한 숫자 있음. "+ran);
					i--;
					continue loop;
				}
			}
			num[i] = ran;
		}
		System.out.print("로또 번호 : ");
		for (int j=0;j<num.length;j++) {
			System.out.print(num[j]+" ");
		}
		
		// 1-10 랜덤숫자를 입력받아 동일한 번호가 없게 저장
		// while 사용
//		int[] num = new int[10];
//		
//		int i = 0;
//		loop:while (i<10) {
//			int ran = (int)(Math.random()*10)+1;
//			int temp = 0;
//			for (int j=0;j<i;j++) {
//				if (num[j] == ran) {
//					System.out.println("동일한 숫자 있음. "+ran);
//					continue loop;
//				}
//			}
//			num[i] = ran;
//			i++;
//		}
//		System.out.print("로또 번호 : ");
//		for (int j=0;j<num.length;j++) {
//		System.out.print(num[j]+" ");
//		}
	}

}
