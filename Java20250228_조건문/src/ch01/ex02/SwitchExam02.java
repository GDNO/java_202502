package ch01.ex02;

public class SwitchExam02 {

	public static void main(String[] args) {
	
		int grade = 85;
		
		switch(grade/10) { //86을 B에 걸리게 할수있는건 스위치 괄호속에 나누기 10을 하면 가능하다 또는 결과값에 앞자리만 보고싶을때도 가능하다 .
		case 10:
			System.out.println("A");
//			break;    //결과 값을 해당값으로 멈추게한다 .
		case 9:
			System.out.println("A");
//			break;
		case 8:
			System.out.println("B");
//			break;
		case 7:
			System.out.println("C");
//			break;
		case 6:
			System.out.println("D");
//			break;
		default:
			System.out.println("F");
			
		}
		System.out.println("종료");

	}
	
	
}
			
