package java_study_1128;

public class 수업 {

	public static void main(String[] args) {
		String text ="ediya";
		System.out.println("문자열 길이:"+text.length());// 문자열길이출력
    
		String userId ="홍길동";
		if(userId.length()>+10) {
			System.out.println("아이디는 10글자 미만작성");
		}else {
				System.out.println("사용가능한 아이디");
			}
		//concat: 두 문자열을 합친다
		String a = "apple";
		String b = "watch";
		System.out.println("문자열합치기"+a.concat(b));
		
		//substring: 부분 문자열 추출
		String text1 = "hello, world";
		System.out.println(text1.substring(0,5));
		//wor  출력
		System.out.println(text1.substring(7,10));
		
		//indexOf :문자열 검색
		System.out.println(text1.indexOf("l"));//l 은 2번째 위치
		System.out.println(text1.indexOf("w"));//w 는 7번째 위치
		
		//replace:문자열 대체
		String word = "순대국밥";
	    System.out.println(word.replaceAll("순대","돼지"));//순대를 돼지로 대체

	    //toUpper.toLower : 소문자->대문자, 대문자->소문자 변경
	    String code ="abcd00";
	    System.out.println(code.toUpperCase());//소문자에서 대문자로 강제변환
	    String code2 ="BCC00";
	    System.out.println(code2.toLowerCase());
	    //trim: 공백제거
	    
	   String word2="  안녕하세요?";
	   System.out.println(word2.trim());//앞뒤 공백제거
	   
	   //split:문자 분할
	   String word3 ="한화이글스,두산베어스,롯데자이언츠";
	   String[] result= word3.split(",");
	   System.out.println(result[0]);
	   System.out.println(result[2]);
	 
	   //contains :특정 문자열이 포함되어 있는지 여부확인
	  String word4 = "hyunsangwon93@gmail.com";
	  System.out.println(word4.contains("@"));//있으면 true 없으면 false
	  System.out.println(word4.contains("e"));//있으면 true 없으면 false
	  
	 //equals: 문자열 비교
	  String food="등심돈까스";
	  String food2="등심돈까스";
	  String food3="치즈돈까스";
	  //자바에서 문자열 비교는 equals로 합니다
	  System.out.println(food.equals(food2));//두 문자가 동일한지 비교
	  System.out.println(food.equals(food3));
	  
	   
	}

}
