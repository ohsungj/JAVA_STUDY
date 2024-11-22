package java_study_1121;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
	    //문제1:2
		//문제2:1
		//문제3
		Scanner scan = new Scanner(System.in);	
//		System.out.println("첫번째 정수를 입력하세요:");
//		int a = scan.nextInt();
//		System.out.println("두번째 정수를 입력하세요:");
//		int b = scan.nextInt();
//		
//		if(a>b) {
//			System.out.println("a");
//		}
//		if(a<b) {
//			System.out.println("b");
//		}
//		
//		//문제4
//		System.out.println("나이를 입력해주세요:");
//		int 나이=scan.nextInt();
//		if (나이>19) {
//			System.out.println("성인입니다");
//		}
//		else {
//			System.out.println("미성년자입니다");
//		}
//		
//		//문제5
//		System.out.println("숫자를 입력해주세요:");
//		int 문제5=scan.nextInt();
//		if (문제5%5==0){
//			System.out.println("5의 배수");
//		}
//		else {
//			System.out.println("5의 배수 아님");
//		}
//		
//		//문제6
//		System.out.println("숫자를 입력해주세요");
//		int 문제6=scan.nextInt();
//		if (문제6%2==0){
//			System.out.println("짝수");
//		}
//		else {
//			System.out.println("홀수");
//		}
//		
//		//문제7
//		System.out.println("숫자를 입력해주세요");
//		int 문제7=scan.nextInt();
//		if (문제7%3==0) {
//			System.out.println("3의배수");			
//		}
//		if (문제7%5==0) {
//			System.out.println("5의배수");	
//		}
//		if (문제7%15==0) {
//			System.out.println("3과 5의배수");	
//		} 
//		else {
//			System.out.println("해당사항 없음");
//		}
		
		//문제8
//		System.out.println("국어점수를 입력하세요");
//		int 국어=scan.nextInt();
//		System.out.println("수학점수를 입력하세요");
//		int 수학=scan.nextInt();
//		System.out.println("영어점수를 입력하세요");
//		int 영어=scan.nextInt();
//		
//		int avg =(국어+수학+영어)/3;
//		 if (avg>=90) {
//			System.out.println("A");
//		}
//		else if (avg>=80 && avg<90) {
//			System.out.println("B");
//		}
//		else if (avg>=70 && avg<80) {
//			System.out.println("C");
//		}
//		else if (avg>=60 && avg<70) {
//			System.out.println("D");
//		}
//		else {
//			System.out.println("F");
//		}
//			
		//문제9
//		System.out.println("정수를 입력하세요");
//		 int 문제nine=scan.nextInt();
//		 System.out.println("정수를 입력하세요");
//		 int 문제9=scan.nextInt();
//		 
//		 if (문제nine<0 || 문제9<0){			 		 
//		 System.out.println("음수가 포함되어있습니다");
//		 }
//		 else {
//			 System.out.println("모두 양수입니다");
//		 }
//		 
		//문제10
//		  System.out.print("1 ~ 5 사이 번호를 입력하세요 : ");
//	      int num = scan.nextInt();
//	      
//	      switch(num) {
//	         case 1 :
//	            System.out.println("사과");
//	            break; 
//	         case 2:
//	            System.out.println("바나나");
//	            break; 
//	         case 3:
//	            System.out.println("오렌지");
//	            break; 
//	         case 4:
//	            System.out.println("포도");
//	            break; 
//	         case 5: 
//	            System.out.println("복숭아");
//	            break; 
//	      }
//		 
		//문제11
		System.out.println("피자먹을 사람은 몇명?:");
		int n = scan.nextInt();
		double 피자 = n/7;
		
		if(n%7==0 )
		{
		System.out.println(피자+"판");
		
		}else {
	    System.out.println(++피자+"판");
		
		}
		
		//문제12
		System.out.println("금액을 입력하세요:");
		int p = scan.nextInt();
		if (p>=100000 && p<299999)
		{
			System.out.println(p*0.95+"원");
		}
		else if(p>=300000 && p<499999)
		{
			System.out.println(p*0.9+"원");
			
		}
		else if (p>=500000)
		{
			System.out.println(p*0.8+"원");
		}
		else 
			System.out.println(p+"원");
				
		
		
			
			
			
			
		//문제12
			
		
		
		
		
		
		
		 
	
	}
}
