package java_study_1128;

public class 문자열문제 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * contains를 이용해서 특정 이메일 추출하기
		 */
		 
		 String[]email= {"123@naver.com", "456@gmail.com", "789@naver.com"};
        //네이버 이메일을 사용하는 계정만 출력하기
		 for(int i=0; i<email.length; i++) {
			 String e = email[i];
			 System.out.println("이메일 주소:"+e);
			 if (e.contains("naver.com")) {
				 System.out.println("네이버 이메일"+e);
			 }
		 }
		 //split을 활용하여 특정 문자 개수 구하기
		 String food="돈까스@돈까스@라면@김밥@돈까스";
		 String[] foodarray=food.split("@");
		 int count = 0;
		 for (int i=0; i<foodarray.length; i++) {
			 if (foodarray[i].equals("돈까스")) {
				 ++count;
			 }
		 }
		 System.out.println("돈까스 갯수는:"+count);
		 
		 
	}

}
