package step7_01.classArray;

//# 클래스 배열 응용

class Student{
	
	Subject[] subjects;	// Subject 객체를 담을 클래스 배열
	String name;
	
}

class Subject{
	
	String name;
	int score;
}



public class ClassArrayEx07_연습 {

	public static void main(String[] args) {

		Student[] st = new Student[3]; //st는 Student 속성의 자료가 들어가는 배열을 생성함.
		
		st[0] = new Student(); 
		st[0].subjects = new Subject[3]; //st.
		
		for (int i = 0; i < 3; i++) {
			st[0].subjects[i] = new Subject();
		}
		
		st[1] = new Student();
		st[1].subjects = new Subject[2];
		st[1].subjects[0] = new Subject();
		st[1].subjects[1] = new Subject();
		
		st[2] = new Student();
		st[2].subjects = new Subject[1];
		st[2].subjects[0] = new Subject();

	}

}
