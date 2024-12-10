package java_study_1205;

import java.util.Random;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// 문제1 3
		// 문제2
//		String x = "10";
//		int y= Integer.parseInt(x);
		// 문제3 3
		// 문제4
//		for(int i=0; i<=100; i++) {
//			if(i%2==0) {
//				System.out.println("짝수");				
//			}
//			else {
//				System.out.println("홀수");
//			}
//		}
		// 문제5 false
//		boolean 면허증소지=true;
//		boolean 운전가능 =!면허증소지;
		// System.out.println(운전가능);

		// 문제6
//		int 문제6=0;
//		for(int i=0; i<=100; i++) {
//			if(i%3==0) {
//				문제6+=i;				
//			}
//				
//		}System.out.println(문제6);

		// 문제7
//		System.out.println("인원수를 입력하세요");
		Scanner scan = new Scanner(System.in);
//		int 문제7=scan.nextInt();
//		int pizza=0;		
//		if(문제7%7==0) {
//			pizza=문제7/7;
//		}
//		else {
//			pizza=문제7/7+1;			
//		}
//		System.out.println(pizza);

		// 문제8
//		System.out.println("정수를 입력하세요");
//		int 문제8=scan.nextInt();
//		int 문제8답=1;
//		for(int i=1; i<=문제8; i++) {			
//			문제8답*=i;			
//		}
//		System.out.println(문제8답);

		// 문제9
//		for(int i=2; i<=5; i++) {
//			for(int j=1; j<=9; j++) {		
//		System.out.println("i"+"x"+"j"+"="+i*j);
//			}
//		}
//	
		// 문제10
//		 for(int i=5; i>0; i--) {
//	    	  for (int j=0; j<i; j++) {
//	    		  System.out.print("*");
//	    	  }  
//	    	  System.out.println();
//	      }

		// 문제11
//		System.out.println("문자열을 입력해주세요");
//		String 문제11 = scan.next();
//		System.out.println("문자열 길이:" + 문제11.length());
//		if(문제11.length()>+11) {
//			System.out.println("아이디는 10글자 이하로작성");
//		}
//		
		// 문제12 4

		// 문제13
//		int[]array=new int[10];
		Random random = new Random();
//		 for(int i=0; i<array.length; i++) {
//	    	 array[i]= random.nextInt(100)+1;	    	 
//		 }
//        int max=0;
//        for(int i=0; i<array.length; i++) {
//        	if(max <array[i]) {
//        		max=array[i];
//        	}
//        }System.out.println(max);

		// 문제14
//		int sum=0;
//		int avg=0;
//		int[]array=new int[10];
//		for (int i=0; i<array.length; i++) {
//			array[i]= random.nextInt(100)+1;
//			sum=sum+array[i];
//			avg=sum/10;					
//		}
//		System.out.println("총합 : "+sum);
//		System.out.println("평균:" +avg );

		// 문제15
//		String word = "Java Programming";
//		String[] array = word.split("");
//		int count = 0;
//		for (String i : array) {
//			if (i.equals("a")) {
//				count++;
//			}
//		}		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//			if (array[i].equals("a")) {
//				count++;
//			}
//		}
//		System.out.println("a의 갯수는" + count);
		
		//문제16
//		int 아아=5500;
//		int money=15000;
//		int 최대잔수=0;
//		int 남는돈=0;
//		최대잔수=money/아아;
//		남는돈=money-(아아*최대잔수);
		
		//문제17
//		int count=0;
//		int[]array= {149,180,192,170};
//		int height=167;
//		for (int i : array) {
//			if(i>height) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		//문제18
		int code=4;
		String answer="";//최종결과
	 String chiper="dfjardstddetckdaccccdegk";	
	 for(int i=0; i<chiper.length(); i++) {//문자길이만큼 반복문 돌리기
		 if((i+1)% code ==0) {
			 answer+=chiper.substring(i,i+1);		 
		 }
	 }
	 System.out.println("해독한 단어는:"+answer);
	 
	 //문제19
	 String phone_number="0171238888";
	 int temp =phone_number.length()-4;//4자리를 제외한
	 String star="";
	 for (int i=0; i<temp; i++) {
		 star+="*";
	 }
	 String lastnumber=phone_number.substring(temp);//temp 부터 마지막까지
	 System.out.println("lastnumber:"+lastnumber);
	 phone_number=star+lastnumber;
	 System.out.println("phonenumber:"+phone_number);
	 
	 //2번째 방법 split
	 String[] phone=phone_number.split("");//split으로 한글자 한글자 배열에담기
	 String result2="";//결과
	 for(int i=0; i<phone.length; i++) {//배열길이만큼 반복
		 if(i<(phone_number.length()-4)) {
			 result2+="*";
		 }else {
			 result2+=phone[i];
		 }
	 }
	 System.out.println(result2);
	 
	//20번 치킨
	 int chicken=1081; //1081마리 주문
	 int chickencount=0; //먹을수있는 치킨수
	 while(chicken>=10) {
		 int coupon=chicken%10;//나머지값을 쿠폰에대입
		 chickencount+=chicken/10;
		 chicken=coupon+chicken/10;
	 }
	System.out.println("최대 서비스 치킨수:"+chickencount);
	
	//21번
	String my_string = "people"; //p와  e가 중복됨
	String[] strArray=my_string.split("");
	String result3="";
	for(int i=0; i<strArray.length; i++) {
		if(!result3.contains(strArray[i])) {
			result3+=strArray[i];
		}
	}
System.out.println("정답:"+result3);

//문제22  //그리드 알고리즘
int hp=24;//여치 hp
int count2=0;

count2+=hp/5;// 장군개미
hp%=5;

count2+=hp/3;//병정개미
hp%=3;

count2+=hp;
System.out.println(count2);

	}

}
