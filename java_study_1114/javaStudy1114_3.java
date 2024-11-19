package java_study_1114;

import java.util.Scanner; //Scanner의 기능을 사용할 때 import 키워드를 이용해서 불러옴

class javaStudy1114_3 {

   public static void main(String[] args) {
      
      //Scanner를 이용한 키 입력
      Scanner scan = new Scanner(System.in); //데이터를 입력받을 때 사용
      //ctrl + shift + o
      
      //문제1. 두 개의 정수를 입력받아, 그 합을 출력하기
      System.out.print("첫번째 정수를 입력하세요 : ");
      int x = scan.nextInt(); //정수형 입력받기
      System.out.print("두번째 정수를 입력하세요 : ");
      int y = scan.nextInt(); 
      
      int sum = x + y; //입력받은 x와 y 더한 값을 sum에 대입
      System.out.println("두 정수의 합은 : " + sum);
      int mul = x * y; //입력받은 x와 y 곱한 값을 mul에 대입
      System.out.println("두 정수의 곱은 : " + mul);
      int div = x / y; // y 나누기 x 값을 div에 대입
      System.out.println("나눈 값은? : "+ div);
      
      //문제2. 실수형 변수 height을 선언하고 180.7을 할당(대입)하는 코드를 작성하기
      double height = 180.7;
      
      //문제3. 입력받은 두 정수형 평균값 구하기
      System.out.print("a 값 입력 : ");
      int a = scan.nextInt();
      System.out.print("b 값 입력 : ");
      int b = scan.nextInt();
      
      //평균 : 총합 / 총 개수
      int avg = (a + b) / 2; //a와 b를 더한값에 2를 나눈값을 avg에 대입.
      System.out.println("입력받은 두 정수의 평균은 : "+avg+"입니다.");
      
      //문제3.
      /*
       * 사용자로부터 이름(문자열)과 나이(정수형)를 입력받아,
         "안녕하세요, [이름]님! 당신은 [나이]살입니다."라는 메시지를 출력하세요.
       */
      System.out.print("이름을 입력하세요 :");
      String name = scan.next();
      System.out.print("나이를 입력하세요 :");
      int age = scan.nextInt();
      System.out.println("'안녕하세요', "+name+"님! 당신은 "+age+"살입니다.");
      
   }
}

