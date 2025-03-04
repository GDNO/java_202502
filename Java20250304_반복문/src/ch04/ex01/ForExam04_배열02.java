package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열02 {

	public static void main(String[] args) {
		// 5명의 평균 점수를 구하라 
		Scanner Scanner = new Scanner(System.in);
		int[] num = new int[5]; //배열 선언 , int 배열 5개 있다라는것

		
		System.out.println("1번학생 자바 점수 :");
		num[0] = Scanner.nextInt();
		
		System.out.println("2번학생 자바 점수 :");
		num[1] = Scanner.nextInt();
		
		System.out.println("3번학생 자바 점수 :");
		num[2] = Scanner.nextInt();
		
		System.out.println("4번학생 자바 점수 :");
		num[3] = Scanner.nextInt();
		
		System.out.println("5번학생 자바 점수 :");
		num[4] = Scanner.nextInt();
			
		int sum = num[0] + num[1] + num[2] + num[3] + num[4];
		double average = sum/5.0;
		System.out.printf("총점 : %d , 평균 %.2f\n" , sum , average);
		

		
		
		
		
	}

}
