package ch01.ex02;

import java.util.Scanner;

public class IfExam06 {

	public static void main(String[] args) {
	

		/*
		 * 버스요금 계산 프로그램 
		 * 기본요금: 2000
		 * 1~5세 무료 
		 * 6~12세 : 50%할인
		 * 13~18세 : 25%할인
		 * 19세~ 64세 : 0%할인
		 * 65세 이상 : 무료 
		 */

		Scanner scanner = new Scanner(System.in);
		int age = 0;
		int fee = 0; // 버스요금 
		double rate = 0; // 할인율 

		System.out.println("나이 입력:");
		age = scanner.nextInt();
		
		
		
		
		if(age <= 5) {
			System.out.println("무료");
		}else if(age <= 12) {
			System.out.println("1000원");
		}else if(age <= 18) {
			System.out.println("1500원");
		}else if(age <= 64) {
			System.out.println("2000원");
		}else if (age >= 65)
			System.out.println("free");
		
	}	
	
}
			
