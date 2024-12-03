package java_study_1126;

public class 배열 {

	public static void main(String[] args) {
		/*배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간
		 * 배열은 0부터 시작
		 * 미국이 0부터 숫자를 세서 ㅇㅇ
		 *///
		
	int[] array = {10,20,30,40};//배열 초기화
	//array 라는 int 형 배열에 10,20,30,40 총 4개의 데이터를 저장
	System.out.println("0번째 배열값:"+array[0]);	 
	System.out.println("1번째 배열값:"+array[1]);		
		
	int sum = array[1] + array[3];
	System.out.println("총합은:"+sum);
	
	//프로그래밍에서 순서를 인덱스라고 합니다
	int[] array2 = {10,20,30,40,10,20,30,40,10,20,30,40};
	//배열에 들어있는 값이 많아질 떄는 인덱스를 번호를 이용해서 조회하는게 힘듬
	//효과적으로 가져오기위해 반복문을 사용
	//배열하고 for문은 친구
	//.length :배열길이를 나타냄
	for (int i=0; i<array2.length; i++) {
	System.out.println("배열값:"+array2[i]);		
	}
	System.out.println("배열길이는"+array2.length);

	//짝수값만 출력하기
	int[] array3= {2,3,4,5,6};
	for (int i=0; i<array3.length; i++) {//배열 길이만큼 for문 돌리기
		int num =array3[i];//배열값에 num 대입
		if(num%2==0) {
			System.out.println(num);
		}
	}
	
	//총합과 평균구하기
	int sum1=0;//총합
	double avg=0;//평균
	for (int i=0; i<array3.length; i++) {
		sum1+=array3[i];
	}
	System.out.println(sum1);
	System.out.println(sum1/array3.length);
	
	int[] array4= {1,2,3,4,5,6,7,8,9,10};
	//for문을 이용해서 array4에 있는 3의배수 총합구하기
	int sum2=0;
	for(int i=0; i<array4.length; i++) {
		int num=array4[i];
		if(array4[i]%3==0) {
			sum2=sum2+array4[i];			
		}
	}System.out.println(sum2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
