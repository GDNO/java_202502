package ch01.ex01;

import java.util.Random;

public class 정렬 {

	public static void main(String[] args) {
 	   //seed 값을 넣어주면 랜덤숫자가 일정하게 나온다 
//		int seed = 12345; // 값을 정하면 지정된 값만 고정적으로 나옴 
//		Random random = new Random(seed);
		
//		numArr.length  방 생성후 numArr 값을 변경 해도 numArr.length 대입하면 값이 계속 바뀐값으로 변경된다.
		//seed값이 없으면 랜덤으로 추출 
		Random random = new Random();
		
		int[] numArr = new int[12];
		int tmp;
		
//		System.out.println(Math.random());   
			
		//랜덤하게 1~100사이 값을 배열에 넣는다..
		for(int i=0; i<numArr.length; i++){
			tmp = (int) random.nextInt(100)+1;
			//정렬 1에 나와있는것과 똑같은 값이 출력된다.
			numArr[i] = tmp;

			
		}
		for(int i=0; i<numArr.length; i++) 
			System.out.println(numArr[i] + " ");

		//최대값 , 최소값 출력 
		int max, min;
		max = min = numArr[0];
		for(int i=1; i<numArr.length; i++) {
			if(max < numArr[i])  //최대값 
				max = numArr[i];
			
			if(min> numArr[i]) //최소값 
				min = numArr[i];
		}
		 
		
		
		System.out.println("최대값 : " + max + ", 최소값 : "+ min);
		
		System.out.println();
		//총점, 평균 구하기
		int sum=0; //sum 이라는 메모리에 0값 대입 
		double average = 0; // 실수 average 0 값 대입 
		// 코드 구현 
		
		for(int i=1; i<numArr.length; i++) //반복문 초기값 : 1  반복 : 10번 , 증가값 
			sum += numArr[i];
		
			average = (double)sum/numArr.length; // 정수 /정수 => 정수 , 정수/ 실수 = > 실수 
		
			
			
		
		System.out.printf("총점 : %d , 평균 :%.2f \n " , sum , average);
		System.out.println();
		
		//정렬 ~ (버블정렬)
		int temp;
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<numArr.length-1-i; j++) {
				if(numArr[j]> numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					
				}
			}
		}
		
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
	}

}
