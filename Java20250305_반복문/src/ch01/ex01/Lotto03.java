package ch01.ex01;

public class Lotto03 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6]; //6개방 생성 
		boolean flag = false; //난수 생성 (flag) 참 거짓 .
		for(int i=0; i<lotto.length; i++) {
			
			int temp = (int)(Math.random()*45)+1; // 45까지 랜덤으로 숫자를 입력하라
			//중복 체크 과정 필요 
			for(int j=0; j<lotto.length; j++) {
				if(temp == lotto[j]) { // 조건문 템프와 로또
				flag = true;
				break;
			
			}
			
			}
			
			
			flag = false; // 중복된 경우 true 값으로 변경된 값을 원 상태로 변경한다(false)
			if(flag != true) //조건문 플래그 = false != ture 참 / 중복되지 않았을때 처리 
			lotto[i] = temp; //로또 첫번째 값에 입력해라
			else  // 중복된 경우 
				i--; //값을 하나 감소시켜 값을 처리 함 
		}
		System.out.print("이번주 예상 번호 :");
		//출력 
		for(int i=0; i<lotto.length; i++)
			System.out.printf(lotto[i]+ " ");
	}

}
