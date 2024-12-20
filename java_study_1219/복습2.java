package java_study_1219;

/*
 * 상속(다형성)
 * 
 */

class X {
	
	int money;
	public X() {
		
	}
	public X(int money) {
		this.money=money;
	}
	public void showMeTheMoney() {
		System.out.println("my money:" + this.money + "$");
	}
}

//extends:상속하다
//자바는 다중상속이 불가능
class Y extends X {// y클래스가 x클래스를 상속받다
	// y클래스는 x클래스의 필드변수와 메소드를 사용할 수 있다
	int myMoney = 1000;
	
	//부모클래스에서 기본생성자를 수정했다면 자식클래스 생성자에서 부모클래스 생성자를 무조건 호출해야함
	public Y() {
		super();//public X(int money) {}
	}
	
	/*
	 * int 를 리턴하는 getMyMoney 메소드
	 */
	public int getMyMoney() {
		return this.myMoney;
	}
	@Override // 부모클래스에 정의된 메소드 재정의(오버라이딩)
	public void showMeTheMoney() {
		System.out.println("my(Y) money:" + 100000 + "$");
	}

	public void showMessage() {
		System.out.println("안녕하세요 y입니다");
	}
}

class B {
	public void showMeTheMoney() {
		System.out.println("my(Y) money:" + 100000000 + "$");
	
}
}
public class 복습2 {

	public static void main(String[] args) {

		X x = new X(20000);// x 클래스 호출 (객체생성 or 인스턴스화)
		x.showMeTheMoney();
		// x는 showMessage가 없음
		// 부모클래스는 자식클래스의 메소드와 필드변수를 사용할 수 없음

		Y y = new Y();// y클래스 호출
		y.showMeTheMoney();// x클래스에서 정의된 메소드 사용
		
		int result =y.getMyMoney();//리턴 타입이있는 메소드 호출
		//result라는 변수에 getMyMoney 최종값을 리턴받음
		System.out.println("result:"+result);
	}

}
