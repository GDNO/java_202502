package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {
		/*
		 * 키보드를 통해서 국어점수 , 영어점수 입력 받는다.
		 *  국어점수 , 영어점수 둘다 70 이상이면 합격 아니면 불합격
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 :");
	
	    int Korscore = scanner.nextInt();
	    
	    scanner.nextLine(); // 버퍼 enter 지우기 
	    System.out.println("영어 점수 입력 :");
	
	    int Engscore = scanner.nextInt();
	    
	    int score = (Korscore + Engscore );
	    System.out.printf("총 점수:" + score );
	    System.out.println();
	    
	    String result = ( Korscore>=70 && Engscore >= 70) ? "합격" : "불합격";
	    
	    System.out.println(result);
	}

}
