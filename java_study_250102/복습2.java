package java_study_0102;

import java.util.ArrayList;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
}

public class 복습2 {

	public static void main(String[] args) {
		// Book 객체를 저장할 ArrayList 생성

		ArrayList<Book> library = new ArrayList<>();
		
		Book b = new Book("자바의 정석","남궁성");//방법1
		//도서관에 책 넣기
		library.add(b);
		library.add(new Book("데이터 구조와 알고리즘","홍길동"));//방법2
		library.add(new Book("AI","박길동"));
		
		for(Book book : library) {
			System.out.println("제목:"+book.getTitle() + "저자:"+book.getAuthor());
		}
		
		//크기확인
		System.out.println("도서관에 있는 책의 수:"+library.size());
		
		//특정 인덱스의 책 정보 가져오기
		Book book2 = library.get(1);//1번 인덱스 요소 가져오기
		System.out.println("책이름:"+book2.getTitle());
		
		//0번째 요소 삭제후 사이즈출력
		library.remove(0);
		System.out.println("도서관에 있는 책의 수:"+library.size());
		
	}

}
