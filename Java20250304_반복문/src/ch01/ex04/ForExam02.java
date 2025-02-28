package ch01.ex04;

public class ForExam02 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=100; i++) { //1~100까지 반복 
			//1~100까지 홀수 합 
		if(i % 2 ==1 ) { // 홀수 인지 물어보는 
			sum += i; //홀수이면 누적 
		 }
		}

		System.out.println("sum =" + sum );
	}

}
