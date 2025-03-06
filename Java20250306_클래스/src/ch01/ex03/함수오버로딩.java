package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
//     함수  overloading 
		functionA(10);
		
	}

	public static void functionA() { //함수 이름은 똑같은 대로 안에있는 입력값이 다르면 호출되는것이 다르다 
		System.out.println("functionA()");

	}
	public static void functionA(int A) { //정수
		System.out.println("functionA()");
	}
	public static void functionA(double n) { //실수 
		System.out.println("functionA()");
	}
	
	public static void functionA(int n1, int n2) { // 2개 이상 입력시 호출
	System.out.println("functionA()");
	}
}
