package ch02.ex05;

public class Member {

	private String name;
	private String id;
	private String passward;
	private int age;
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(passward);
		System.out.println(age);
	}
}
