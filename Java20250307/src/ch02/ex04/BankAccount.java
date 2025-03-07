package ch02.ex04;


public class BankAccount {
	
	private String owner;
	private double balance;

	public BankAccount() {}

	public BankAccount(String owner, double balance) {
		this.owner = owner; //this가 있으면 똑같은 걸 반복해도 heap속으로 이동시켜준다 .
		this.balance = balance;
	}
	
	double getBalance(){
		return balance;
	}
	public void deposit(double amount) { // deposit이라는 객체 생성 실수형 amount  직관적으로 보기위해서 
//		public Account(int name)
//		ex = this.name = name ; 
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("잔액 부족 ");//amount가 잔고 보다 크다면 아니면 출금하게 해주는 것 
		}else {
		balance -= amount;
	}
		
}
	
	/*
	 * 수정 요구사항 
	 *  1.withdraw() 매서드를 개선하여 잔액보다 많은 금액을 출금할 경우 "잔액 부족"을 출력하고 출금을 방지할 것.
	 *  2. getBalance() 매서드를 추가하여 현재 잔액을 반환할 것.
	 *  3. main 메서드에서 BankAccount 객체를 생성하고 입금, 출금을 테스트할 것
	 */
	
	public static void main(String[]args) { 
	
		BankAccount b1 = new BankAccount("한경민" , 10000); //객체 생성 메모리 속 들어감 

		//입금
		b1.deposit(10000);
		//		출금할떄 
		b1.withdraw(1000000); //잔액부족 .. 처리가 안됌  
		b1.withdraw(2000);
		

		System.out.println(b1.getBalance());
		
	}
}

	
 