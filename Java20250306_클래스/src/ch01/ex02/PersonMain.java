package ch01.ex02;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		//객체 생성 후 이름 기입 !! 필수 !
		Person person = new Person();
		
		person.name = "김대철";
		person.age= 50;
		person.phone="010-4444-4444";
		
		person.나이출력(person.age);
		person.전화번호출력(person.phone);
		person.이름출력(person.name);
		
		

	}

}
