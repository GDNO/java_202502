package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열03 {

	public static void main(String[] args) {
		// 5명의 평균 점수를 구하라 
		Scanner Scanner = new Scanner(System.in);
		int[] num = new int[5]; //배열 선언 , int 배열 5개 있다라는것
		int sum =0;

		
		for (int i=0; i<5; i++) {
			System.out.println( i+1 + "번학생 자바점수");
					num[i] = Scanner.nextInt();
			sum += num[1];
		}
		System.out.println("1번학생 자바 점수 :");
		
			
		double average = sum/5.0;
		System.out.printf("총점 : %d , 평균 %.2f\n" , sum , average);
		

		
		
		
		
	}

}
