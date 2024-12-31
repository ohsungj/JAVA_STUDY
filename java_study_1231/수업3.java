package java_study_1231;

import java.util.HashMap;
import java.util.Scanner;

class PhoneBook{
	HashMap<String,String> phoneBook = new HashMap<String,String>();
	
	//전화번호 추가
	public void addContact(String name, String phoneNumber) {
		phoneBook.put(name, phoneNumber);//name(key), phoneNumber(value)
		System.out.println("연락처가 추가되었습니다");
	}
	
	//전화번호 검색
	public void searchContact(String name) {
		String phoneNumber = phoneBook.get(name);//키값으로 value조회
		if(phoneNumber !=null) {
			System.out.println(name+"의 전화번호:"+phoneNumber);
		}else {
			System.out.println("해당 이름의 연락처를 찾을 수 없습니다");
		}
	}
}

public class 수업3 {

	public static void main(String[] args) {
		// HashMap을 활용한 전화번호부
		
		PhoneBook phoneBook = new PhoneBook();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[연락처 프로그램]");
			System.out.println("[1] 연락처 추가 [2] 연락처 검색 [3]종료");
			int choice =scan.nextInt();
			scan.nextLine();//버퍼지우기
			if(choice==1) {
				System.out.println("이름입력:");
				String name =scan.nextLine();
				System.out.println("연락처 입력:");
				String number=scan.nextLine();
				phoneBook.addContact(name, number);//연락처 추가
			}else if(choice==2) {
				System.out.println("검색할 이름을 입력:");
				String name =scan.nextLine();
				phoneBook.searchContact(name);
			}else if(choice==3) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);//콘솔 강제종료
			}else {
				System.out.println("잘못된 번호입니다.");
			}
				
		}

	}

}
