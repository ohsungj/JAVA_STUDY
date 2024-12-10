package java_study_1205;

public class 복습 {

	public static void main(String[] args) {
		//사칙연산 거스름돈

				//남은돈
		//결과>오만원 1장 만원2장 천원4장 5백원1개 100원4개
		
		int money=74900;
		int 오만원=50000;
		int 만원=10000;
		int 천원=1000;
		int 오백원=500;
		int 백원=100;
		int 오만원갯수=money/오만원;
		money=money%오만원;
		int 만원갯수=money/만원;
		money=money%만원;
		int 천원갯수=money/천원;
		money=money%천원;
		int 오백원갯수=money/오백원;
		money=money%오백원;
		int 백원갯수=money/백원;
		money=money%백원;
		System.out.println("오만원:"+오만원갯수);
		System.out.println("만원:"+만원갯수);
		System.out.println("천원:"+천원갯수);
		System.out.println("오백원:"+오백원갯수);
		System.out.println("백원:"+백원갯수);
		
		//그리드 알고리즘
		//선택의 순간마다 당장 눈앞에 보이는 최적의 상황만을 쫒아 최종답에 도달하는 방법

		//상수 :변경 불가능
		//프로그래밍에서 상수표현은 데이터타입앞에 final 키워드가 온다
		//상수 표현할땐 변수이름을 대문자로 적는다(개발자 약속)
		
		
		//원의 반지름이 주어졌을때 원의 면적을 계산하는 프로그램을 작성하세요
		//double radius=5.0;//원의 반지름
		//원의 면적은 PI*반지름*반지름
		final double PI=3.14;
		double radius=5.0;
		double 면적=PI*radius*radius;
		
		//직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수c가 
		//변수로 주어질때 다른 한변의 길이의 제곱  b를 출력하세요
		int a=3;
		int c=5;
		int b=0;		
		int 에이의제곱=a*a;		
		int 씨의제곱=c*c;
		int 비의제곱=씨의제곱-에이의제곱;
		System.out.println(비의제곱);
		
		int array[]= {1,3,5};
		System.out.println(array[0]);
		System.out.println(array[array.length-1]);
		
		//1번 인덱스값과 2번인덱스값 서로 교환하기
		int temp =array[1];//temp라는 임시공간에 3대입
		array[1]=array[2];//1번 인덱스에 5대입
		array[2]=temp; //2번 인덱스에 3대입
		//swap
		//배열문제가 나오면 무조건 for 문
		
		for(int i:array) {//foreach 문 배열길이만큼 자동으로 반복
			System.out.println("i:"+i);
		}
		
		
		
		
}
}
