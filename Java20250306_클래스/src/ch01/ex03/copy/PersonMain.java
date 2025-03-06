package ch01.ex03.copy;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		//객체 생성 후 이름 기입 !! 필수 !
		Person person 
		= new Person(" 김대철", 50 , "010-3380-6423");
		person.age = 20;
		
		person.나이출력();
		person.이름출력();
		person.전화번호출력();
		
		Person p2 = new Person("홍길동", 20 , "1111-2222");
		p2.나이출력();
		p2.이름출력();
		p2.전화번호출력();
		
		

	}

}
