package ch01.ex06;

public class OverflowExample {

	public static void main(String[] args) {
	 short num1 =32767;
	 short num2 =-32768;
	 
	 System.out.println(num1);
     System.out.println(num2);
     
     num1++; // num = num +1 // 초과된 값이 나오면 뒤로 또는 앞으로 넘어가서 결과가 나옴 
     num1++;
     num1++;
     System.out.println(num1);
     num2--;
     System.out.println(num2);
     
     
   
	}

}
