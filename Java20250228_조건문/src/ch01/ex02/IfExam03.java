package ch01.ex02;

public class IfExam03 {

	public static void main(String[] args) {
	

	   //string result = (korScore >= 80) ? " 상 " :
		// (korScore >= 60) ? "중" : "하";

		int korscore = 50;
		
		if(korscore >= 80 ) {
			System.out.println("상");
		}else {
			if(korscore >= 60) {
				System.out.println("중");
			}else {
				System.out.println("하");
			}
		}
		
		System.out.println("종료");
	}
	
	
}
			
