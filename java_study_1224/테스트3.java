package java_study_1224;

public class 테스트3 {

	public static void main(String[] args) {
		Bank bank = new Bank(); // bank 호출

		// 계좌 생성
		String 계좌번호1 = "123456";
		bank.creatAccount(계좌번호1);

		String 계좌번호2 = "777777";
		bank.creatAccount(계좌번호2);
		
		String 계좌번호3 = "9999";
		bank.creatAccount(계좌번호3);

		// 계좌번호 777777찾기
		BasicAccount basicAccount = bank.findAccount(계좌번호2);

		basicAccount.deposit(50000); // 찾은 계좌에 5만원 입금 :)

		System.out.println("계좌번호 : " + basicAccount.getAccountNumber());
		System.out.println("잔액 : " + basicAccount.getBalance());

		/*
		 * 퀴즈 계좌번호가 9999인 계좌번호3을 생성하고 계좌번호3에 10만원 입금 계좌번호3에 5만원 출금 계좌번호3에 최종 잔액 출력하기
		 */
		
		BasicAccount basicAccount2 = bank.findAccount(계좌번호3);
		basicAccount2.deposit(100000);
	    basicAccount2.withdraw(50000);
	    System.out.println("잔액"+basicAccount2.getBalance());
	    
	    /*
	     * 최종순서
	     * account > basicaccount(입금,출금,잔액확인,계좌확인) > bank(계좌찾기,생성) > main함수출력
	     */

	}
}