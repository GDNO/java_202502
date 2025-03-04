package ch04.ex01;

import java.util.Scanner;

public class WhileExam05 {

	public static void main(String[] args) {

		int count=0;
		for(; ; count++) {
			
			if(count>100) break; //탈출 조건 항상 기입 해야함 
			
			System.out.println(count);
		}
		
		int cnt = 0; //cnt 값 입력
		while(true) { //반복문 
			cnt++; //증가값 
			if(cnt>100) break; // 조건문 + cnt 100 보다 클경우 멈춤 = break ;  
			System.out.println(cnt); // cnt 출력 ;
		}
	}

}
