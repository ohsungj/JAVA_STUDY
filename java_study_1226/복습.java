package java_study_1226;

class Book_{
	String title; //전역변수 or 필드변수 
	int price;
	
	public Book_(String title , int price) {//파라미터에 있는 title,price 도 지역변수
		this.title=title;
		this.price=price;
	}
	
	public void showBook() {
		String author = "작자미상";//지역변수 showBook메소드안에서만 사용가능
		System.out.println("title :"+title);//메소드안에서 전역변수 접근가능
		System.out.println("price :"+price);
	}
	public void showAuthor() {
		int price= 100;
		//System.out.println("author:"+author); 불가능
		System.out.println("title :"+title);//전역변수는 클래스안에서 어디든 사용가능
		System.out.println("price:"+price);
	}
}

public class 복습 {

	public static void main(String[] args) {
		//자바는 클래스도 데이터 타입이다
		Book_[] bookList = new Book_[2];//Book타입을 저장하는 배열
		
		Book_ book1 = new Book_("자바의 정석",2000);
		bookList[0] = book1;//0번 인덱스에 book1대입
		bookList[1] = new Book_("파이썬의 정석",1000);//1번인덱스에 다른방법으로 대입
		for(Book_ b : bookList) {
			b.showBook();
			//퀴즈 책 제목이 자바의 정석인 책의 정보를 출력하기
			//booklist에 저장된 책의 총 price
			if(b.title.equals("자바의 정석")) {
				b.showBook();
			}
		}
		int p=0;
		for(Book_ b : bookList) {			
			p+=b.price;
			}
		System.out.println("총합:"+p);
		}
	}


