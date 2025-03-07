package ch02.ex03;

public class Person{
	
//	public static void main(String[]args) { 한 클래스 안에서도 이렇게 사용하가능하다 .
//		Person p = new Person("한경민", 25);
//	}

	private int age; 
	private String name;
	//객체 생성
	public Person() {}
	//생성자 
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	String introduce() { //메소드 생성
		return "안녕하세요 , 제 이름은 ["+name+"]이고 , ["+ age + " ]살입니다.";
	}
	}
	
	
	

