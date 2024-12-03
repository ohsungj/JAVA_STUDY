package java_study_1126;

import java.util.Random;

public class 문제 {

	public static void main(String[] args) {
	//10개의 정수를 저장하는 배열을 선언하고 1부터 10까지의 값으로 초기화한 후,
   //2번째 인덱스와 5번째 인덱스를 곱한 값을 출력하시오.
		int[] array = {1,2,3,4,5,6,7,8,9,10}; 
		int mul = array[2] * array[5];
		System.out.println(mul);
		
// 1번 문항 이어서
//배열에 저장된 값을 모두 더하는 프로그램을 작성하세요.
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			sum=sum+array[i];
		}
		System.out.println("총합 : "+sum);
// 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후, 배
// 열의 요소들 중 짝수만 출력하는 프로그램을 작성하세요.
		int []numbers=new int[10];   		
		 Random random = new Random();
		 for(int i=0; i<10; i++) {
	    	 numbers[i]= random.nextInt(100)+1;
	    	 System.out.println("랜덤값 : " + numbers[i]);
			 if(numbers[i]%2 == 0) {
				 System.out.println("짝수 : "+numbers[i]);
			 }
		 }
	       // 4번)
         //크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
         //최댓값을 구하는 프로그램을 작성하세요.
		 int []array3=new int[10];
		 for(int i=0; i<array3.length; i++) {
	    	 array3[i]= random.nextInt(100)+1;	    	 
		 }//최댓값 구하기
        int max=0;
        for(int i=0; i<array3.length; i++) {
        	if(max <array3[i]) {//max가 배열값보사 작다면
        		max=array3[i];//최댓값변수에 값대입
        		
        	}
        }
        System.out.println("최댓값:"+max);
        
        
	}

}
