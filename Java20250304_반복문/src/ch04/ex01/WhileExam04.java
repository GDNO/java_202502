package ch04.ex01;

import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {

		/*
		 * 	for(int i=2; i<=9; i++) {
			System.out.printf("********%d단********\n", i);
			for(int j=1; j<=9; j++) {
				System.out.printf("%dx%d=%d\n", i,j, i*j);
			}
			System.out.println();
		 */
		
		int i=2; //초기값 
		
		while(i<=9) { //반복문
			int j=1; // 함수 j 에 1이라는 것을포함 
			System.out.printf("********%d단********\n", i); //출력 
			while(j<=9) { //반복문 j 1 ~9 까지 
				System.out.printf("%dx%d=%d\n", i,j, i*j); //출력
				j++; // 증가값 
			}
			System.out.println(); // 줄바꿈 
			
			i++; // 증가값 
		}
	}

}
