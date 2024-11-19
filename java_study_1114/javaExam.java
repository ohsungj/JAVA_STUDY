package java_study_1114;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//문제1 
		int age = 25;
		//문제2 3
		//문제3
		System.out.println("Hello, Java!");
		//문제4
		//int sum=a+b;
		//문제5
		double height= 180.5; 
	    //문제6
		System.out.println("이름을 입력해주세요");
		String name=scan.next();
		System.out.println("나이를 입력해주세요");
		int age2 =scan.nextInt();
		System.out.println("안녕하세요"+name+"님 당신의 나이는"+age2+"살 입니다");
		//문제7
	    int a= 100;
	    double b = 100.1;
	    char c = 'c';
	    boolean d = true;
	    //문제8
	    System.out.println("1번째 정수를 입력해주세요:");
	    int e=scan.nextInt();
	    System.out.println("2번째 정수를 입력해주세요:");
		int f=scan.nextInt();
		int sum= e+f;
		System.out.println("총합 : "+sum); 
		
		//문제9
		String x = "10";
		int y= Integer.parseInt(x);
		//문제10 3
		//문제11
				
		System.out.println("숫자를 입력하세요");
	    int x1=scan.nextInt();
	    System.out.println("숫자를 입력하세요");
	    int x2=scan.nextInt();
	    System.out.println("숫자를 입력하세요");
	    int x3=scan.nextInt();
	    
	    int avg= (x1+x2+x3)/3;
	   System.out.println("입력받은 숫자의 평균은"+avg+"입니다");
	
	   //문제12
	  System.out.println("숫자를 입력하세요");
	   
	
	
	
	
	}

}
