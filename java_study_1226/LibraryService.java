package java_study_1226;
/*
 * 인터페이스는 기능선언만 가능
 * 보통 인터페이스 명명규칙 뒤에 Service 붙임
 * 인터페이스를 가장먼저 구현한다
 */

public interface LibraryService {
	void addBook(Book book);//도서 추가
	void serchBook(String keyword);//도서 검색

}
