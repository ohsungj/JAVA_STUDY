package java_study_1224;

public class 테스트 {

	public static void main(String[] args) {
		// 메소드 안에서 작성된 변수를 지역(로컬)변수(접근지정자를 선언할 수 없음)
		String 계좌번호 = "174509";
		BasicAccount account1 = new BasicAccount(계좌번호);

		// System.out.println("계좌번호:"+account1.accountNumber);//private 이기때문에 접근못함

		// private 필드변수를 호출하는 메소드를 getter 함수라고 한다
		double 잔액 = account1.getBalance();
		String 계좌번호출력 = account1.getAccountNumber();
		System.out.println("잔액" + 잔액);
		System.out.println("계좌번호출력:" + 계좌번호출력);

		account1.deposit(5000);// 5천원 입금
		잔액 = account1.getBalance();// 잔액 getter 메소드 재호출
		System.out.println("잔액" + 잔액);

		account1.withdraw(2000); // 2천원출금
		잔액 = account1.getBalance();// 잔액 getter 메소드 재호출
		System.out.println("잔액"+잔액);
		
		String 계좌번호2 = "123123";
		BasicAccount account2 = new BasicAccount(계좌번호);
		
		account2.deposit(10000);
		잔액 = account2.getBalance();
		
		account2.withdraw(3000); 
		잔액 = account2.getBalance();
		System.out.println(잔액);
		/*
		 * account1 과 account2는 동일한 BasicAccount를 호출했지만
		 * 각각 다른값을 가진 객체이다
		 */
	}

}
