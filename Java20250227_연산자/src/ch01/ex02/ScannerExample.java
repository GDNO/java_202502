package ch01.ex02;

import java.util.Scanner; //scanner 작성후 ctrl + space 누르면 나옴

public class ScannerExample {

	public static void main(String[] args) {

		//키보드 통해서 인력을 받기!
		
		System.out.print("문자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("입력된 값 : " + str );
		
		System.out.println("정수 입력: ");
		
		int num = sc.nextInt();
		System.out.println("입력된 값 : " + num );    	
		
		
	}

}
