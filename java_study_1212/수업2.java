package java_study_1212;

class person{
	//필드변수
	String name;
	int age;
	
	person(String name , int age){//생성자:클래스가 생성될 때 (new 불러올때) 초기화를 위해 실행되는 특별한 메소드
		/*
		 * 생성자 특징
		 * 1.생성자 이름과 클래스 이름은 동일해야한다
		 * 2.생성자는 리턴타입이 없는 메소드 입니다
		 * 3.생성자는 파라미터 타입만 있고, 기본(default)생성자는 아무것도 받지 않는다
		 */
		
		/*
		 * 생성자 파라미터의 역활:받은 값을 필드변수에 대입
		 */
		
		this.name=name;
		this.age=age;//필드변수 앞에 this 를 붙인다
	}
	//void:리턴타입이 없는 메소드 celebrateBirthday 생성
	public void celebrateBirthday(String name) {
		++age;
		//메소드에서 필드변수 접근가능
	}
}

public class 수업2 {

	public static void main(String[] args) {
		
        person p =new person("김철수",20);//person 클래스 불러오기
        p.name="김철수";
        p.age=20;
        System.out.println("이름:"+p.name);//필드변수 출력
        System.out.println("나이:"+p.age);
        p.celebrateBirthday("김철수");//메소드 호출
        //파라미터에 값이 있다면 메소드를 호출할때 값을 무조건 넣어줘야한다
        System.out.println("나이:"+p.age);
        
        person p2 = new person("홍길동",30);//생성자로 필드변수 초기화하기
        System.out.println("이름:"+p2.name);
        System.out.println("나이:"+p2.age);
       
int x=10;
System.out.println(x);
        
		
		
		
	}

}
