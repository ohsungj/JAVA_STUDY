package java_study_1226;

//인터페이스를 구현할 클래스 명명규칙 맨뒤에 Impl(implement) 이라고 작성한다
public class LibrayServiceImpl implements LibraryService {

	private Book[] books; // book타입을 지정하는 클래스 배열
	private int bookCount;

	public LibrayServiceImpl(int capacity) {
		books = new Book[capacity];
		bookCount = 0;
	}

	@Override
	public void addBook(Book book) {// 도서 추가 재정의
		if (bookCount < books.length) {
			books[bookCount] = book;// book배열에 대입
			bookCount++;
			System.out.println(book.getTitle() + "도서가 추가되었습니다.");
		} else {
			System.out.println("도서가 가득 찼습니다");
		}

	}

	@Override
	public void serchBook(String keyword) {// 도서 검색 재정의
		boolean isFlag = false;//플래그 값
		for (int i = 0; i < bookCount; i++) {
			if (books[i].getTitle().contains(keyword) || 
					books[i].getAuthor().contains(keyword) || 
					books[i].getIsbn().contains(keyword)) {
				
				System.out.println(books[i].toString());// 해당도서 출력
				
                 isFlag=true;
			}
		}
 if(!isFlag) {
	System.out.println("검색결과가 없습니다.");
 }
	}

}
