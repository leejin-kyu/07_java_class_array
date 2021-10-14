package step7_01.classArray;

import java.util.Arrays;
import java.util.Scanner;

class User2 {//class User2 생성
	
	String id; //문자
	int money;// 정수
	
}


public class ClassArrayEx05_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 		//scan 생성, Scanner 값으로//
		
		final int MAX_NUM = 100;	//final int?
		User2[] user2 = new User2[MAX_NUM];// user2 배열 생성하는데 MaxNum값 만큼!	
		
		for (int i = 0; i < MAX_NUM; i++) { // MAxnum수만큼>i
			user2[i] = new User2(); //user2각 배열의 순서마다 User2 클래스의 내용이 들어감
		}
		
		int usrCnt = 0; //정수 변수 
		
		while (true) { // 반복
			
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료"); //출력문
			int sel = scan.nextInt(); //입력값이 정수 sel에 저장
			
			if (sel == 1) { //입력값 1
				User2 temp = new User2(); // temp 생성, user2 배열에 내용을 넣기 위해서
				System.out.println("이름을 입력하세요 ");
				temp.id = scan.next(); // id입력
				System.out.println("금액을입력하세요 ");
				temp.money = scan.nextInt(); // 돈 입력
				user2[usrCnt] = temp; // user2의 배열의 순서대로 temp 내용 저장
				usrCnt++; //배열의 순서에 추가되기 위해서 숫자증가
			}
			else if (sel == 2) {//1번이 아닌 (else if) 2번 입력
				System.out.println("인덱스를 입력하세요 ");
				int index = scan.nextInt();//index에 입력값 저장
				for (int i = index; i < usrCnt - 1; i++) { //index에 i 값 대입하고 userCnt > i
					user2[i] = user2[i + 1]; //user2에서 모든 배열의 값은 동일, 
				}
				usrCnt--; 
			}
			else if (sel == 3) {
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(user2[i].id + user2[i].money);
				}
			}
			else if (sel == 4) {
				break;
			}		
			
		}

		scan.close();
		
	}

}
