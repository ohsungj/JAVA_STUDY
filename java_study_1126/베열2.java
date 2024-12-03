package java_study_1126;

import java.util.Random;

public class 베열2 {

	public static void main(String[] args) {
	//자바에서 배열을 만드는 방법은 2가지
    //첫번째 ->값이 처음부터 들어있음
		int[]array= {2,3};
	//두번째
		int[]array2= new int[2];
        System.out.println("배열길이는:"+array2.length);
        
        //값넣기
        array2[0]=10;
        array2[1]=20;
        //array2[2]=20;//배열길이는 2인데 3번째에 20을 넣으니 에러발생
        //System.ou
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        
        //배열에 랜덤한 값 넣기
        int []numbers=new int[10];//10개의 공간을 가진 배열생성
        //1~100 까지 랜덤값을 배열에 차례대로 넣을 예정
        //자바는 랜덤값을 random 이라는 클래스 사용
        Random random = new Random();
        numbers[0] =random.nextInt(100)+1;// 1부터 100까지의 랜덤값을 0번째 인덱스에 대입함
        System.out.println("0번째 인덱스값은:"+numbers[0]);
        
        //0번째~9번째 인덱스에 랜덤값 넣기
      for(int i=0; i<10; i++) {
    	  numbers[i]=random.nextInt(100)+1;//+1은 미국식이라 0부터시작해서
    	  System.out.println("값:"+numbers[i]);
    	  
    	  
      }
    	  
        
        
        
	}

}
