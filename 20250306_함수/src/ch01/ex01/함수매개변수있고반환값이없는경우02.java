package ch01.ex01;

/*
 * *********함수**********
 * 입력 ( 매개변수)  출력(반환값)
 *  O              O
 *  O              X
 *  X              O 
 *  X              X
 *  
 *  함수 정의 -> 함수 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는 것
 *  
 */
public class 함수매개변수있고반환값이없는경우02 {

	public static void main(String[] args) {
//	        개수 , 순서,  변수명 일치해야함 
		sum(10, 20 );// 함수 호출를 할때 받아주는 코드가 있어야한다 
		System.out.println("프로그램 종료 !");
		

	}
    // 함수 정의             매개 변수  2개 정수 입력 받아서 출력 
	public static void sum(int n1 , int n2 ) { //함수 하나만든 것 
	        //코드 구현               
		System.out.println("void sum(int n1 , int n2) 함수 호출 !!");
		System.out.println(n1+n2);
	}
}
