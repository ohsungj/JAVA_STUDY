package java_study_1128;

public class 복습 {

	public static void main(String[] args) {
		//1차원 배열
		int []array= {1,2,3};// 배열 선언과 동시에 값 초기화
		//2차원 배열
		int [][]array2= {{1,2,3},{1,2,3},{1,2,3}};
		//2차원 배열 출력
		for(int i=0; i<array2.length; i++) {
			for (int j=0; j<array2[i].length; j++) {
				System.out.println("2차원 배열 출력:"+array2[i][j]);
			}
		}
		//배열 형변환
		int[] array3 =new int[3];
		String[]array4 =new String[4];
		array3[0]=3; //0번째 인덱스에 3대입
		array4[0]="apple"; //0번째 인덱스에 문자열 대입
		
		//array4 첫번째 인덱스에 3넣기
		//array4[1]=3; 문자열이기 때문에 불가능
		array4[1]=Integer.toString(array3[0]);//인덱스 요소를 형변환해서 대입
		//Integer.toString: 숫자에서 문자로 형변환
		//Integer.parseInt: 문자에서 숫자로 형변환

	}

}
