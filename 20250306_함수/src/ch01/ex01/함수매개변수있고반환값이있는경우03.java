package ch01.ex01;

/*
 * *********함수**********
 * 입력 ( 매개변수)  출력(반환값)
 *  O              O
 *  함수 정의 -> 함수 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는 것
 *  
 */
public class 함수매개변수있고반환값이있는경우03 {

	public static void main(String[] args) {
//	    (3번)개수 , 순서,  변수명 일치해야함 
		int result = sum(10, 20 );// 함수 호출를 할때 받아주는 코드가 있어야한다 sum(10,20) 함수호출
//    윗 코드 실행 화면은 int result =30 ;--> 이렇게 나온다 
		System.out.println(result);
		System.out.println("프로그램 종료 !");
		

	}
    // 함수 정의  15, 24, 28번  type이 일치해야한다 . 
//	int 형을 기입할경우 return이 필수적으로 필요하다    
	public static int sum(int n1 , int n2 ) { //함수 하나만든 것 (int n1 , int n2) = 매개 변수  (int) 반환타입
	        //코드 구현                           (1번)
		System.out.println("void sum(int n1 , int n2) 함수 호출 !!");
//		       (2번)
		return n1+n2; //return 값을 반환 한다.(n1+n2 => 정수값)
//	       27번 return 값은 1개만 가능하다. 여러개로 하고싶을땐 배열을 사용하면 가능하다. 
//		ex = int[] x = new int [];
	}
}
