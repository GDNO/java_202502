package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1 {

	public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자 입력 :");
//	String str =sc.nextLine();
//	int totalSeconds = Integer.parseInt(str);
    // 10, 11 z 실수입력가능 13 z 정수만 입력가능하다 .
	int totalSeconds = sc.nextInt();
	int hours = totalSeconds / 3600; //1시간 구함 
	
//	System.out.println(hours);
	
	int minutes = (totalSeconds % 3600) / 60; //6분 구함 
//	System.out.println(minutes);
	   
    int seconds = totalSeconds % 60;
    System.out.println(seconds);
    
    System.out.printf("total 초 : %d , %d시간 %d분  %d초 \n",
    		totalSeconds, hours , minutes , seconds );
	}

}
