package ch01.ex07;

public class AccuracyExam01 {

	public static void main(String[] args) {

	    double sum = 0; //실수는 정확한 값으로 나오지 않는다 . 웬만한 숫자 계산은 정수로 하는게 좋다 
		
		for(int i=0; i<30; i++) // 0.1을 30번 누적 => 3.0
			sum = sum + 0.1;
		
		System.out.println(sum);

	}

}
