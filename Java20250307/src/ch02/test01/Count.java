package ch02.test01;

public class Count {

	
	private String month;
	private double thee;
	
	public Count() {}
	
	public Count(String month , double thee) {
		this.month = month;
		this.thee = thee;
	}
	

	double getCount() {
		return thee ;
	}
	
	public void won(double amut ) {
		thee += amut ;
	}
	public void win(double amut) {
		if(amut > thee ) {
			System.out.println("잔액 부족");
		}else {
		thee -= amut ;
	
		
		
		
	}
}

	public static void main(String[]args) {
		Count a1 = new Count("한경민", 100000);
		
		a1.won(10000);
		a1.win(900);

		System.out.println(a1.getCount());
	}
}