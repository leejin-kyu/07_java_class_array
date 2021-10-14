package step7_01.classArray;


class Client{ //Client class
	
	String name; //name 문자
	int score; //score 정수
	
	void setData (String name, int score) { //setData 설정
		this.name = name ;	// 멤버변수에 파라메타로 넘어온 데이터를 대입
		this.score = score;	// 멤버변수에 파라메타로 넘어온 데이터를 대입
	}
	
	void printData() {
		System.out.println(this.name  + " : " + this.score);
	}
	
}

public class ClassArrayEx03_연습 {

	public static void main(String[] args) {
		
		
		Client[] clients = new Client[3]; //클래스 Client 호출 후 client 배열 3개 생성
		
		for (int i = 0; i < clients.length; i++) { //client 길이 3>i
			clients[i] = new Client(); // client배열 각 방마다 Client를 불러옴
		}
		
		clients[0].setData("김철수",100); //각 클라이언스 배열 방의 setData에 name과 Score값 입력
		clients[1].setData("이만수",20);
		clients[2].setData("박영희",70);
		
		for (int i = 0 ; i < clients.length; i++) { // 클라이언트 배열의 길이 > i
			clients[i].printData(); // 각 client 배열의 prinData부분을 i순서대로 실행함 
		}

	}

}
