package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열07 {

	public static void main(String[] args) {
		// 7명의 평균 점수를 구하라 
		Scanner sc = new Scanner(System.in);
		//예시 >> int num=0;
		int[] student = new int[]{-1, -3, -700, 1, 2, 9, 3};
		double[] numA = new double[5];
		
		int sum = 0;
		double average =0;
		int max =0; //변수 초기값 변경가능
		int min =1000; // 최소값 이상 입력해야 값이 적은 값이 나옴 
		
		for(int i=0; i<7; i++) {
			
			sum += student[i];
		}
				
		average =sum/7.0;
		System.out.printf("총점 %d, 평균 %.2f\n" , sum , average);
	    System.out.println("7번쨰 값 출력 : " + student[6]);
	    
	    System.out.println("-------------------------");
	    // max {99,88,77,33,100,80,50}
	   
	    max = student[0];
	    for(int i=0; i<7; i++) {
	    	if(max < student[i])
	    		max = student[i];
	   
	    	if(min >  student[i])
	    		min = student[i];
	    }
	    
	    System.out.println("최대값 : " + max);//100
	    System.out.println("최소값 : " + min);//33

		System.out.println("--------------------");
		/*
		 *  {10, -3, -700, 1, 2, 9, 3}
		 *  키보드 : 1입력하면 , 출력 : 1값은 4번째 위치입니다. 
		 *  키보드 : -3 입력하면 , 출력 1값은 2번째 위치입니다.
		 */
		
		
        int index = -1;
        System.out.println("찾을 숫자를 입력 >>");
        int numB = sc.nextInt();
        int i=0; 
        for(; i<7; i++) {
        	if(numB == student[i]) {
        		index = i;
        		break; 
        	}      		
        }
	    if(index !=-1)
		    System.out.printf("%d값은 %d번째 위치입니다.%d \n", numB, index+1 , i);
	    else
	    	System.out.printf("%d값은 찾을 수 없습니다. \n" , numB);
	    
	    System.out.println("-----------------------------");
	    
	    
		/*
		 * {10, -3, -700, 1, 2, 9, 3}
		 * 
		 * 정렬(sort)해서 출력 하기 ,,,, { -700, -3 , 1,2,3,9,10}
		 */

	    
	}

}

