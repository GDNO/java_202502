package ch01.ex04;

public class ForExam01 {

	public static void main(String[] args) {
		/*
		 * 반복문 
		 * for, while -> 조건을 만족하는 순간까지 계속 반복
		 * for -> 반복 횟수를 알 때 
		 * while -> 몇번 반복하는지 모를 때
		 * do~while -> 조건을 만족하는 순간까지 계속 반복 (단, 최소1회는 보장)
		 * for ( 초기 ; , 조건 , 증가 )
		 */
	
		
		
		int sum= 0;

		for (int i=1; i<=5; i++) { // int - 1 초기값 -2 조건값 -3 증가값 )
			sum += i;
		}
		
		System.out.println(" sum = " + sum);
	}

}
