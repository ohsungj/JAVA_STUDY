package java_study_1219;

/*
 *  객체지향언어 java c++ python
 */

class A {
	/*
	 * 1.필드변수
	 * 2.기본(default)생성자
	 * 3.메소드
	 */
	int x;//필드변수:클래스 안에 작성된 모든 메소드에서 필드변수를 사용할수있음 
	
	public A() {//생략된 기본생성자
		/*
		 * 생성자 이름이 클래스 이름과 동일
		 * 리턴타입이 없다
		 */
		
	}
	/*
	 * 리턴타입이 int인 메소드 getNum
	 * 파라미터로 int x와 int y를 받는다
	 */
	
public A(int x) {//파라미터값이 존재하는 생성자
	//오버로딩으로 메소드(생성자) 이름중복사용
	this.x=x;//파라미터로 받은값을 필드변수 x에 대입
}
	
public int getNUM(int x, int y) {
	return x+y;
}

/*
 * 리턴타입이 String []인 메소드 getArr
 * 파라미터로 String[]를 받습니다
 * 리턴은 문자열 배열로 합니다
 */

public String[] getArr(String[]array) {
	return array;
}

}
public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
