package ch01.ex01;


public class Lotto02 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램 
		 * 배열 : 6칸짜리 int 배열 로또는 1~45 랜덤하게 저장 
		 * 단 .중복불가능 
		 */

		int[] lotto = new int[45]; //45개 짜리 방을 만들겠다 
		
		for(int i=0; i<lotto.length; i++) { // 반복문 기초값 0 증가값 
			lotto[i] =i+1; 
		}
		
		//배열 섞기
		for(int i=0; i<500; i++) { 
			int index = (int)(Math.random()*45); // 1~45
			
			int temp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = temp;
		}
		
//		배열 45개 칸 중 앞자리 6자리만 출력
		System.out.print("이번 주 예상 로또 번호 : ");
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + " ");
	}

}
