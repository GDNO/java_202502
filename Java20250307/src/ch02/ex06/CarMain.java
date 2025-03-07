package ch02.ex06;

import ch02.ex05.CAR;

public class CarMain {

	public static void main(String[] args) {
		CAR car1 =new CAR();
		car1.displayInfo();
	
		CAR car2 = new CAR("현대");
	    car2.displayInfo();
		
		CAR car3 = new CAR("기아", "K9");
		car3.displayInfo();
		
		
		CAR car= new CAR("기아 자동차", "K8", "2023");
		
		car.startEngine();
		
		car.displayInfo();

	}

}
