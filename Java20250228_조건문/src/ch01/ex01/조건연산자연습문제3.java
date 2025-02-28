package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제3 {

	public static void main(String[] args) {
		/*
		 * 키보드를 통해서 국어점수 , 영어점수 입력 받는다.
		 *  국어점수 
		 *  80이상이면 상 
		 *  60이상 중 
		 *  59이하면 하 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 :");
	
	    int Korscore = scanner.nextInt();
	    
	    
	    String result = ( Korscore>= 80) ? "상" : ( Korscore>= 60) ? "중" : "하";
	  	    // 속에 집어 넣어주는것도 가능하다 .
	    System.out.println(result);
	}

}
