package java_study_1226;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LibraryService library = new LibrayServiceImpl(10);
		
		while(true) {
			System.out.println("도서관리 프로그램");
			System.out.println("메뉴를 선택하세요");
			System.out.println("[1] 도서추가 [2] 도서 검색 [3]시스템 종료");
			System.out.print("번호입력");
			int choice = scan.nextInt();//번호입력받기
			scan.nextLine();//버퍼지우기
			
			if(choice ==1) {//도서 추가
				System.out.println("제목입력:");
				String title = scan.nextLine();
				System.out.println("저자:");
				String author = scan.next();
				System.out.println("isbn:");
				String isbn = scan.next();
				library.addBook(new Book(title, author, isbn));//도서추가로직
						
			}else if(choice ==2) {//도서 검색
				System.out.println("검색어:");//제목 or 저자 or 고유번호 택1검색
				String keyword = scan.next();
				library.serchBook(keyword);
			}else if(choice ==3) {//시스템 종료
				System.out.println("시스템을 종료합니다");
				scan.close();//스캐너 종료
				System.exit(0);//콘솔강제종료
			}else {
				System.out.println("잘못된 선택입니다");
			}
		}

	}

}
