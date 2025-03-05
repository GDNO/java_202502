package ch01.ex03;

public class BreakExam02 {

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i == j) break ;
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
