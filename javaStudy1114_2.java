package java_study_1114;

public class javaStudy1114_2 {

   public static void main(String[] args) {
      
      int number = 10;  //오른쪽에서 왼쪽으로 데이터 대입
      
      System.out.println("안에 있는 숫자는 뭘까? " + number);
      /*
       * int : 정수형 데이터 타입
       * number : 식별자(변수명)
       * = : 대입
       * 10 : 정수형 데이터
       * ; : 문단 종료
       */
      
      /*
       * 자바는 기본데이터타입 8개와 레퍼런스타입 1개 총 9개의 데이터타입을 가지고있다.
       * String은 레퍼런스 타입.
       * 레퍼런스란 다음시간에 배워보겠습니다.
       */
      
      int x = 10;
      System.out.println("정수형 데이터타입 : " + x);
      double y = 10.5555;
      System.out.println("실수형 데이터타입 : " + y);
      boolean z = true; //true(참) 혹은 false(거짓)만 올 수있다.
      System.out.println("논리형 데이터타입 : " + z);
      char a = 'a'; //문자 데이터타입 (문자열 아님)
      System.out.println("문자 데이터타입 : " + a);
      String s = "Hello World";
      System.out.println("문자열 데이터타입 : " + s);
      /*
       * 문자와 문자열 차이점
       * 문자는 한단어만 입력가능, 문자열은 여러 단어 입력가능
       */
      
      
   }

}

