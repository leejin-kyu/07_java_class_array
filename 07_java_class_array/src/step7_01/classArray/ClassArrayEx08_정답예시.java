package step7_01.classArray;
import java.util.Scanner;


class Student8{//학생>subjects(name,score),name
	
	Subject8[] subjects;
	String name;
}


class Subject8{ //과목 클래스 >name, score
	
	String name;
	int score;
}




public class ClassArrayEx08_정답예시 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //입력
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student8[] stdList = new Student8[3]; //Student속성으로 하는 stdList배열 3개 생성
		int stdCnt = 0;	// 학생 수
		
		while (true) {
			
			for (int i=0; i<stdCnt; i++) { //학생수보다 작게 반복
				System.out.println("[" + (i+1) + "]" + stdList[i].name + "학생>>>"); //stdList의 각 배열의 이름
				if (stdList[i].subjects != null) {//stdList 각 과목의 배열에서 과목값이 비어있지 않다면
					for (int j=0; j<stdList[i].subjects.length; j++) { //stdList의 각과목의 길이만큼
						System.out.println("[" + (j+1) + "]" + stdList[i].subjects[j].name + "과목 = " + stdList[i].subjects[j].score + "점");
						//stdList의 각과목의 이름과 점수를 출력함
					}
				}
				System.out.println();
			}
			
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if (choice == 1) { //학생 추가하기를 선택하였음
				
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				stdList[stdCnt] = new Student8(); //stdList에서 학생수만큼의 과목과 이름 배열
				stdList[stdCnt].name = name; //stdList의 이름에서...
				stdCnt++;			
			}
			
			else if (choice == 2) { //과목 추가하기 선택!!
				
				for (int i=0; i<stdCnt; i++) {
					System.out.println("[" + (i+1) + "]" + stdList[i].name);
				}
				System.out.print("학생 선택 : ");
				int select = scan.nextInt();
				select--;
				
				System.out.print("과목 입력 : ");
				String subject = scan.next();
				
				if (stdList[select].subjects == null) {
					
					stdList[select].subjects = new Subject8[1];
					
					stdList[select].subjects[0] = new Subject8();
					stdList[select].subjects[0].name = subject;
					
				}
				else {
					
					int size = stdList[select].subjects.length;
					
					Subject8[] temp = stdList[select].subjects;
					stdList[select].subjects = new Subject8[size + 1];
					
					for(int i=0; i<size; i++) {
						stdList[select].subjects[i] = temp[i];
					}
					
					stdList[select].subjects[size] = new Subject8();
					stdList[select].subjects[size].name = subject;
					
					temp = null;
					
				}
			}
			else if (choice == 3) {
				
				for (int i=0; i<stdCnt; i++) {
					System.out.println("[" + (i+1) + "]" + stdList[i].name);
				}
				System.out.print("학생 선택 : ");
				int select = scan.nextInt();
				select--;
				
				if (stdList[select].subjects != null) {
					for (int i=0; i<stdList[select].subjects.length; i++) {
						System.out.println("[" + (i+1) + "]" + stdList[select].subjects[i].name);
					}
				}
				
				System.out.print("과목 선택 : ");
				int num = scan.nextInt();
				num--;
				
				System.out.print("성적 입력 : ");
				int score = scan.nextInt();
				
				stdList[select].subjects[num].score = score;
				
			}
			else if (choice == 4) {
				System.out.println("종료");
				break;
			}
		
		}

		scan.close();

	}

}
