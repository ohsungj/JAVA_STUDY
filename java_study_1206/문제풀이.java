package java_study_1206;

import java.util.Scanner;

public class 문제풀이 {

	public static void main(String[] args) {
	//7번
		int n=15;
	//7조각을 주는 이상한 피자가게
	//상수 변수명은 대문자로
		final int SLICE=7;
		int x=n%SLICE;
		int result =n/SLICE;
		if(x>0 ) {//못먹은사람이있다면
			++result;//증감 연산자로 한판더
		}
			//8번 팩토리얼
			//System.out.println("정수 입력받기");
			Scanner scan=new Scanner(System.in);
			int num = scan.nextInt();
			int factorial=1;
			for (int i=2; i<=num; i++) {
				factorial=factorial*i;
				
			}			
		//System.out.println(num+"!="+factorial);
			
		//10번
		for(int i=4; i>0; i--) {
			for(int j=0; j<i; j++) {
				//System.out.println("*");
			}
			//System.out.println();//개행용
		}

		//17번
		int[] array = {149, 180, 192, 170};
		int height = 167;
		int count=0;
        for(int i:array) {
        if	(height<i) {
        	++count;
        }
        }
		System.out.println(" 정답:"+count);
		
		
	}

}
