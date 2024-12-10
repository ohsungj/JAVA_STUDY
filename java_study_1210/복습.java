package java_study_1210;

public class 복습 {

	public static void main(String[] args) {
		//연산자
		/*1.대입연산자	
		 *2.사칙연산자
		 *3.증감연산자
		 */
		  int x=10;
		 x=10;
		 System.out.println(x);
		 
		 String s="123";
		 String s2="456";
		 
		 String result =s+s2;
		 System.out.println("결과"+result);
		 
		 int num=Integer.parseInt(result);//문자가 숫자로 변환
		 System.out.println(result);
		 
		 int count=0;
		 ++count;
		 count++;		
		 ++count;		 
		 System.out.println(count);
		 
		 //제어문
		 //if문
		 //switch문
		 //조건문:특정 조건을 평가하여 그 결과에 따른 다른 코드를 실행한다
		 //if (조건식){
		 //코드작성(조건이 참일때 실행할 코드)
		 //if-else문 :조건이 참일때와 거짓일때 각각 다른 코드를 실행
		 //if(조건식){
		 //}else{//조건이 거짓일때 실행할 코드
		 
		 //else-if문:여러개의 조건을 평가
		 //if(조건식1){조건식1일 참일때 실행
		 //}else if(조건식2){조건식2가 참일때 실행
		 //}else if(조건식3){조건식3가 참일때 실행
		 //else{ 모두 거짓일때 실행
		 
		 //무엇이 출력되고 그 이유는 무엇인지 작성하기
		 //true
		 boolean isdata =false;//bool타입 변수는 앞에 is 먼저 시작
		 if(!isdata) {
			 
			 System.out.println("출력a");
		 }else {
			 System.out.println("출력b");
		 }
		 
		 //두 비밀번호 비교하기
		 String password="123";
		 String repassword="456";
		 //"==":비교연산자
		 //자바에서는 문자를 비교할땐 비교연산자가 아닌 equals를 사용
		 if(password.equals(repassword)){
			 System.out.println("비밀번호가 일치합니다");
		 }
		 if(!password.equals(repassword)) {
			 System.out.println("비밀번호가 불일치합니다");
		 }
		 
		 if(10!=5) {//10하고 5가 다르다면?
			 System.out.println("A출력");
		 }else {
			 System.out.println("B출력");
		 }
		 
		 //반복문
		 /*
		  * 반복문:특정 블록의 코드를 여러번 반복해서 실행
		  * for:반복횟수가 정해져 있을 때 사용
		  * while:조건이 참인 동안 반복실행(반복횟수x)
		  * for(초기식;조건식;증감식){
		  *}
		  *while(조건식(1)){
		  *반복할코드2
		  *}
		  */
	//1부터 10까지의 숫자를 출력
		 for(int i=1; i<=10; i++) {
			 //1부터 10까지 숫자중 짝수만 출력		 
			 //System.out.println(i);
			 if(i%2==0) {
				 System.out.println("짝수"+i);
			 }			 			 
		 }
		 //배열:동일한 데이터 타입의 여러 데이터를 하나의 변수로 관리할 수 있게 해주는 자료구조
		 //같은 종류의 데이터들을 한 줄로 나열해 놓은것
		 
		 //1.배열 선언 및 초기화
		 int[]array= {1,2,3,4};//첫번째 방법
		 int[]array2=new int[4];//두번째 방법
		 //2.배열 요소(아이템)접근 및 조작
		 
		 System.out.println("0번 인덱스" + array[0]);
		 System.out.println("1번 인덱스" + array[1]);
		 System.out.println("2번 인덱스" + array[2]);
		 System.out.println("3번 인덱스" + array[3]);
		 //인덱스 번호로 배열 요소 출력 가능
         for(int i=0; i<array.length; i++) {
        	 System.out.println(i+"번index"+array[i]);
        	 
         }
		 //배열 요소 값 변경하기
         System.out.println("2번 인덱스" + array[2]);
		 array[2]=50;//2번째 요소에 50값 대입 (기존값은 없어짐)
		 System.out.println("2번 인덱스" + array[2]);
		 
		 //score보다 점수 높은사람 카운트 하기
		int []score= {50,80,100,100,90};//점수 배열
		int myScore=77;
		int count2=0;		
		for(int i=0; i<score.length; i++) {
			int temp=score[i];
 			System.out.println("배열에서 사져온 점수:"+temp);
			if(temp>myScore) {
				++count2;
			}
			
		}
		 System.out.println(count2);
 		 
		 // 배열에서 최대값 찾기
		 int []numbers= {12,45,7,23,56,89,34};
		 int max=0;
		 for(int i=0; i<numbers.length; i++) {//배열 길이만큼 반복
 			 int temp=numbers[i];//요소를  temp변수에 대입
			 if(temp>max) {
				 max=temp;
			 }
		 }
		 System.out.println(" 가장 큰 값은:"+max);
		 
		 //같이 풀기 닉네임 중복체크하기
		 String []nickName= {"사과","바나나","오렌지","포도","키위"};
		 String userNickName="사과";
		 //닉네임 배열에 입력받은 닉네임이 있다면 닉네임이 중복됩니다 라는 메세지 출력
		 boolean isFlag=false;//플래그:0아니면1을 의미함
		 for(int i=0; i<nickName.length; i++) {
			 String temp=nickName[i];//배열 요소 temp에 대입
			 if(nickName[i].equals(userNickName)) {//동일하다면?
				 isFlag=true;
				 System.out.println("닉네임이 중복됩니다");
			 }
		 }
		
		 
		 //배열의 모든 요소희 합 구하기(for-each 로 풀기)
		 int[]numbers2= {5,10,15,20,25};
		 int sum=0;
		 for(int i:numbers2) {
			 System.out.println("배열요소 출력:"+i);
			 sum+=i;
		 }

		System.out.println(sum);
	}	
}
