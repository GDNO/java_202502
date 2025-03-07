package ch02.ex05;

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
 * source -generates- setter and getter 25번 부터 밑으로 진열된 것들을 한번에 생성할 수 있다 . 
 */
	
	private String brand ;
	private String model ;
	private String year;
	
  public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	//생성자 호출 
	CAR(){
		brand = "기아";
		model = "k8" ;
		year = "2024";

	//main car2 호출  
	}
	CAR(String brand){
		this.brand = "기아";
		model = "k8" ;
		year = "2024";

	//main car3 호출	
	}
	CAR(String brand , String model){
		this.brand = brand;
		this.model = model ;
		year = "2024";

	// car , car 1 , car 2 대입 	
	}
	CAR(String brand , String model, String year){
		this.brand = brand;
		this.model = model ;
		this.year = year ;

		
	}
	
	public void startEngine() {
		System.out.printf("[%s] [%s]의 엔진이 시작 되엇습니다 !" , brand , model);
	}
	public void displayInfo() {
		System.out.printf("[" + year + "]년식 [" + brand + "] [" + model + " ]");
	}
      
	
}
