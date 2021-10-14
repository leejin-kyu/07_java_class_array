package step7_01.classArray;

class Card{ //Card 클래스 생성
	
	int num; //정수
	String shape; //문자
	
}

public class ClassArrayEx02_연습 {

	public static void main(String[] args) {
		
		 Card[] arr = new Card[10];//arr배열 생성, 배열의 개수는 10개
		 
		 // for문 활용
		 for (int i = 0; i < 10;  i++) { //arr 배열의 개수 만큼 
			 arr[i] = new Card(); //Card 클래스가 배열의 개수 만큼 돌기
			 arr[i].num = (i + 1); //배열의 개수 순서에서 플러스 1추가 
			 arr[i].shape = "클로버"; // 모두다 클로버로 
		 }

		 for (int i = 0; i < arr.length; i++) { // 배열의 크기만큼 i가 증가
			System.out.println("num : " + arr[i].num); //num 문자후 arr 배열의 순서에서 num 불러오기 출력
			System.out.println("shape : " + arr[i].shape); //shape 문자 추가후 shape 배열에서 shape 순서대로 불러 오기 출력 
			System.out.println(); //
		}
		 
	}

}
