package library;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LibraryServiceImpl library = new LibraryServiceImpl();
		
		while(true) {
			System.out.println("★★★★★도서관리프로그램★★★★★");
			System.out.println("[1] 도서추가 [2] 도서검색 [3] 도서삭제 [4]모든도서조회 [5]종료");
			System.out.print("메뉴를 선택하세요");
			
			int choice = scan.nextInt();// 번호 입력받기
			scan.nextLine();//버퍼지우기
			
			if(choice==1) {
				System.out.println("제목:");
				String title = scan.nextLine();
				System.out.println("저자:");
				String author = scan.nextLine();
				System.out.println("ISBN:");
				String isbn = scan.nextLine();
				library.addBook(new Book(title, author, isbn));//도서 추가
				
			}else if(choice ==2){
				System.out.println("검색어:");
				String keyword = scan.nextLine();
				library.searchBook(keyword);//도서 검색
			}else if(choice ==3) {
				System.out.println("삭제할 도서의 isbn:");
				String removeIsbn = scan.nextLine();
				library.removeBook(removeIsbn);
			}else if(choice ==4) {
				System.out.println("모든 도서 목록:");
				for(Book b :library.getAllBooks()) {
					System.out.println("제목:"+b.getTitle());
				}
			}else if(choice ==5) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}else {
				System.out.println("잘못된 선택입니다 다시 선택해주세요");
			}
		}

	}

}
