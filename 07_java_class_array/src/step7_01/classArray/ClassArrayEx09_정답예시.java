package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentEx{ //클래스명 정의 StudentEx안에 id, pw, printData
	
	String id = "";
	String pw = "";
	
	void printData() { 
		System.out.println("이름 : " + id + " 비밀번호 : " + pw); //id와 pw
	}
}



class Controller { //Controller>StudentEx
	
	StudentEx[] list = null; //배열의 초기값
	int stdCnt = 0;
	
	void addStudentEx(StudentEx st) {
		
		if (stdCnt == 0) { //초기값이 0이면
			list = new StudentEx[1]; // 1개의 배열 생성
		}
		else if (stdCnt > 0) { // 0보다 크면
			StudentEx[] temp = list; //StudentEx를 속성으로 하는 temp는 StudentEx의 1개 배열 생성
			list = new StudentEx[stdCnt + 1]; // 배열의 개수가 1개 증가!
			for (int i = 0; i < stdCnt; i++) { 
				list[i] = temp[i]; // list배열의 개수는 temp배열의 개수와 동일!
			}
			temp = null;
		}
		list[stdCnt] = st;
		stdCnt++;
		
	}
	
	
	
	StudentEx removeStudentEx (int index) { //index값 입력시 
		
		StudentEx del_st = list[index];//
		if (stdCnt == 1) {
			list = null;
		}
		else if (stdCnt > 1) {
			StudentEx [] temp = list;
			list = new StudentEx[stdCnt -1];
			for (int i = 0; i < index; i++) {
				list[i] = temp[i];
			}
			for (int i = index; i < stdCnt -1; i++) {
				list[i] = temp[i + 1];
			}
			temp = null;
		}
		stdCnt--;
		
		return del_st;  // 굳이 return을 안해주고 데이터만 삭제해주어도 되는데
						// 타 언어의 pop()메서드와 같이 삭제하는 데이터를 return하는 방식처럼 구현해본 예시
		
	}
	
	
	
	int checkId(StudentEx st) {
		
		int check = -1;
		for (int i = 0; i < stdCnt; i++) {
			if (list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
		
	}
	
	
	
	void printStudentEx() {
		
		for (int i = 0; i < stdCnt ;i++) { //stdCnt 값까지
			list[i].printData(); //
		}
		
	}	
	
	
	
	String outData() {
		
		String data = ""; //data 명을 ""으로 정의
		if (stdCnt == 0){
			return data;
		}
		data += stdCnt; //data는 stdCnt값이 점점 증가함!!!
		data += "\n";
		for (int i = 0; i < stdCnt; i++) {
			data += list[i].id;
			data += ",";
			data += list[i].pw;
			if (stdCnt - 1 != i) {
				data += "\n";
			}
		}
		return data;
		
	}
	
	
	
	void sortData() { //정렬하기 부분
		
		for (int i = 0; i < stdCnt; i++) { //stdCnt는 배열의 개수(?)
			for (int n = 0; n < stdCnt ; n++) { //n의 개수가 증가함 
				if (list[i].id.compareTo(list[n].id) > 0) {
					StudentEx temp = list[i];
					list[i] = list[n];
					list[n] = temp;
				}
			}
		}
		
	}
	
	
	
	void loadStudentEx (StudentEx[] temp , int count) {
		
		this.stdCnt = count;
		this.list = temp;
		
	}
	
}


public class ClassArrayEx09_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //입력
		Controller controller = new Controller(); //???
		
		
		while (true) { //반복문
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt(); //입력
			
			if (sel == 1) { //가입클릭시
				
				StudentEx temp = new StudentEx(); //Student Ex클래스 속성의 temp 생성
				System.out.println("[가입] id 를 입력하세요 >>> "); //
				temp.id = scan.next(); //입력된 id가 저장됨		
				int check =  controller.checkId(temp); // ??
				
				if (check == -1) { //???
					System.out.println("[가입] pw 를 입력하세요 >>> ");
					temp.pw = scan.next(); //pw를 입력하시오
					controller.addStudentEx(temp); //	
					System.out.println(temp.id + "님 가입을 환영합니다.");
				}
				else {
					System.out.println("중복아이디 입니다.");
				}	
				
			}
			else if (sel == 2) { //탈퇴 클릭 시 
				
				controller.printStudentEx(); //??무슨 의미인지? 
				StudentEx temp = new StudentEx(); //temp는 StudentEx를 자료 속성으로 함.
				System.out.println("[탈퇴] id 를 입력하세요 >>> ");
				temp.id = scan.next(); //탈퇴 id 입력
				int check = controller.checkId(temp); 
				
				if (check == -1) {//checkId 초기값 -1 일치하는 아이디가 없을시
					System.out.println("없는 아이디입니다.");
				}
				else {
					StudentEx del_st = controller.removeStudentEx(check); //del_st
					System.out.println(del_st.id + "님 탈퇴 되었습니다.");
				}
				
			}
			else if (sel == 3) { // 정렬
				
				controller.sortData(); 
				controller.printStudentEx();
				
			}
			else if (sel == 4) { // 출력 입력
				
				controller.printStudentEx();
				
			}
			else if (sel == 5) { // 저장
				
                if (controller.stdCnt == 0) continue; //
				
                FileWriter fw = null; //
                
                try {
                	
					fw = new FileWriter("StudentEx_manager.txt");
					String data = controller.outData();
					if (!data.equals("")) {
						fw.write(data);
						System.out.println(data);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
                finally {
                	try {fw.close();} catch (IOException e) {e.printStackTrace();}	
                }
                
			}
			else if (sel == 6) {
				
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					
					File file = new File("StudentEx_manager.txt");
					
					if (file.exists()) {
						
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						String line = br.readLine();
						int count = Integer.parseInt(line);
						StudentEx [] temp = new StudentEx[count];
						
						for (int i = 0; i < count; i++) {
							temp[i] = new StudentEx();
							line = br.readLine();
							String[] value = line.split(",");
							temp[i].id = value[0];
							temp[i].pw = value[1];
						}
						
						controller.loadStudentEx(temp , count);
						
					}
					
					controller.printStudentEx();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				finally {
					try {br.close();} catch (IOException e) {e.printStackTrace();}
					try {fr.close();} catch (IOException e) {e.printStackTrace();}
				}
									
			}
			else if (sel == 7) {
				System.out.println("종료");
				break;
			}
			
		}

		scan.close();
		
	}

}
