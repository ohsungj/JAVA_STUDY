package java_study_1203;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// 1.1부터 100까지 숫자 중 짝수만 출력
		// 범위=>반복문
		// 반복뭉 종류1.for 2.while 3.do-while

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수는" + i);
			}
		}
//        //2. 1부터 10까지의 합을 구하세요
//		int count=0;
//		for(int i=1; i<=10; i++) {
//		count=count+i;	
//		}
//		System.out.println(count);	

		// 3.배열
		String[] array = { "apple", "apple", "apple", "banana" };
		int count = 0;
		for (String i : array) {
			if (i.equals("apple"))
				++count;
		}
		System.out.println(count);
		// 4
		double price = 580000;
		if (price >= 500000) {
			System.out.println(price * 0.8);
		} else if (price >= 300000) {
			System.out.println(price * 0.9);
		} else if (price >= 100000) {
			System.out.println(price * 0.95);
		} else {
			System.out.println(price);
		}

		// 5
		String my_string = "hello";
		int n = 3;
		String result = "";

		for (int i = 0; i < my_string.length(); i++) {
			String word = my_string.substring(i, i + 1);
			for (int j = 0; j < n; j++) {
				result += word;
			}
		}
		System.out.println(result);

		// repeat
		String s = "hello";
		System.out.println(s.repeat(3));

		String strarray[] = my_string.split("");
		String result2 = "";
		for (String i : strarray) {
			result2 += i.repeat(n);
		}
		System.out.println(result2);

		// 배열 짝수 홀수 갯수 구하기
		// 정수형 배열 num_list 가 주어질때 num_list의 원소 중 짝수와 홀수의 개수를
		// 담은 정수형 배열 answer_list 완성하기

		int[] num_list = { 1, 3, 5, 7 };
		int[] answer_list = new int[2];

		int 짝수 = 0;
		int 홀수 = 0;

		for (int i = 0; i <= num_list.length; i++) {
			if (i % 2 == 0) {
				짝수++;
			} else {
				홀수++;
			}
		}
		Scanner Scan = new Scanner(System.in);
		System.out.println("양꼬치갯수");
		int n1 = Scan.nextInt();
		System.out.println("음료수 갯수");
		int k1 = Scan.nextInt();

		int r = 0;
		int ship = 12000;
		int juice = 2000;

		if (n1 % 10 == 0)
			;
		r = ship * n1 - (juice * n1 / 10);

		System.out.println(r);

	}

}
