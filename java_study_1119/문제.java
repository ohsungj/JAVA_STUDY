package java_study_1119;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//문제1=12000
	int 용돈 = 10000;
	용돈 -=3000; //간식구매
	용돈 +=5000; //심부름 보상
	System.out.println("최종 용돈의 값은:"+용돈);
	
	//문제2=170
	int 점수 =80;
	점수 +=5; //보너스 점수
	점수 *=2; //더블 점수 이벤트
	System.out.println("최종 점수의 값은:"+점수);
	
	//문제3=true
	int 나이=20;
	boolean 면허증소지=true;
	boolean 운전가능=(나이>=18)&&면허증소지;
	System.out.println("운전가능:"+운전가능);
	
	//문제4=false
	boolean 면허증소지1= true;
	boolean 운전가능1 =!면허증소지1;
	System.out.println("운전가능:"+운전가능1);
	
	//문제5=50
	int a=10;
	int b=5;
	int mul=a*b;
			System.out.println("두 정수의 곱:"+mul);
			
    //문제6 정답 : false
    boolean p=true;
    boolean q=false;
    boolean result1 = p&&q;
    System.out.println("p&&q:"+ result1);
    
    //문제7=78.5
    final double PI =3.14;
    double radius =5.0;//원의 반지름
    double 원의면적 =(PI*radius*radius);
    System.out.println("원의면적:"+원의면적);
    
    //문제8=70.5
    double weight=70.5;
    double height=1.77;
    double bmi=(weight/height*height);
    System.out.println("bmi 수치는:"+bmi);
    
    //문제9=3
    int 대기번호 = 1;
    System.out.println("다음 번호:"+대기번호++);
    System.out.println("다음 번호:"+대기번호++);
    System.out.println("최종대기번호는:"+대기번호);
    
    //문제10=1992
    int age = 32;
    int year=2024;
    int result=0;
    
    int 출생연도=year-age;
    System.out.println("출생 년도는:"+출생연도);
    
    //문제11
    int obak=500; //500원
    int bak=100; //100원
    int change=0; //남은돈 (왜있는지모루겟)
    System.out.println("거스름돈을 입력하세요:");
    int mymoney = scan.nextInt();
    int div=mymoney/obak;
    int div2=mymoney%obak;
    int div3=div2/bak;
    
    System.out.println("오백원:"+div+"개");
    		
    System.out.println("백원:"+ div3+"개");
    
    
    
   
    		
    		
	
	
	

	}

}
