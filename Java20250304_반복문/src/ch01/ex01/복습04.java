package ch01.ex01;

import java.util.Scanner;

public class 복습04 {

	public static void main(String[] args) {
		//객체 참조변수 
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력>>");
		int number = scanner.nextInt();
		
		// 삼항연산자(조건연산자)
		// (조건판단) ? 참 : 거짓 ;
		// (조건1) ? 참 : (조건2) 참 : 거짓 ;
		String msg =""; //중괄호 사용시 끝나는 부분 까지 한 문장이다 .
		if(number > 0) 
			msg = "양수";
		else 
			msg = "음수";
	
		
		System.out.println(msg);
		}
	}


