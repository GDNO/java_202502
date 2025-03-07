package ch02.ex01;

public class Person {
	
	/*
	 * 멤버변수 -> 값 세팅 하는 방법
	 * 1.생성자
	 * 2.setter
	 * 3.getter
	 */
	private String name;
	private int age;
	private String phone;
	
//	객체 생성자 
	public Person(){
		System.out.println("Person()");
		
	}
//	객체 생성자
	public Person(String n) {
		System.out.println("Person(String n)");
		name = n;
	}
//	객체 생성자
	public Person(String n, int a , String p) {
		System.out.println("Person(String n, int age , String p)");
		name = n;
		age = a;
		phone = p;
	}
	
	void setName(String n) {
		name = n;
	}
	String getName() {
		return name;
	}
	void setAge(int a) {
		age = a;
	}
	int getAge() {
		return age;
	}
	
	void setPhone(String m) {
		phone = m;
		
	}
	String getphone() {
		return phone;
	}
	void eat(String m) {
		System.out.println(m + "먹다");
		}
}
