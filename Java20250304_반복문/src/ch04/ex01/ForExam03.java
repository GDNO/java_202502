package ch04.ex01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		/*
		 * 키보드 숫자 입력 받는다
		 * 5         --> 1~5 누적합 15
		 * 10        --> 1~10 누적합 55
		 * 100       --> 1~100 누적합 550
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력 :");
		int number = scanner.nextInt();
		int sum =0;
		int i = 0;
		for(i=1; i<=5; i++) 
			if(i%2 ==1) //홀수 값구하기
			sum += i;
			System.out.println(sum);
					sum = 0 ;
			for(i=1; i<=10; i++) 
			sum += 1;
			System.out.println(sum);
			 sum = 0;
				for (i=1; i<=100; i++)
					sum += 1;
				System.out.println(sum);
			
			
		

		
		
		
		
	}

}
