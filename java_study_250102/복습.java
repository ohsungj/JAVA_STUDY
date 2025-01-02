package java_study_0102;

import java.util.ArrayList;

public class 복습 {

	public static void main(String[] args) {
		/*
		 * ArrayList는 자바에서 가장 많이 사용되는 자료구조 중 하나
		 * 일반 배열과 비슷하지만 크기가 유동적으로 변할 수 있는 동적배열이라고 생각하면 됨
		 * 
		 * 일반 배열은 크기가 고정된 장바구니라면
		 * ArrayList는 필요에따라 크기가 늘어나는 장바구니
		 * 
		 * 1.일반 배열과 다르게 사이즈 선언할 필요가 없음
		 * 2.클래스 타입(래퍼런스 타입)만 추가 가능(int double boolean (x))사용불가
		 *integer:wrapper 클래쓰
		 */
		
		ArrayList<String> shoppingList = new ArrayList<String>();
		//ArrayList생성 String 타입의 항목을 생성
		
		//항목추가
		shoppingList.add("우유");//장바구니에 물건을 넣는것과 비슷
		shoppingList.add("계란");
		shoppingList.add("빵");
		
		
		//장바구니에 있는 모든 항목을 출력
		System.out.println("장바구니 품목:"+shoppingList);
		//하나씩 출력하기
		for(String s : shoppingList) {
			System.out.println("장바구니 품목:"+s);
		}
		
		//특정위치에 항목추가
		shoppingList.add(1,"치즈");//첫번째 자리에 치즈 추가
		System.out.println("장바구니 품목:"+shoppingList);
		
		//항목갯수확인
		System.out.println("담긴 항목수:"+shoppingList.size());
		
		//특정항목이 있는지 확인
		if(shoppingList.contains("빵")) {
			System.out.println("빵이 장바구니에 있습니다");
		}else {
			System.out.println("빵은 장바구니에 없습니다");			
		}
		
		//특정항목제거
		shoppingList.remove("계란");//장바구니에 계란제거
		//최종 장바구니 내용출력
		System.out.println("최종 장바구니:"+shoppingList);
	
	}

}
