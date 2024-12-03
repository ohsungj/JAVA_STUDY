package java_study_1128;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제1
		System.out.println("문자열을 입력하세요");
		String 문제1 = scan.next();
		System.out.println("문자열 길이:" + 문제1.length());

		// 문제2 3

		// 문제3 1

		// 문제4
		String text = "Hello World!";
		System.out.println(text.toUpperCase());

		// 문제5
		System.out.println("문자열 1을 입력하세요");
		String 문제5 = scan.next();
		System.out.println("문자열 2을 입력하세요");
		String 문제55 = scan.next();
		if (문제5.equals(문제55)) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다");
		}

		// 문제6
		System.out.println("문자열을 입력하세요");
		String 문제6 = scan.next();
		System.out.println(문제6.substring(0, 1));

		int max = 0;
		for (int i = 0; i <= 문제6.length(); i++)
			;
		if (max < 문제6.length())
			max = 문제6.length();
		System.out.println(문제6.substring(max - 1, max));
		// System.out.println(문제6.substring(문제6.length()-1, 문제6.length()));

		// 문제7
		System.out.println("문자열을 입력하세요");
		String 문제7 = scan.next();
		System.out.println("정수를 입력하세요");
		int 문제77 = scan.nextInt();
		System.out.println(문제7.substring(0, 문제77));

		// 문제8
		String word = "aabbacccaaaaa";
		String[] array = word.split("");
		int count = 0;
		for (int i = 0; i <= array[i].length(); i++) {
			if (array[i].equals("a"
					+ "")) {
				++count;
			}
		}
		System.out.println("a의 갯수는" + count);

		String a = array[0];
		System.out.println(a);

		for (String i : array) {
			// 배열의 길이만큼 자동으로 반복 (for-each)문
			// i에 자동으로 배열값이 대입됨
		}

		// 문제9
		String email = "user@gmail.com";
		String[] result = email.split("@");
		System.out.println(result[1]);

		// 문제10
		String[] strArr = { "and", "notad", "abcd" };
		for (String i : strArr) {
			if (!i.contains("ad")) {
				System.out.println(i);
			}
		}

		// 문제11
		String my_string = "nice to meet ypu";
		String[] vow = { "a", "e", "i", "o", "u" };
		for (String i : vow) {
			my_string.replaceAll(i, "");
		}
		System.out.println(my_string);

		// 문제12
		String numbers = "onefourzreosixseven";
		String[] matchnumbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < matchnumbers.length; i++) {
			numbers = numbers.replaceAll(matchnumbers[i], Integer.toString(i));

		}
		System.out.println(numbers);
	}

}
