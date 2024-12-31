package java_study_1231;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 수업 {

	public static void main(String[] args) {
		// 제네릭과 컬렉션즈
		//배열기초 - 객체배열 - 제네릭과 컬렉션즈
		
		/*
		 * 제네릭과 컬렉션즈란
		 * 배열처럼 데이터를 저장함
		 * 빠른접근속도와 동적크기 조절이 가능한 장점들이 있음
		 * 
		 */
		int []array=new int[6];//배열은 저장공간을 작성해야 했음
		array[0]=10;
		array[5]=7;
		//배열큰 단점은 삭제기능이없음
		
		//ArrayList 컬렉션
		 ArrayList<Integer> list = new ArrayList<Integer>();//임포트하기
        /*
         * 제네릭 특징  
         * 클래스 타입만 넣을 수 있음 int형을 담고 싶으면 int에 클래스 타입인 Integer 작성
         *  
         */
		 
		 list.add(10);//0번째에 10추가
		 list.add(5);//1번째에 5추가
		 list.add(34);//2번째에 34추가
		 
		 int num1= list.get(0); //0번째 값 가져오기
		 System.out.println("조회:"+num1);
		 
		 int num2 = list.get(1);//1번째 값 가져오기
		 System.out.println("조회:"+num2);
		 
		 //list 사이즈 조회
		 System.out.println("사이즈 조회:"+list.size());
		 list.add(5);
		 System.out.println("사이즈 조회:"+list.size());//사이즈가 동적으로 변경
		 
		 //제거
		 list.remove(0);//0번째에 저장된 값 삭제
		 System.out.println("0번째 조회:"+list.get(0));//10은 삭제되고 5가 출력
		 System.out.println("사이즈 조회:"+list.size());
		 
		 //수정
		 list.set(0, 100);//0번째 요소에 100으로 수정
		 System.out.println("0번째 조회:"+list.get(0));
		 
		 //전체 출력
//		 for(int i : list) {
//			 System.out.println("저장된 값은 :"+i);
			 
			 //list에 저장된 총합과 평균구하기
			 list.add(40);
			 int sum =0;
			 int avg =0;
			 for(int i : list) {
				 sum+=i;
			 }
			 System.out.println("list에 저장된 총합"+sum);
			 System.out.println("list에 저장된 평균"+sum/list.size());
			 
			 //HashSet 컬렉션즈
			 /*
			  * HashSet:중복제거가 필요하거나 집합 연산을 수행해야 할 때 유용
			  * 1.중복을 허용하지 않는 고유한 요소만 저장
			  */
			 HashSet<Integer> set = new  HashSet<Integer>();// 임포트하기
			 set.add(10);//0번째 요소에 10추가
			 set.add(20);//1번째 요소에 20추가
			 set.add(10);//2번째 요소에 10추가 ->중복값은 무시됨
			 
			 System.out.println("HashSet 크기"+ set.size());
			 
			//HashSet은 특정요소 조회 불가능 get이없음
			//HashSet 요소값 검색
			 
			 set.contains(10);//10이 set에 저장되어있으면 true 아니면 false
			 //내부값이 존재하는지만 판단할 수 있음
			 
			 //삭제
			 set.remove(20); //HashSet에 저장된 20 찾아서 삭제
			 //즉, HashSet은 추가와 삭제만 가능
			 
			 //HashMap 컬렉션즈
			 /*
			  * HashMap은 마치 사전과 같습니다
			  * 사전에서 단어를 찾으면 그에 해당하는 뜻이 나오는것처럼
			  * 키를 사용해 값을 저장하고 검색하는 자료구조입니다.
			  */
			 HashMap<String,Integer> map = new HashMap<String,Integer>();
			 //<String(Key), Integer(value)>
			 /*
			  * 1.데이터는 항상 키와 값의 쌍으로 저장됨
			  * 2.각 키는 중복될 수 없지만 값은 중복될 수 있음
			  * 3.키를 사용해 값을 조회
			  * 4.HashMap은 데이터의 순서를 보장하지 않습니다
			  */
			 
			 //데이터 추가
			 map.put("사과", 500);
			 map.put("포도", 800);
			 
			 //데이터 조회
			 int price = map.get("포도");//키를 이용해서 값을 조회함
			 System.out.println("포도값은:"+price);
			 
			 //데이터 수정
			 map.put("포도", 2000);//800 ->2000으로 수정
			 price = map.get("포도");
			 System.out.println("포도값은:"+price);
			 
			 //데이터 삭제
			 map.remove("사과");//키를 입력해서 삭제한다 ->사과 삭제
			 
			 //데이터 존재확인
			 boolean hasBanana = map.containsKey("바나나");//키 이름이 "바나나" 있는지 확인
			 System.out.println("바나나 있어요?"+hasBanana);
			
			 //전체출력
			 //keySet으로 모든키를 가져온 후 각 키에 해당하는 get()메소드로 값을 얻음
			 for(String key:map.keySet()) {
				 System.out.println("키:"+key);
				 System.out.println("값:"+map.get(key));
			 }
		 }
	
		 
	}


