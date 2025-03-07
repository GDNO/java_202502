package ch01.ex03.copy;

public class Person {

//	/필드 , 인스턴스 변수 외부노출 불가하게 하기위해 private를 사용한다 . 
//	변수 앞 private 필수이다 . 이상한 값이 입력되는걸 막기위한 방지용이다.
	private String name;
	private String phone;
	private int age;
	
//생성자  // 생성자- 호출 자바 에서 default 생성자 생성 
	//디폴트 생성자
	/*
	 * 생성자 : 값 초기화 
	 */
	 public Person(String n, int a, String p) {
		 name = n;
		 age = a;
		 phone = p;
			
	 }
	
	
	public Person() { 
		System.out.println("void Person()");
	}
//	메소드, 인스턴스 , 메소드 
	void 나이출력() {
		System.out.println("나이 :" +  age );
	}

	void 전화번호출력() {
			System.out.println("전화번호 :" + phone);
		}

	void 이름출력( ) {
				System.out.println("이름은 :" + name);
			}		
	}

