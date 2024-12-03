package java_study_1126;

import java.util.Scanner;

public class 반복문 {

	public static void main(String[] args) {
		//이중 for문(중첩반복)
		//반복문이 다른 반복문을 내포하는 구조
		//이론적으로 2중3중4중  n중까지 가능
		//너무 많은 중첩은 프로그램 구조를 복잡하게 한다
      for(int i=0; i<3; i++) {//아우터 for문
    	  //System.out.println("아우터 for문");
    	  for(int j=0; j<3; j++) {//이너 for문
    		  //System.out.println("이너 for문");
      }   	  
      }	
      //아우터 for문이 먼저 실행 -> 이너 for문 모두실행 ->아우터 for문 실행...
      for(int i=2; i<=9; i++) {
    	  for(int j=1; j<=9; j++) {
		System.out.println(i+"*"+j+"="+i*j);
    	  }
    	  
      }
      //직사각형 출력(이중 for 문)
//      int a=5; //가로길이
//      int b=3; //세로길이
//      for(int i=0; i<b; i++) {
//    	  for (int j=0; j<a; j++) {
//    		  System.out.print("*");
//      }
//    	  System.out.println();//단순 공백 출력
//      }	
//		
      //문제9
     
    
      for(int i=0; i<5; i++) {
    	  for (int j=0; j<=i; j++) {
    		  System.out.print("*");
    	  }  
    	  System.out.println();
      }
      
     
      //문제10
      for(int i=5; i>0; i--) {
    	  for (int j=0; j<i; j++) {
    		  System.out.print("*");
    	  }  
    	  System.out.println();
      }
    		 
      
      
      
      
      
      
      
      
      
      
	}

}
