package ch01.ex02;

import java.security.PublicKey;

/*
 * 함수 2개 생성
 * 매개변수로 100값을 정수값을 전달하면
 * 함수1은 1~100 사이 홀수 값을 리턴하고 
 * 함수2는 1~100 사이 짝수 값을 리턴한다.
 * 메인함수에서 두 값을 호출하고, 각 전달 값을 출력한다 .
 */
 public class FuntionExam02 {

	public static void main(String[] args) {
         int[] number = new int [10];
         
         for(int i=0; i<10; i++) {
        	 number[i] = (i+1)*10;
         }
         
         for(int i=0; i<10; i++) 
        	 System.out.print(number[i]+ " ");
         System.out.println();
         
         int resultA = evenSum(number);
         System.out.println(resultA);

         int resultB = oddSum(number);
         System.out.println(resultB);
	}
	

	
	
	public static int evenSum(int[] numA) {
	

		int sum=0;
	
		for(int i=0; i<numA.length; i++) {
		
		int num = numA[i] / 10;
		
		int resultA = evenSum(number);
		System.out.println(resultA);
 
		int resultB = oddSum(number);
		System.out.println(resultA);
	}
		public static int evenSum(int[] numA) {
			
			int sum=0;
			for(int i=0; i < numA.length; i++) {
				
				int num = numA[i] / 10;
				if( num % 2 == 0)
					sum += numA[i];
			}
		return sum;
		}
		public static int oddSum(int[] numB) {
		int sum=0;
		
		for(int i=0; i<numB.length; i++) {
		
			if((numB[i] /10)% 2 == 1)
				sum += numB[i];
		}
		return sum;
	}
}
