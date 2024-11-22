package java_study_1121;

import java.util.Scanner;

public class 조건문문제풀이 {

	public static void main(String[] args) {
	//1번. 3의 배수 판단
		int x = 15;
		if(x%3==0) //3으로 나눈 나머지 값이 0이라면?
			System.out.println("3의 배수입니다");			
		else 
			System.out.println("아닙니다");
		
		//if 와 else안에 코드가 한줄이면 중괄호 생략가능
		
		//문제2. 변수 y가 5의 배수인지 판단하는 프로그램 작성하기
		int y=5;
		if (y%5==0){
			System.out.println("5의 배수");
		}
		else {
			System.out.println("5의 배수 아님");
		}
		
		//문제3. 두 정수를 입력받아 큰 수 출력하기
		Scanner scan =new Scanner(System.in);
		System.out.println("a값입력");	
		int a = scan.nextInt();
		System.out.println("b값입력");
		int b = scan.nextInt();
		
		if (a>b) {
			System.out.println("a값이 더 커요");		
		}
		else if (a<b) {System.out.println("b값이 더 커요");		
		}
		else {System.out.println("값이 동일합니다");
		}
		
		//문제4. 짝수 구하기
		int 짝수 =4;
		if (짝수 %2==0) 
		{//짝수라면
			System.out.println("짝수");
		}else 
		{//짝수가 아니라면
			System.out.println("홀수");			
		}
		//문제5 홀수 구하기
		int 홀수=9;
		if(홀수 %2!=0)
			{
			System.out.println("홀수");
			}
		else {
			System.out.println("짝수");
			}
		
		//문제6 3과 5의 공배수 판단
		//공배수란 해당 숫자가 3의배수,5의 배수
		int number =15;
		if (number %3==0 && number %5==0)
				{
			System.out.println(number+"는 공배수 입니다.");
			}
		
	
		
		
		
		
		
		
		
		
		

	}

}
