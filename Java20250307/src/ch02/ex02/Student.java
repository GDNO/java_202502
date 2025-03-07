package ch02.ex02;

public class Student {

	private String name;
	private int grade; // 학년
	private int age;
	
		public Student() {}
	
		public Student(String n , int a , int b) {
		grade = a;
		name = n;
		age = b;
		
	}
		void setGrade(int a) {
			grade = a;
	}
		int getGrade() {
			return grade ;
		}
		
		void setName(String n) {
			name = n;
		}
		String getName() {
		return name; 
		}

		void printInfo() {
			System.out.println("이름 :  "+ name);
			System.out.println("학년 :  "+ grade);
			System.out.println("나이 :  " + age);
		
	}
}
