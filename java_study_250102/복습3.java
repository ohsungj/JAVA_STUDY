package java_study_0102;

import java.util.HashMap;

public class 복습3 {

	public static void main(String[] args) {
		/*
		 * HashMap은 자바에서 가장많이 사용되는 자료구조 중 하나
		 * 키(key)와 값(value)의 쌍으로 데이터를 저장하는 동적 맵이라고 생각하면 됩니다.
		 * 
		 * HashMap은 키값으로 검색하는 사전과 같습니다
		 * HashMap은 단어(key)로 그에 해당하는 뜻(value)를 찾을 수 있는 사전과 같다
		 */
		
		//HashMap 생성 (String 타입의 키와 값을 저장할 수 있는 사전)
		HashMap<String,String> dictionary = new HashMap<>();//사전 생성
		
		//사전에 단어와 뜻 추가하기
		dictionary.put("성심당", "베이커리 전문점");
		dictionary.put("엑스포", "1993년 세계 박람회..");
		dictionary.put("대전 오월드", "중구 사정동에 위치한 종합테마 공원");
		
		//사전에 등록된 모든 단어와 뜻 출력
	    System.out.println("사전내용:"+dictionary);
	    //특정 단어의 뜻 찾기
	    //get안에 키값 넣기
	    System.out.println("성심당:"+dictionary.get("성심당"));
	    
	    //사전에 등록된 단어 갯수 확인
	    System.out.println("등록된 단어수:"+dictionary.size());
	    
	    //특정 단어가 있는지 확인하기
	    if(dictionary.containsKey("엑스포")) {
	    	System.out.println("사전에 있는 단어입니다");
	    }else {
	    	System.out.println("사전에 없는 단어입니다");
	    }
	    //특정단어삭제
	    dictionary.remove("대전 오월드");
	    //최종 사전내용 출력
	    System.out.println("최종 사전내용:"+dictionary);
	    

	}

}
