package step7_01.classArray;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 
 * [ 래퍼 클래스(wrapper class) ]
 * 
 * - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
 *   [기본형]          [래퍼 클래스]
 *    byte                Byte
 *    short               Short
 *    int                 Integer
 *    long                Long
 *    float               Float
 *    double              Double
 *    char                Character
 *    boolean             Boolean
 *
 *
 *
 *  [ 제네릭 ]
 *  
 * - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을
 *   반드시 클래스로 작성한다.
 * - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는
 *   래퍼 클래스를 사용한다.
 *
 *
 *
 *  [ java.util.ArrayList ]
 *  
 * - 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
 * - ArrayList 클래스는 데이터가 입력되면, 자동으로 크기가 커지고
 * - 데이터가 제거되면, 자동으로 크기가 작아진다.
 * - 중간에 데이터가 삽입되면, 데이터가 삽입될 위치부터 모든 데이터가 뒤로 이동되고
 * - 중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
 * - ArrayList 생성 방법
 * 
 *   ArrayList list = new ArrayList();                      // JDK 1.4 이전
 *   ArrayList<Integer> list = new ArrayList<Integer>();    // JDK 1.5 이후
 *   ArrayList<Integer> list = new ArrayList<>();           // JDK 1.7 이후 
 *   
 */


public class ClassArrayEx10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
	
		
		ArrayList<Integer> arrList = new ArrayList<>();
		System.out.println(Arrays.toString(arr));
		System.out.println(arrList);
		System.out.println("\n===============\n");
		
		arr[0] =10;
		arr[1] =20;
		arr[2] =30;
		arr[3] =40;
		arr[4] =50;		

		arrList.add(10);
		arrList.add(20);
		arrList.add(40);
		arrList.add(2,30); //40이 뒤로 밀림
		arrList.add(50);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arrList);
		System.out.println("\n===============\n");
		
		System.out.println("배열의 크기:" + arr.length);
		// size() : arrayList의 데이터의 개수를 반환한다.
		System.out.println("어레이리스트의 크기: " + arrList.size());
		System.out.println("\n=================\n");
		
		arr[0] = 10000;
		arr[1] = 20000;
		arr[2] = 30000;
		
		// set(index, value): ArrayList의 index번째의 값을 value값으로 수정한다.
		arrList.set(0, 1000);
		arrList.set(1, 2000);
		arrList.set(2, 3000); 
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arrList);
		System.out.println("\n===============\n");
		
		arr[0] =0;
		arr[1] =0;
		arr[2] =0;
		
		// remove(index) : ArrayList의 index번째 위치의 값을 삭제한다. 
		arrList.remove(2);
		arrList.remove(1);
		arrList.remove(0);
		System.out.println(Arrays.toString(arr));
		System.out.println(arrList);
		System.out.println("\n===============\n");
		
		for (int i =0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");

		// get(index): ArrayList의 index번째의 value를 얻어온다. 
		for (int i =0; i<arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}
		System.out.println("\n");
		
		/*
		 * 
		 *  # 향상된 for문 (foreach)
		 *  
		 *  [ 구조 ]
		 *  
		 *  for (자료형 변수명 : Array or ArrayList) {
		 *  	명령어;
		 *  }
		 * 
		 *  element가 직접 변수에 저장된다.
		 * 
		 * */

		for (int element : arr) {
			System.out.println(element + " ");
		}
		System.out.println("\n");
		
		for (int element : arrList) {
			System.out.println(element + " ");
		}
		System.out.println("\n");
		
		// 예시 1)
		String[] indexs = {"한놈", "두시기", "석삼", "너구리", "오징어"};
		
		for (String index : indexs) {
			System.out.println(index + " ");
		}
		System.out.println("\n");
		
		// 예시 2) 이해ㅠㅠ
		ArrayList<Product> productList = new ArrayList<Product>();
		for (int i =0; i<10; i++) {
		
			Product pd = new Product();
			pd.name="상품" + i;
			pd.price = 100000;

			productList.add(pd);
			
		}
		System.out.println("\n for문 \n");
		for (int i =0; i<productList.size(); i++) {
			System.out.println("name :" + productList.get(i).name);
			System.out.println("price :" + productList.get(i).price);
			System.out.println();
		}
		// productList.get(i)

		System.out.println("\n foreach문 \n");
		for (Product product : productList) {
			System.out.println(product.name);
			System.out.println(product.price);
			System.out.println();
		}
			
		arr = null; // 배열 전체 삭제
		arrList.clear(); // ArrayList의 전체 데이터만 삭제(ArrayList는 살아있음)
		arrList=null; // ArrayList 자체를 삭제(ArrayList가 사라짐)
		
		for (int i =0; i<indexs.length; i++) {
			System.out.println(indexs[i]);
		}
		
		}
	}