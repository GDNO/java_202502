package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열 {

	public static void main(String[] args) {
		// 5명의 평균 점수를 구하라 
		Scanner Scanner = new Scanner(System.in);
		System.out.println("1번학생 자바 점수 :");
		int a = Scanner.nextInt();
		
		System.out.println("2번학생 자바 점수 :");
		int b = Scanner.nextInt();
		
		System.out.println("3번학생 자바 점수 :");
		int c = Scanner.nextInt();
		
		System.out.println("4번학생 자바 점수 :");
		int d = Scanner.nextInt();
		
		System.out.println("5번학생 자바 점수 :");
		int e = Scanner.nextInt();
			
		int sum = a + b + c + d + e;
		double average = sum/5.0;
		System.out.printf("총점 : %d , 평균 %.2f\n" , sum , average);
		

		
		
		
		
	}

}
