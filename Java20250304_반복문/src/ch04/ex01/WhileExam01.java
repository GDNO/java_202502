package ch04.ex01;

public class WhileExam01 {

	public static void main(String[] args) {
		/*
		 * int sum=0;
		 *  초기값     조건   증가/감소 (변동)
		 *  for(int i=1; i<=5; i++){
		 *  sum +=i;
		 *  }
		 *system.out.println("sum= " + sum );
		 */
		
		int sum=0;
		int i=1;
		
		while(i<=5) { // 매번 반복문을 사용할떈 탈출문을 집어넣어야한다 .
			sum +=i;
			i++;

		}
		System.out.println("sum="+ sum);
			 
	}

}
