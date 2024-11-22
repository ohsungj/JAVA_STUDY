package java_study_1121;

import java.util.Scanner;

public class 수업 {

	public static void main(String[] args) {
	
	//예제 =>시험 점수가 80점이 이상이면 합격 판별을 하는 프로그램을 작성하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요:");
		//자바는 한글지원 가능
		int 점수 =scan.nextInt();
		System.out.println("입력한 점수는:"+점수);
		//>= :비교 연산자
		 if(점수>=80) {// 만약에 입력받은 점수가 80이상이라면
			 //true면 if 코드가 실행됨
			 System.out.println("시험에 합격했습니다!");
		 }else {
			 //false 면 else 코드가 실행됨
			 System.out.println("시험 불합격");
		 }//else 단독적으로 사용 불가
		 //else는 if 다음에 작성할 수 있다(옵션)
		 
		 
		//중첩 if문:조건이 여러가지일 때 사용함
		 System.out.println("점수2를 입력하세요:");
		 int 점수2 =scan.nextInt();
		 //&&:and 연산자(두 조건이 모두 참일때 참)
		 if(점수2>=90&& 점수2<=100) {//점수가 90이상 100이하라면
		System.out.println("A등급");
		 }else if (점수2<90 &&점수2>=80) {//점수가 90미만 80이상이라면
			 System.out.println("B등급");			 
		 }else if (점수2<80 &&점수2>=70) {//점수가 80미만 70이상이라면
			 System.out.println("C등급");
		 }else  {
			 System.out.println("F등급");
		 }
		
		
		
		
		
		
		

	}

}
