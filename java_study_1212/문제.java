package java_study_1212;

import java.util.Scanner;

class Book{
	String 제목;
	String 저자;
}

class Calculator{
	int 정수;
	int 정수2;
	public int add(int 정수, int 정수2) {
		return 정수+정수2;
	}
}


public class 문제 {

	public static void main(String[] args) {
		//문제1 2
		//문제2 1		
		//문제3 2
		//문제4 2
		//문제5 1		
		//문제6 2
		//문제7 3
		//문제10 2
		//문제11 4
		//문제12 3
		//문제13 2
		
		Calculator x=new calculator();
		int result =x.add(10, 20);
	       System.out.println("결과:"+ result);
		 
		 Book s1 =new Book();
         s1.제목="어린왕자";
         s1.저자="생택쥐페리";
         System.out.println("제목:"+s1.제목+"저자:"+s1.저자);
         
		

         Scanner scan=new Scanner(System.in);
         System.out.println("정수배열을 입력하세요");
         int 문제9=scan.nextInt();
         for(int i=1; i<문제9.length; i++) {
        	 
         }
         
		
	}

}
