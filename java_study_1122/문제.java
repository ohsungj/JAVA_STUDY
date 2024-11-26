package java_study_1122;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제1
//		for(int i=1; i<=10; i++) {					
//        System.out.println(i);
//		}

		// 문제2
//		for(int i=1; i<=100; i++) {
//			if (i%2==0) {
//				System.out.println(i);
//					}
//		}

		// 문제3
//		int 짝수갯수=0;			
//		for(int i=1; i<=100; i++) {		
//		if(i%2==0) {			
//			++짝수갯수;			
//		}
//		}System.out.println(짝수갯수+"개");	

		// 문제4
//		System.out.println("숫자를 입력하세요");
//		int 구구단=scan.nextInt();
//		for(int i=1; i<=10; i++) {
//			System.out.println(구구단+"*"+i+"="+구구단*i);		
//		}

		// 문제5
//		int 문제5=0;
//		for(int i=1; i<=100; i++) {
//			if(i%3==0) {
//           문제5=문제5+i;
//			}
//		}System.out.println("3의배수의합은"+문제5);

		// 문제6
//		System.out.println("숫자를 입력하세요");
//		int 문제6=scan.nextInt();
//		int factorial=1;
//		for(int i=1; i<=문제6; i++) {
//			factorial=factorial*i;
//		}
//		System.out.println("입력한 팩토리얼 값은:"+factorial);
//		
		// 문제7
//		for(int i=1; i<=100; i++) {
//			if(i%3==0 && i%5==0) {
//			System.out.println("FizzBuzz");							
//			}	
//			else if(i%3==0) {
//				System.out.println("Fizz");			
//			}
//			else if(i%5==0) {
//				System.out.println("Buzz");
//			}
//			else {
//				System.out.println(i);
//			}
//		}
		// 문제8
//		int sum=0;
//		for(int i=1; i<=10; i++) {
//			sum=sum+i;						
//		}
//		System.out.println(sum);

		// 문제11
		int n = 2; // 처음세균마리수
		int t = 10;// 경과한시간 10시간
		for (int i = 1; i <= t; i++) {
			n = n * 2;
			
		}
		System.out.println("10시간후:" + n);

		// 문제12
		int count = 0;// 몇번 반복하는지 체크하는 변수
		int n2 = 6;
		while (n2 != 1) {// n2가 1이 될떄까지 계속 반복함
			if (n2 % 2 == 0) {
				n2 = n2 / 2;
				++count;
			} else {
				n2 = n2 * 3 + 1;
				++count;
			}
		}
		System.out.println(count);

	}

}
