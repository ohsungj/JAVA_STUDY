package java_study_1220.bank;

import java.util.Scanner; // 내장 클래스

//메인클래스 (console 출력확인)

public class BankingSystem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();//Bank 클래스 호출(생성)
		while(true) {//은행 업무 선택
			System.out.println("안녕하세요, 길동은행입니다 무엇을 도와드릴까요");
			System.out.println("[1] 계좌생성 [2] 입금 [3] 출금 [4] 잔액 조회 [5] 종료");

			
			System.out.print("업무선택:");
			int choice = scanner.nextInt();//스캐너로 업무입력받기
			scanner.nextLine();//버퍼지우기
			
			switch(choice) {
			case 1:
				System.out.print("새 계좌번호:");
				String newAccountNumber= scanner.next();//계좌번호 입력받기
				bank.creatAccount(newAccountNumber);
				//bank 클래스에 정의된 creatAccount 메소드 호출
				break;
			case 2:
				System.out.print("입금계좌번호 입력:");
				String depositAccount=scanner.next();
				System.out.println("입금액:");
				double depositAmount=scanner.nextDouble();//입금액 입력받기
				//입금할 계좌가 없다면?
				//bank 클래스에 정의된 findAccount 메소드 호출
				BasicAccount account = bank.findAccount(depositAccount);//계좌조회
				if(account !=null) {//값이 없다면?(null은 값이 없다를 의미)
					account.deposit(depositAmount);//입력받은 입금액 최종완료	
					System.out.println("현재잔액"+account.getBalance()+"원");
				}else {
					System.out.println("계좌를 찾을 수 없습니다");
				}
				break;
			case 3:
				System.out.print("출금 계좌번호 입력:");
				String withdrawAccount= scanner.next();//출금할 계좌번호 입력
				System.out.print("출금액:");
				double withdrawAmount=scanner.nextDouble();
				
				BasicAccount wAccount = bank.findAccount(withdrawAccount);
				if(wAccount !=null) {
					wAccount.withdraw(withdrawAmount);//출금	
					System.out.println("현재잔액+"+wAccount.getBalance());
				}else {
					System.out.println("계좌를 찾을 수 없습니다");
				}				
				break;
			case 4:
				//잔액조회
				System.out.print("계좌번호 입력:");
				String balanceAccount=scanner.next();//잔액 조회할 계좌번호 입력
				BasicAccount bAccount=bank.findAccount(balanceAccount);//계좌조회
				if(bAccount !=null) {
					//BasicAccount 클래스에 정의된 getBalance 호출
					System.out.println("현재 잔액:"+bAccount.getBalance());
				}else {
					System.out.println("계좌를 찾을 수 없습니다.");
				}
				break;
			case 5:
				System.out.print("프로그램을 종료합니다");
				scanner.close();
				System.exit(0);
				break;
				default://1~5번 말고 다른번호를 입력한다면
				System.out.print("잘못된 선택입니다.");
			}
			
		}

	}

}
