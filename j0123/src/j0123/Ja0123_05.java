package j0123;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ja0123_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일 이름을 입력하세요. >> ");
		String name = scan.next();
		File f = createFile(name+".txt");
		System.out.println("파일이 생성되었습니다.");
	}
	
	static File createFile(String fileName) {
		File f = new File(fileName);
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return f;
//		if (fileName == null || fileName.equals("")) {
//			throw new Exception("파일이름이 없습니다. 다시 입력해주세요.");
//		}
	}

		
	// 파일 생성 - 오ㅣ부하드디스크에 파일을 1개 생성
	// 외부와 연결되어 있기 때문에 무조건 try/catch 혹은 throw를 해줘야함

}
