package ch01.ex02;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
     
		//키보드 통해서 인력을 받기!
		
		System.out.print("문자 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int str = Integer.parseInt(sc.nextLine());
		
		// "a" + " b" => "ab"
	    
		str = str + 10; // "10" + 10 => "10" + "10" =>1010
	    
		System.out.println("입력된 값 : " + str );
		
	
		
	}

}
