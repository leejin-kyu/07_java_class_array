package step7_01.classArray;

//클래스배열 생성
class Product {
	String name;
	int price;
}


public class ClassArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 클래스명[] 참조변수 = new 클래스명[배열의크기];
		Product[] productList = new Product[3];
		
		productList[0] = new Product();
		productList[1] = new Product();
		
		productList[0].name="기계식 키보드";
		productList[0].price=45000;
		
		productList[1].name="무소음 마우스";
		productList[1].price=35000;
		
		Product temp = new Product();
		temp.name = "장패드";
		temp.price=10000;
		productList[2] = temp;
		
		//엘리먼트 순회
		for(int i =0; i < productList.length; i++) {
			System.out.println("name :" + productList[i].name);
			System.out.println("price :" + productList[i].price);
			System.out.println();
		}
			// [응용] 생각해 보기
		Product[] temp1 = productList;
		Product temp2 = productList[0];
		String temp3 = productList[1].name;
		int temp4 = productList[1].price;

		Product p = productList[2];
		System.out.println("p:" + p);
		System.out.println("productList[2] :" + productList[2]);
		
		p.name = "장패드1";
		System.out.println("p.name :" + p.name);
		System.out.println("productList[2].name :" + productList[2].name);
		System.out.println();

		productList[2].name="장패드2";
		System.out.println("p.name : " + p.name);
		System.out.println("productList[2].name:" +productList);
		System.out.println();
}}