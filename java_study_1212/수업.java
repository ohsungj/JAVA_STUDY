package java_study_1212;

class  학생{
	String 이름;//필드변수(전역변수),초기화 생략가능
	int 학년;
	/*
	 * 클래스 구조(객체지향 프로그램에 있는 공통개념)
	 * 1.필드변수
	 * 2.메소드:특정 작업을 수행하는 코드의 집합
	 * >능력있는 개발자는 메소드를 여러개 만들어서 코드를 분리함
	 * 3.생성자
	 */
	
	/*
	 * 메소드 기본구조
	 * public: 접근제어자
	 * int:반환 데이터 타입(리턴값)
	 * add:메소드 이름(보통 동사로 작성)
	 * (int a,int b):인자값 or 매개변수 or 파라미터
	 * 파라미터:메소드가 작업을 수행하는데 필요한 데이터
	 * return:반환 데이터타입에 맞는 반환값(메소드의 결과를 반환)
	 */
	public int add(int a, int b) {
		return a+b;
	}
	
	public int minus(int a,int b) {
		return a-b;
	}
	//곱하는 메소드,나누기 메소드
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	//반환데이터타입(int,String,double,char,boolean...)이 string입니다
	//총9개+void 
	public String 취미를소개하다() {
		String 취미="등산";
		return 취미;//리턴타입과 반환데이터 타입은 항상 일치해야한다
	}
	
	public void 취미를소대하다2() {
		//void는 리턴없음을 의미
		System.out.println("취미는 운동입니다");
	}
}


//클래스 파일 하나에 public class 한번만 작성가능
public class 수업 {

	public static void main(String[] args) {
		/*
		 * java메모리:heap 이라는 영역에 저장(인스턴스)
		 */
		
         학생 s1 =new 학생();//new:클래스를 불러오다(클래스를 인스턴스화 하다)
         s1.이름="홍길동";//클래스를 new 불러오면 >필드변수 접근이 가능하다
         s1.학년=3;
         System.out.println("이름:"+s1.이름+"학년:"+s1.학년);
         System.out.println(s1);//heap에 저장된 위치 조회

//동일한 클래스 한번더 호출하기
       학생 s2=new 학생();
       s2.이름="김길동";
       s2.학년=1;
       System.out.println("이름:"+s2.이름+"학년:"+s2.학년);
       System.out.println(s2);
       
       s1.학년=1;//홍길동 학년수정
       System.out.println("이름:"+s1.이름+"학년:"+s1.학년);
       
       학생 s3=new 학생();
       System.out.println(s3);//새로운 heap영역에 저장
       
       int result =s3.add(10, 20);
       System.out.println("결과:"+ result);
       
       int result2 =s3.minus(30,10);
       System.out.println("결과2:"+ result2);
       
       int result3=s3.mul(2, 3);
       System.out.println("결과3:"+result3);
       
       int result4=s3.div(8, 2);
       System.out.println("결과4:"+result4);
       
       s3.취미를소대하다2();
       String 취미 =s3.취미를소개하다();
       System.out.println("취미는:"+취미);
    
 

	}

}
