package step7_01.classArray;

class User1{ //User1의 클래스를 생성함
	
	String id; //id 문자 생성
	int money; //money 정수 생성
	
}


public class ClassArrayEx04_연습 {

	public static void main(String[] args) {
		
		User1[] user1 = new User1[2]; //user1의 배열을 2개를 생성하고 (User1의 의미는?)
		
		for (int i=0; i<user1.length; i++) { //user1배열의 크기 만큼 >i
			user1[i] = new User1(); //user1i의 배열의 순서, 각 배열마다 User1이 대응됨
		}
		
		user1[0].id = "qwer1234";//user1의 0번째 순서에서는 id
		user1[0].money = 1000;// user1의 0번째 순서에서는 money
		
		user1[1].id = "asdf1234"; //1번째
		user1[1].money = 2000; //1번째
		
		for (int i = 0; i < user1.length; i ++) { //user1의 배열의 크기 3>i
			System.out.println(user1[i].id + " " + user1[i].money); //각 배열의
		}
		
		User1 temp = user1[1]; //temp는 user1배열의 1번째
		temp.id = "zxcv1234"; //temp 즉 user1의 id 입력
		System.out.println("=====================================");
		
		for (int i = 0; i < user1.length; i ++) { //user1의 크기>i
			System.out.println(user1[i].id + " " + user1[i].money); // useri에서 순서대로, id에서 id와 money값 출력
		}

	}

}



