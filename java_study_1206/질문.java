package java_study_1206;

public class 질문 {

	public static void main(String[] args) {
		//문제22  //그리드 알고리즘
		int hp=24;//여치 hp
		int count2=0;

		count2+=hp/5;// 장군개미
		hp%=5;

		count2+=hp/3;//병정개미
		hp%=3;

		count2+=hp;
		System.out.println(count2);

		 int chicken=23; //1081마리 주문
		 int chickencount=0; //서비스로 먹을수있는 치킨수
		 while(chicken>=10) {
			 int x=chicken%10;//나머지값을 x에대입
			 chickencount+=chicken/10;
  			 chicken=x+chicken/10;
		 }
		System.out.println("최대 서비스 치킨수:"+chickencount);	

		

	}

}
