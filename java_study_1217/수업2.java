package java_study_1217;

class Food{
	String name;
	int calories;
	
	public Food(String name, int calories) {
		this.name = name;
		this.calories=calories;
	
	}
	public void eat() {
		System.out.println("Eating:"+this.name);
		
	}
	
	public int getCalories() {
		return this.calories;
	}
}//food 클래스끝

class Pizza extends Food{
	String[] toppings;//토핑 (문자열 배열)
	
	public Pizza(String name, int calories, String[] toppings) {
		super(name,calories);//super:부모클래스 생성자 호출
		this.toppings=toppings;
	}
	@Override
	public void eat() {//부모클래스에 있는 eat메소드 재정의
		System.out.println("Eating a slice of"+super.name+"pizza");
	}
	public void showToppings() {
		for(String s:toppings) {
			System.out.println("Toppings:"+s+",");
		}
	}
}//끝

class Sushi extends Food{
	String fishType;
	
	public Sushi(String name, int calories, String fishType) {
		super(name,calories);
		this.fishType=fishType;
	}
	@Override
	public void eat() {
		System.out.println("Eating"+super.name+"sushi");
	}
	
	public void showFishType() {
		System.out.println("FishType:"+this.fishType);
	}
	
}//끝
public class 수업2 {

	public static void main(String[] args) {
	
		Food food = new Food("Food",100);
		
		String[] toppings= {"tomato","mozzarella","basil"};
		Pizza margherita = new Pizza("margherita",300,toppings);
		
		Sushi salmonRoll= new Sushi("salmon Roll",250,"Salmon");
		
		food.eat();
		margherita.eat();//피자 클래스 eat호출
		salmonRoll.eat();//스시클래스 eat호출
		margherita.showToppings();
		salmonRoll.showFishType();
		
		/*
		 * Food 클래스:기본음식클래스, 모든 음식의 공통 속성
		 * name 과 calories 그리고 eat() 메소드를 가진다
		 * 
		 * pizza 와 sushi 클래스:food를 상속받아 eat메소드를 오버라이딩
		 * 또한 pizza 클래스에는 토핑을 보여주는 showToppings()메소드 구현
		 * sushi 클래스에는 생선종류를 보여주는 showFishitype()메소드 구현
		 * 
		 * 핵심:pizza와 sushi 클래스는 food 클래스의 속성과 메소드를 상속받아 재사용할 수 있습니다
		 */

	}

}
