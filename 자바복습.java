package java_study;

import java.util.Scanner;

public class 자바복습 {

	public static void main(String[] args) {
		String name = "홍길동";//이름
		int age =20; //나이
        String adress="대전 서구 둔산동";//주소
        String hobby = "운동";//취미
        String mbti = "esfj";//mbti
        
        //name~mbti : 변수명 (이름)
        //변수명은 대문자 불가능 개발자들 약속
        
        System.out.println("이름:"+name);
        System.out.println("나이:"+ age);
        System.out.println("주소:"+adress);
        System.out.println("취미:"+hobby);
        System.out.println("mbti:"+mbti);
        //입력받기
        Scanner scan = new Scanner(System.in);
        //입력후 ctrl+shift+o 누르기
        System.out.print("이름을 입력해주세요 =>");
        String n =scan.next();
        System.out.println("입력하신 이름은 :"+n+"입니다");
        
        
			
		
      
        
        
	}

}
