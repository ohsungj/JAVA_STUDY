package java_study_1219;


interface MusicPlayer{// 음악플레이어 인터페이스 정의
	/*
	 * 인터페이스에는 메소드 구현만 가능
	 */
	public void play();
	public void pause();
	public void stop();
	public void next();
	public void previous();
	
}

interface XX{
	
}
//핸드폰플레이어 클래스 생성
class SmartphonePlayer implements MusicPlayer,XX{//인터페이스는 콤마로 구분해서 여러개 구현가능

	/*
	 * 인터페이스의 주요특징
	 * 1.계약:인터페이스는 클래스가 특정 메소드를 반드시 구현하도록 강제
	 * 2.다중 구현:자바 클래스는 여러 인터페이스를 동시에 구현할 수 있다
	 * 3.추상화: 인터페이스는 메소드의 선언만을 포함하며 구현은 포함하지 않습니다
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("smartphone: playing music");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("smartphone: pausing music");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("smartphone: stoping music");
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		System.out.println("smartphone: playing next music");
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		System.out.println("smartphone: playing previous music");
	}
	//musicplayrt 인터페이스 구현
}

//자바의 모든클래스는 기본으로 Object 라는 최상위 클래스를 상속받는다
class DD extends Object{
	
}
public class 수업2 {

	public static void main(String[] args) {
		
		SmartphonePlayer phone = new SmartphonePlayer();
		phone.play();
		phone.pause();
		phone.previous();

	}

}
