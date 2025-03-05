package ch01.ex03;

import java.util.Scanner;

public class text02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int balance = 0;// 잔고 
		while(true) {
		boolean flag = false; // 참 이면 while 문을 벗어나지말고 false면 while 문을 벗어나라 
			
			
		System.out.println("------------------------------------------");
		System.out.println("1. 예금  ||  2. 출금  || 3. 잔고 || 4 .종료 ");
		System.out.println("------------------------------------------");
		
		System.out.printf("선택 >> ");
//	    문자열을 정수형으로 변환
		int num =Integer.parseInt (scanner.nextLine());
		if(num ==1 ) {
			System.out.println("예금액 :");
			balance += scanner.nextInt();
		}else if (num == 2) {
			System.out.println("출금액 :");
			balance -= scanner.nextInt();
		}else if (num == 3) {
			System.out.println("잔고 :");
			System.out.println(balance);
		}else if (num == 4) {
			break; 
		}			
			

		System.out.println("종료 :");
		}
	}

}