package java_study_1122;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
	
		//문제11
		//길동이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
        //피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각
        //이상 먹기 위해 필요한 피자의 수를 출력하세요.

		int n = 15;//인원
		int slice =7; //7조각
		int pizzaCount =0; //피자수
		pizzaCount = n/slice;//나머지값이 존재함
		System.out.println("pizza count:"+pizzaCount);
		
		if(n%slice!=0); //나머지값이 존재한다면 if 실행
		++pizzaCount;
		System.out.println("pizza count:"+pizzaCount);
		
		//문제12
		 /*
	        * 길동이네 옷가게는 
	        * 10만 원 이상 사면 5%
	        * 30만 원 이상 사면 10%,
	         50만 원 이상 사면 20%
	         를 할인해줍니다.
	         구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 출력하세요.
	        */
	       Scanner scan = new Scanner(System.in);
	       System.out.print("금액을 입력하세요 : ");
	       int price = scan.nextInt();
	       /*
	        * 다중 if : 만족하는 조건만 실행 후 종료
	        */
	       if(price >= 500000) {
	          price *= 0.8; // 20% 할인
	       }else if(price >= 300000) {
	          price *= 0.9; // 10% 할인
	       }else if(price >= 100000) {
	          price *= 0.95;// 5% 할인
	       }
	       System.out.println("price : " + price);
	       
	   }
	}