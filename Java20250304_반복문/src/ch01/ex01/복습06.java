package ch01.ex01;

import java.util.Scanner;

public class 복습06 {
//       함수 (주인)main 
	public static void main(String[] args) {
		
		//지역변수
		int num=0;		
		int num2=0;
		{
			int num3=0; //블럭변수
			num++;
			num2++;
			System.out.println(num3); //블럭 밖에선 사용할수없다 .
		}
		num++;
	}
	// 명칭(함수) (주인) func        //지정자의 이름이 다를경우 입력값을 다른 곳에서 사용은 불가능하다.
	public static void func() {
		int num=0;


	}
}
