package ch01.ex01;

/*
 * 이름 , 전화번호 ,나이 , 국어 , 영어 , 수학 -> 정적 -> 변수  
 *     공부하기, 시험보기, 등교하기          -> 동적 -> 함수 
 *     stack , heap 속에 있는것들은 메소드에 접근이 가능하지만 
 *     반대로 메소드에서 스택 , 힙으로 접근은 불가능하다 .
 */

public class 클래스도입 {

	public static void main(String[] args) {
		
		String name = "까미";
		String phone = "010-1111-2222";
		int age, kor, eng, math;
		age = 20;
		kor = 90;
		eng = 80;
		math = 77;
		공부하기(name);
		시험보기(kor,eng,math);
		등교하기(name);

		System.out.println("--------------------------");
		
		String name2 = "로이";
		String phone2 = "010-1111-2222";
		int age2, kor2, eng2, math2;
		age = 21;
		kor = 80;
		eng = 90;
		math = 87;
		공부하기(name2);
		시험보기(kor2,eng2,math2);
		등교하기(name2);
	}
	
	public static void 공부하기(String name) {
		System.out.println(name + " 공부하기");
	}
	
	public static void 시험보기(int kor, int eng, int math) {
		int sum = kor + eng + math ;
		System.out.println("세 과목 합 : " + sum);
	}	
	
	public static void 등교하기(String name) {
		System.out.println(name + " 공부하기");

	}
}

