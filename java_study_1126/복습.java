package java_study_1126;

public class 복습 {

	public static void main(String[] args) {
	//for문(반복문)
    for(int i=0; i<3; i++) {
    	//System.out.println("Hello World!");
    }
    	//1부터 100까지의 숫자중 3의배수,5의배수,3,5공배수
    for(int i=1; i<=100; i++) {
    	if(i%3==0 && i%5==0) {
    		System.out.println("FizzBuzz");
    }
    else if(i%3 == 0) {
    	System.out.println("Fizz");
    }
    else if(i % 5 == 0) {
    	System.out.println("Buzz");    	
    }
    }
    	
    	
    
    
    
    
    
    
    
    
    
    
    

	}

}
