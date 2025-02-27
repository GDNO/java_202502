package ch01.ex07;

public class AccuracyExam02 {

	public static void main(String[] args) {
     int apple = 1;
     int totalpieces = apple * 10;
     int number = 7;
     
     int result = totalpieces - number;
     
     System.out.println("10조각에서 남은조각: " + result);
     System.out.println();   
     System.out.println("사과 1개에서 남은 양: "+ result/10.0);
     
	}

}
