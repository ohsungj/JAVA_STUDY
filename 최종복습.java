package java_study;

import java.util.ArrayList;

class Emp{
	private String ename;//이름
	private int sal; //급여
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp(String ename, int sal) {
		super();
		this.ename = ename;
		this.sal = sal;
	}
}

public class 최종복습 {

	public static void main(String[] args) {
		ArrayList<Emp> empList = new ArrayList<>();
		
		//사원추가
		empList.add(new Emp("홍길동",4000));
		empList.add(new Emp("박길동",1000));
		empList.add(new Emp("김길동",2000));
		empList.add(new Emp("이길동",6000));
		
		for(Emp e: empList) {
			System.out.println("이름:"+e.getEname()+"급여:"+e.getSal());
		}
		int sum=0;
		for(Emp e: empList) {
			sum+=e.getSal();
		}
		System.out.println(sum);

	}

}
