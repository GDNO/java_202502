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
public class 함수매개변수없고반환값이있는경우04 {

	public static void main(String[] args) {
	    double result = sum();// 이 코드 실행 화면은 double result = 3.14159;
		System.out.println(result);
		System.out.println("프로그램 종료 !");
		

	}
    // 함수 정의    void = 반환값이 없다 .      함수 이름  
	public static double sum() { //함수 하나만든 것 
	        //코드 구현
		System.out.println("int sum() 함수 호출 !!");
		double pi =3.14159;
		return pi ;
	}
}
