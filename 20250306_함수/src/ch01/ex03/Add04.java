package ch01.ex03;
/*
 * 2개 값을 입력받아서 , 더하는 기능을 수행 
 * 매개변수 O  , 반환 O
 */
public class Add04 {

	public static void main(String[] args) {
        //scanner sc(sc 라는 스캐너 입력) = (new scanner(참조변수)(system.in);                     		
		//scanner sc2 = sc; /스캐너라는 객체안에 생성 같은 대상을 지시 heap ; 
		
		//int a = 100;  
		//int b =  a;
		
		
		System.out.println("main함수 시작 ");
	
		
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1; //랜덤으로 100개의 값을 정수로 입력하라 1~100;
		
		int result = add(num1 , num2); // 매개 변수 전달 (1)
	   
	//	sc.nextLine(); = .을 찍는 이유는 무수히 많은 것들이 있기때문에 지정하기 위해서 . 을 사용한다
		System.out.println(result);
		
		System.out.println("프로그램 종료 ! ");//출력 
	}
	//코드 구현 
	public static int add(int numA, int numB) { // (1) 매개변수 
		
		System.out.println("add() 시작");
		
		int sum = numA + numB; 
		
		System.out.println("num=1 "+ numA + ", num2=" + numB);

		return sum; //반환
	}

}