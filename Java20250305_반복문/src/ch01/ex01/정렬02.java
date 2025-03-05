package ch01.ex01;

public class 정렬02 {

	public static void main(String[] args) {
 	
		int[] numArr = new int[10];
		int tmp;
		
		System.out.println(Math.random());   
		// math random 기본값은 double 형태로 되어있다.
		
		//랜덤하게 1~100사이 값을 배열에 넣는다..
		//기본값 0 , 10번출력 , i 증가값 
		for(int i=0; i<10; i++){
			tmp = (int)(Math.random()*100)+1; //정수로 0~100까지 랜덤으로 출력하라  
			numArr[i] = tmp;
//			기본적으로 0~99를 포함 하기 때문에 뒤에 +1을 붙인것이다.
			
		}
		//랜덤하게 배열 저장된 값 출력 
		for(int i=0; i<10; i++)
			System.out.println(numArr[i] + " ");

	}

}
