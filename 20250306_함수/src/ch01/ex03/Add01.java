package ch01.ex03;
/*
 * 2개 값을 입력받아서 , 더하는 기능을 수행 
 * 매개변수 X  , 반환 타입 X 필요하지 않을땐 void 기입  public static int sum(X) return (X)
 */
public class Add01 {

	public static void main(String[] args) {
//                              (1번) 		
		System.out.println("main함수 시작 ");
//		(2번)
	    add();
//		                    (4번)
		System.out.println("프로그램 종료 !");

	}

	public static void add() {
		
		int num1 = (int)(Math.random()*100) + 1;
		//(0~1난수 발생)*100 (0~99)+1하여  정수발생  1~100까지 정수발생
		int num2 = (int)(Math.random()*100) + 1;
		
   //   System.out.println(num1 + " + " + num2 + " = " + num1 + num2); 
//		괄호를 넣지 않아 값이 31+41= 3141 로 나옴 
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//	                       (3번)	
		System.out.println("add() 시작");
	}
}
