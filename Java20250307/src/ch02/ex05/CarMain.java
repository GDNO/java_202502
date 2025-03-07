package ch02.ex05;

public class CarMain {

	public static void main(String[] args) {
        //초기화 문장 기본 값 세팅 
		CAR car1 =new CAR();// brand , model ,year null 값으로 있는상태 초기화 기능이 포함이 되어있어야 한다 .
		car1.displayInfo();
		System.out.println();
	
		CAR car2 = new CAR("현대");
	    car2.displayInfo();
		System.out.println();
		CAR car3 = new CAR("기아", "K9");
		car3.displayInfo();
		
		System.out.println();
		CAR car= new CAR("기아 자동차", "K8", "2023");
		
		car.startEngine();
		
		car.displayInfo();

	}

}
