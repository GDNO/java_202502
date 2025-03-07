package ch02.ex06;

public class CAR {
/*
 * CAR 클래스 
 * 
 * 요구사항 
 * 1. brand (브랜드) , model(모델명) , year(연식)을 필드로 가짐.
 * 
 * 2. 생성자를 통해 brand , model , year를 설정할 수 있음 .\
 * 
 * 3. startEngine() 메서드를 구현하여 [brand][model]의 엔진이 시작되었습니다! 를 출력하도록 함.
 * 
 * 4. displayInfo() 메서드를 구현하여 " 자동차 정보 : [year]년식 [brand] [model] " 을 출력 하도록 함 
 * 
 * 5. main 메서드에서 Car 객채를 생성하고 startEngine()과 displayInfo()를 호출하여 
 * 실행 결과를 확인할것 
 */
	
	 String brand ;
     String model ;
	 String year;
	

	CAR(){
//		brand = "기아";
//		model = "k8" ;
//		year = "2024";
		this("기아", "k8", "2024");
// this 자기 자신껄 호출 
		
		
	}
	CAR(String brand){
		this(brand , "k8" , "2024");

		
	}
	CAR(String brand , String model){
		this(brand, model , "2024");

		
	}         //기아          //k8          //2024
	public CAR(String brand , String model, String year){
		this.brand = brand;
		this.model = model ;
		this.year = year ;
		// this = 객체자기자신 

		
	}
	
	public void startEngine() {
		System.out.printf("[%s] [%s]의 엔진이 시작 되엇습니다 !\n" , brand , model);
	}
	public void displayInfo() {
		System.out.printf("[" + year + "]년식 [" + brand + "] [" + model + " ]");
	}
      
	
}
