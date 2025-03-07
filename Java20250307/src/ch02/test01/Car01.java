package ch02.test01;

public class Car01 {
		
	    String company = "현대 자동차";
	    String model;
	    String color;
	    int maxSpeed;
	    
	  
	    
	    Car01() {}
			
	    Car01(String model){
	    	this.model = model;
		 }
	    
	    Car01(String color, String model){
	    	this.color = color;
	    }
	    
	    Car01(String color, String model , int maxSpeed){
	    	this.maxSpeed = maxSpeed;
	    }
	  
	    public static void main(String[]args) {
	    	Car01 car1 = new Car01();
	    	System.out.println("car1.company :"  + car1.company);
	    	System.out.println("car1.company : " + car1.model);
	    	System.out.println("car1.company :"  + car1.maxSpeed);
	    }
	}
	


