package java_study_1206;

public class 정렬문제 {

	public static void main(String[] args) {
		int []array= {10,4,3,29,31};
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				int x=array[j];
				int y=array[j+1];
				if(x<y) {
					int temp=x;
				array[j]=y;
				array[j+1]=temp;
				}
			}
		}

	}

}
