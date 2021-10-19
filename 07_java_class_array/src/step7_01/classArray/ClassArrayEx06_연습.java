package step7_01.classArray;

class Member{ //Member->name,num
	
	String name;
	int num;
	
}


class MemberManager{

	Member[] memberList = new Member[3]; // MemberManger->memberList(Member 값)->name,num //memberList->name,num

}


public class ClassArrayEx06_연습 {

	public static void main(String[] args) {

		MemberManager mg = new MemberManager(); // mg ->memberList->name, num
		Member m1 = new Member();// m1값 정의, Member값
		mg.memberList[0] = m1; // mg ->memberList의 첫번째 배열==m1 -> name==김철수, num==1001	
		m1.name = "김철수";
		m1.num = 1001;
		
		m1 = new Member();
		mg.memberList[1] = m1; // mg ->memberList의 두번째 배열 m1 -> name==이만수, num==1002
		m1.name = "이만수";
		m1.num = 1002;
		
		m1 = new Member();
		mg.memberList[2] = m1; // mg ->memberList의 세번째 배열 m1 -> name==박영희, num==1003
		m1.name = "박영희";
		m1.num = 1003;
		
		for (int i = 0; i < mg.memberList.length; i++) { //memberList의 배열의 크기 만큼만
			System.out.println("num : " + mg.memberList[i].num);  //
			System.out.println("name : " + mg.memberList[i].name);  //
			System.out.println();
		}
		
		Member temp = mg.memberList[1];
		System.out.println(temp.name);

	}

}
