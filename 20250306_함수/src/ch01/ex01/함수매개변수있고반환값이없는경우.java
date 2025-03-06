package ch01.ex01;

/*
 * *********함수**********
 * 입력 ( 매개변수)  출력(반환값)
 *  O              O -03 class
 *  O              X -02 class 
 *  X              O -04 class
 *  X              X -01 class
 *  
 *  함수 정의 -> 함수 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는 것
 *  
 */
public class 함수매개변수있고반환값이없는경우 {

	public static void main(String[] args) {
	     
		sum();// 함수 호출
		System.out.println("프로그램 종료 !");
		

	}
    // 함수 정의    void = 반환값이 없다 .      함수 이름  
	public static void sum() { //함수 하나만든 것 
	        //코드 구현
		System.out.println("void sum() 함수 호출 !!");
	}
}
