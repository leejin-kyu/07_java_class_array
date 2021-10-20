package step7_01.classArray;

import java.util.HashMap;

/*
	 # HashMap
	 
	- HashMap은 K(Key)에 V(Value)를 할당 방식으로 데이터가 저장하는 데이터 형식이다.

	Ex)
	 HashMap<String,Integer> : key의 데이터타입은 String이고 저장된 값은 Integer이다.
	 HashMap<String,String>  : key의 데이터타입은 String이고 저장된 값은 String이다.
	 HashMap<String,Object>  : key의 데이터타입은 String이고 저장된 값은 Object이다.
	 HashMap<String,Product> : key의 데이터타입은 String이고 저장된 값은 Product이다.
	 HashMap<String,Member>  : key의 데이터타입은 String이고 저장된 값은 Member이다.
*/

public class ClassArrayEx15 {

	public static void main(String[] args) {
	
		HashMap<String, Integer> hMap= new HashMap<String, Integer>();
		HashMap<String, Integer> hMap2= new HashMap<>(); //우변의 제네릭은 생략 가능
		
		//HashMap<String , Integer> hMap2 = new HashMap<>(); // 우변의 제네릭은 생략 가능
		// put(key, value) : HashMap의 key에 value를 할당한다. (물품보관함의 열쇠를 생각!!) 
		// put()메서드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다. 
		
		hMap.put("data1", 1000);
		hMap.put("data2", 2000);
		hMap.put("data3", 3000);

		System.out.println(hMap);
		System.out.println("\n ================= \n");
		
		hMap.put("data1", 10000); // 키가 같으므로 데이터 수정
		hMap.put("data4", 4000); // 데이터 추가
		hMap.put("data5", 5000); // 데이터 추가

		System.out.println(hMap);
		System.out.println("\n ================= \n");

		// get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println(hMap.get("data1"));
		System.out.println(hMap.get("data2"));
		System.out.println(hMap.get("data3"));
		System.out.println(hMap.get("data4"));
		System.out.println(hMap.get("data5"));
		System.out.println(hMap.get("\n ======================= \n"));
		
		//keySet() : HashMap의 key만 얻어온다.
		System.out.println(hMap.keySet());
		System.out.println("\n ===================");
		
		for (String key : hMap.keySet()) {
			System.out.println(hMap.get(key));
		}
		System.out.println("\n =============== \n");

		// remove(key) : HashMap의 key에 해당하는 값을 제거한다. 
		hMap.remove("data2");
		hMap.remove("data3");
		System.out.println(hMap);
		System.out.println("\n ================= \n");
		
		hMap.clear(); // HashMap의 모든 데이터만 삭제
		hMap = null; // HashMap자체를 삭제
		
		
		// 웹에서 자주 사용하는 예시
		HashMap<String, Product> hMap3 = new HashMap<String, Product>();
		
		//단순히 실습데이터 생성
		for (int i =0; i<4; i++) {
			Product temp = new Product();
			temp.name = "데이터" + i;
			temp.price = 10000 * i;
			// put(식별자 , 객체)
			hMap3.put(temp.name, temp); //key는 데이터, value는 temp의 전체 
		}
		
		System.out.println(hMap2.get("데이터1"));
		System.out.println(hMap2.get("데이터2"));
		System.out.println(hMap2.get("데이터3"));
		System.out.println();
		
		Product temp1 = hMap3.get("데이터1");
		Product temp2 = hMap3.get("데이터2");
		Product temp3 = hMap3.get("데이터3");
		
		System.out.println(temp1.name + "/" + temp1.price);
		System.out.println(temp2.name + "/" + temp2.price);
		System.out.println(temp3.name + "/" + temp3.price);
	}	
}