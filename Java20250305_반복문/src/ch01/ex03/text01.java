package ch01.ex03;

import java.util.Scanner;

public class text01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //스캐너 생성
		int balance = 0;// 잔고  balance = 0 값 대입 
		while(true) { //반복문 
		boolean flag = false; // 참 이면 while 문을 벗어나지말고 false면 while 문을 벗어나라 
			// 난수 flag 생성 = 거짓
			
		System.out.println("------------------------------------------");
		System.out.println("1. 예금  ||  2. 출금  || 3. 잔고 || 4 .종료 ");
		System.out.println("------------------------------------------");
		//출력 
		System.out.printf("선택 >> ");
//	    문자열을 정수형으로 변환
		int num =Integer.parseInt (scanner.nextLine());
		switch(num) {
		case 1:
			System.out.println("예금액 :");
			balance += scanner.nextInt();
			break;
		case 2:
			System.out.println("출금액 :");
			balance -= scanner.nextInt();
			break;
		case 3:
			System.out.println("잔고 :");
			System.out.println(balance);
			break;
		case 4:
			flag = true;// 참일 경우 while문 벗어나기
			break; 
			
		}//switch
		scanner.nextLine(); //버퍼비우기 ..엔터키 지움 		
		
		if(flag == true)break; // 조건문 flag가 참일 경우 멈춘다 
		} //while 
		System.out.println("종료 :");
	}

}
