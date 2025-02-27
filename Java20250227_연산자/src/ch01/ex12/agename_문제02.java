package ch01.ex12;

import java.util.Scanner;

public class agename_문제02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        
	   
	    
	     System.out.println("이름 입력:");
	     String name = scanner.nextLine();
	     System.out.println("이름은 "+ name);
	    	
	     // 스캐너 사용할때 문제가 생기거나 할떄 사용하는거
	     // sc.nextLine(); = 버퍼 클리어 
	     // line은 버퍼에서 엔터키가 있기 때문에 작성하지 않아도 엔터키를 인지하고 엔터키를 들고옴 = 그래서 sc.nextLine(); 엔터키 인식못하게함 
 	     System.out.println("나이 입력:");
	     int age = scanner.nextInt();
	     System.out.println("나이는 "+ age);
                  

	}

}
