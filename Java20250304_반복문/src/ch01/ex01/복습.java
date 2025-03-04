package ch01.ex01;

public class 복습 {

	public static void main(String[] args) {
		
		// 자료형 변수 = 값(초기화)
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		
		num = num +1; //num (1)
		
		num += 1; //num (2)
		
		num2 = ++num; // 전위연산자(증강)num (3) 증강연산자 사용시 ++num 먼저 증가 후 num2 증가 
		
		num3 = num++; // 후위연산자(증강)num (4) 후위연산자 사용시 num3 값 먼저 입력후 num 증가 

		System.out.printf("%d %d %d \n" , num , num2 , num3);

		
	}

}
