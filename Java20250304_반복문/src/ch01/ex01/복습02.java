package ch01.ex01;

import java.util.Scanner;

public class 복습02 {

	public static void main(String[] args) {
		/*
		 *  정수 : byte , short ,char , int , long
		 *  실수 : float , double 
		 *                    자료형 변수 = 초기값
		 *  논리 : boolean     boolean test = false 
		 */
		
		//객체 참조변수 
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력>>");
		int number = scanner.nextInt();
		
		// 삼항연산자(조건연산자)
		// (조건판단) ? 참 : 거짓 ;
		
		String msg = (number > 0) ? "양수" : "음수";
		System.out.println(msg);
	}

}
