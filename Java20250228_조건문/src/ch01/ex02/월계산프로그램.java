package ch01.ex02;

import java.util.Scanner;

public class 월계산프로그램 {

	public static void main(String[] args) {
	 
		/*
		 * 문제 설명 :
		 * 사용자가 월을 입력하면 해당 월이 어느 계절에 해당하는지를 출력하는 프로그램을 작성하세요.
		 * 계절을 다음과 같이 결정됩니다:
		 * 
		 * 12월 , 1월 , 2월 : 겨울 
		 * 3 , 4 , 5월 : 봄
		 * 6 , 7 , 8월 :여름 
		 * 9 , 10 ,11월 :가을 
		 */

		Scanner scanner= new Scanner(System.in);
				
				int month = 0;
				
		System.out.println("월 입력: ");
		month = scanner.nextInt();
		
		
		if(month ==12 || month <= 2) {
			System.out.println("겨울");
		}else if (month >=3 && month <=5) {
			System.out.println("봄");
		}else if (month >=6 && month <=8) {
			System.out.println("여름");
		}else if (month >=9 && month <=11)
			System.out.println("가을");
		
		System.out.println("종료");
	}

}
