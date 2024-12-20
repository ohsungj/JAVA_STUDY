package java_study_1220;

class B extends Object{
	//1.필드변수:클래스 내에 모든 메소드에 접근 가능
	int x;
	public B() {//default 생성자
		/*
		 * 생성자 특징
		 * 1.리턴타입 없음
		 * 2.메소드이름과 클래스이름이 동일
		 */
		
	}
	//오버로딩:메소드 이름은 동일하나 파라미터값이 다를때 
	public B(int x) {//파라미터 값이 존재한 생성자
		 this.x=x;//this를 이용해서 파라미터값을 필드변수 x에 대입
	}
	
	public void showMessage() {
		System.out.println("안녕하세요 저는 b클래스 입니다.");
	}
}
//extends:상속
//자바는 이중상속 불가 > interface
//implements:구현하다 a클래스는 c클래스를 구현하다
class A extends B implements C{
	//a클래스는 자식클래스 b클래스는 부모클래스
	/*
	 * a클래스는 b클래스에 선언된 메소드와 필드변수를 사용할 수있음
	 * 단, 접근지정자가 public 혹은 protected로 되어있어야함
	 */
	@Override
	public void showMessage() {//부모클래스 메소드 재정의
	   System.out.println("저는 A클래스 입니다");
		
	}

	@Override
	public void showMessage2() {
		/*
		 * 인터페이스에 정의된 메소드를 강제로 구현해야하는 특징을 가지고 있음(계약관계)
		 */
		System.out.println("인터페이스 메소드 재정의 하기");
	}
}

interface C{
	/*
	 *  인터페이스는 메소드 선언만 가능 구현은 불가능
	 */
	public void showMessage2(); 
}
public class 복습 {

	public static void main(String[] args) {
		A a = new A();//A클래스 호출(A클래스 객체 생성)
		//A클래스는 부모의 필드변수와 메소드를 사용할 수 있음
		a.showMessage();
		a.x=10;
		

	}

}
