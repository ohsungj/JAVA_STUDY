package java_study_1122;

public class 수업 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {// for문시작
System.out.println("hello world!");
		}//for문종료
		
		//"안녕하세요" 20번출력하기
		for(int h=0; h<20; h++) {
			System.out.println("안녕하세요");
		}
		
		for(int i=0; i<9; i++) {
			System.out.println("i:"+i);
		}
		
		/*for문
		 * 1. for문 실행순서 초기식-조건식-코드실행-증감식
		 * 2. 조건식이 만족할때까지 반복
		 *///
		 
		//1~10까지 총합 구하기 >범위가 정해졌으니 for문
		int sum=0;
		for(int i=1; i<=10; i++) {//i가 10까지 동작하는 for문
			sum=sum+i;
						//System.out.println(i);
		}
		System.out.println("1부터 10까지 총합은+"+sum);

		//1부터 20까지 숫자중 짝수만 출력하기
		for(int i=1; i<=20; i++)
		//for 문안에 if else switch 구현 가능
			if (i%2==0) {//1씩 증가하는 i를 2로나눠서 나머지값이 0인지확인
		System.out.println(i+"는 짝수입니다");
			}
		//1부터 30까지 숫자중 5의배수만 출력하기
		for(int i=1; i<=30; i++) {
			if(i%5==0) 
				System.out.println(i+"는 5의 배수입니다");
		}
		
		//brak문
		for(int i=1; i<=5; i++) {
			if(i==2) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
		}
			int 구구단 =2;
			for(int i=1; i<=9; i++) {
				System.out.println(구구단+"*"+i+"="+구구단*i);		
			}
			
			//while문
			//조건이 참인동안 코드블록을 반복적으로 실행하는 반복문
			int i=1;//초기식
			
			while(i<=5) {//while문 시작 //조건식
				System.out.println("while문 i:"+i);
				i++;//코드구현+증감식
			}//while문 종료
		
		//커피자판기예제
		int coffee=10; //커피10잔
			while(coffee > 0) {
				System.out.println("커피를 판매합니다. 남은커피:"+coffee);
				coffee--;
				if (coffee==0) {
					System.out.println("커피가 다 떨어졌습니다");
					break;
					
				}
			}
	
	}
}
