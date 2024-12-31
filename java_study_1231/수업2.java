package java_study_1231;

import java.util.ArrayList;

class Emp{//Emp(사원)클래스 생성
	String ename;//사원이름
	int sal;//급여
	String dname;//부서
	String job;//담당업무
	
	Emp(String ename, int sal, String dname, String job){
		this.ename=ename;
		this.sal=sal;
		this.dname=dname;
		this.job=job;
	}
	
}

public class 수업2 {

	public static void main(String[] args) {
		/*
		 * ArrayList:동적 크기 조절이 가능한 자료구조(배열)
		 * HashSet:중복 허용하지 않는 고유한 값만 저장되는 자료구조(배열)
		 * HashMap:key와 value의 쌍으로 데이터를 저장하는 자료구조(배열)
		 */

		ArrayList<Emp> emp = new ArrayList<>();//객체배열과 같은 개념
		
		//데이터 추가
		emp.add(new Emp("KING",5000, "PRESIDENT", "ACCOUNTING"));
		emp.add(new Emp("JONSE", 2975, "SALESMAN", "SALES"));
		emp.add(new Emp("ALLEN", 1250, "SALESMAN", "SALES"));
		emp.add(new Emp("TURNER", 1500, "SALESMAN", "SALES"));
		
		//1번째 저장된 사원 조회
		Emp e1 = emp.get(1);
		System.out.println("사원이름"+e1.ename);
		System.out.println("사원급여"+e1.sal);
		
		//모든 사원의 급여 총합과 급여 평균을 조회
		int salSum=0;
		int salAvg=0;
		for(Emp e :emp) {
			salSum+=e.sal; //list에 저장된 각 사원 sal 합산하기
		}
		System.out.println("사원 총급여:"+salSum);
		System.out.println("사원 총급여 평균:"+salSum/emp.size());
		
		//sales부서에서 일하는 사원 수 구하기
		int count = 0;
		for(Emp e :emp) {
			if(e1.job.equals("SALES")) {
				count++;
			}
		}
		System.out.println("SALES사원수:"+count);
		
		//사원이름이 ALLEN, TURNER의 급여와 부서 조회
		for(Emp e :emp) {
			 if(e.ename.equals("ALLEN")||e.ename.equals("TURNER")) {
				 System.out.println("사원급여:"+e.sal);
				 System.out.println("해당사원부서:"+e.dname);
			 }
		}
	}

}
