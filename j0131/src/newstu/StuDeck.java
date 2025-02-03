package newstu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	
	// 파일읽어오기
	void fileread() throws Exception {
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		String name="";
		double avg = 0;
		
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
		}
		br.close();
		fr.close();
		
		System.out.println("읽어왓심~");
		
	}// 파일 읽어오기 매소드 끝

	public void listPrint() {
		System.out.println("                          [ 학생성적출력 ]");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		for (int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),
					s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
		}
		
	}
	
	// 학생정보입력
	public void inputstu() {
		int[] score = new int[4];
		System.out.println("                          [ 학생성적입력 ]");
		System.out.println("--------------------------------------------------------------");
		System.out.print("이름 >> ");
		String name = scan.next();
		
		for (int i=0;i<3;i++) {
			System.out.printf("%s 점수 입력 >> ",title[i+2]);
			score[i] = scan.nextInt();
		}
		
		score[3] = score[0]+score[1]+score[2];
		double avg = score[3]/3.0;
		int rank = 0;
		
		list.add(new Stu(list.get(list.size()-1).getNo()+1,name,score[0],score[1],score[2],score[3],avg,rank));
	} // 학생정보입력끝

	
	// 학생성적수정
	public void stumodi() {
		System.out.println("                          [ 학생성적수정 ]");
		System.out.println("--------------------------------------------------------------");
		System.out.print("수정할 학생 이름 입력 >> ");
		String modiname = scan.next();
		int temp = 0;
		for (int i=0;i<list.size();i++) {
			if(modiname == list.get(i).getName()) {
				System.out.println(modiname+"학생을 찾았습니다.");
				System.out.println("수정 과목 선택");
				System.out.println("---------------------");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.println("---------------------");
				int choice = scan.nextInt();
				
				switch(choice) {
					case 1: 
						System.out.printf("현재 %s 점수 : %d",title[2], list.get(i).getKor());
						System.out.println("수정 점수 입력 >> ");
						temp = scan.nextInt();
						list.get(i).setKor(temp);
						break;
					case 2: 
						System.out.printf("현재 %s 점수 : %d",title[3], list.get(i).getEng());
						System.out.println("수정 점수 입력 >> ");
						temp= scan.nextInt();
						list.get(i).setEng(temp);
						break;
					case 3: 
						System.out.printf("현재 %s 점수 : %d",title[4], list.get(i).getMath());
						System.out.println("수정 점수 입력 >> ");
						temp = scan.nextInt();
						list.get(i).setMath(temp);
						break;
				}
				
				int newtotal = list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath();
				list.get(i).setTotal(newtotal);
				list.get(i).setAvg(newtotal/3.0);
				System.out.println("수정이 완료되었습니다.");
			}
		}
	}// 학생성적수정 끝

	// 학생성적삭제
	public void studel() {
		System.out.println("                          [ 학생성적삭제 ]");
		System.out.println("--------------------------------------------------------------");
		System.out.print("삭제할 학생 이름 입력 >> ");
		String delname = scan.next();
		
		for (int i=0;i<list.size();i++) {
			if(delname == list.get(i).getName()) {
				System.out.println(delname+"학생을 찾았습니다.");
				System.out.println(delname+"학생을 정말 삭제하시겠습니까?");
				System.out.println("---------------------");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.println("---------------------");
				int choice = scan.nextInt();
				if(choice == 1) {
					list.remove(i);
					System.out.println("학생성적삭제완료");
				}else {
					System.out.println("학생성적삭제가 취소되었습니다.");
				}
			}
		}
	} // 학생성적삭제 끝

	// 학생검색
	public void stusearch() {
		System.out.println("                          [ 학생성적검색 ]");
		System.out.println("--------------------------------------------------------------");
		System.out.print("찾을 학생 이름 입력 >> ");
		String searchname = scan.next();
		
		for (int i=0;i<list.size();i++) {
			if(searchname == list.get(i).getName()) {
				Stu s = list.get(i);
				System.out.println(searchname+"학생을 찾았습니다.");
				System.out.printf("[ %s 학생 성적 ]\n",s.getName());
				System.out.println("---------------------");
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),
						s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				System.out.println("---------------------");
			}
		}
		
	}// 학생검색 끝
	
	// 학생 등수정렬
		void s_sort() {
			System.out.println("[ 학생 등수정렬 ]");
			System.out.println("1. 등수 순차정렬");
			System.out.println("2. 등수 역순정렬");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				list.sort(new Comparator<Stu>());
				System.out.println("학생등수 순차정렬을 완료하였습니다.");
				break;
			case 2:
				list.sort(new Comparator<Stu>() {
					@Override
					public int compare(Stu s1, Stu s2) {
						return s2.getRank() - s1.getRank();
					}
				});
				System.out.println("학생등수 역순정렬을 완료하였습니다.");
				break;
			} // switch
		}
		
		
		// 학생 이름정렬
		void name_sort() {
			System.out.println("[ 학생 이름정렬 ]");
			System.out.println("1. 이름 순차정렬");
			System.out.println("2. 이름 역순정렬");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				list.sort(new Comparator<Stu>() {
					@Override
					public int compare(Stu s1, Stu s2) {
						return s1.getName().compareTo(s2.getName());
					}
				});
				System.out.println("학생이름 순차정렬이 완료하였습니다.");
				break;
			case 2:
				list.sort(new Comparator<Stu>() {
					@Override
					public int compare(Stu s1, Stu s2) {
						return s2.getName().compareTo(s1.getName());
					}
				});
				System.out.println("학생이름 역순정렬이 완료되었습니다.");
				break;
			}
		}
		

	// 등수처리
	public void rank() {
		for (int i=0;i<list.size();i++) {
			int rank = 0;
			for (int j=0;j<list.size();j++) {
				if(list.get(i).getTotal()<list.get(j).getTotal()) {
					rank += 1;
					list.get(i).setRank(rank); 
				}
			}
		}
		System.out.println("등수처리가 완료되었습니다.");
	} // 등수처리 끝

	// 파일저장
	public void savefile() throws Exception {
		String name = "Studata";
		File f = createFile(name+".txt");
		System.out.println("파일이 생성되었습니다.");
	}// 파일저장 끝

	static File createFile(String filename) throws Exception {
		File f = new File(filename);
		f.createNewFile();
		return f;
	}
}

