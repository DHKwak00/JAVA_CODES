package edu.java.homework;

public class 목진혁_HW1 {

	public static void main(String[] args) {
		// 1. 반복문을 사용해서, 'A'부터 'Z'까지 출력하는 프로그램
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.println((char) i );
		}
		
//		2. While문과 Math.random() 함수를 이용해서 두 개의 주사위를 던졌을 때 나오는
//		눈의 합이 5이면 실행을 멈추고 5가 아니면 주사위를 계속 던지는 코드를 작성
//		예시) 합의 5가 나올때까지 아래와 같이 실행
//		(1, 3)
//		(2, 6)
//		(3, 1)
//		(4, 1) // 끝

		while(true) {
			// Math.random() : 0 <= x < 1 사이의 난수 발생 메소드
			double rX = Math.random();
			double rY = Math.random();
			
			int x = (int)(6 * rX + 1);
			int y = (int)(6 * rY + 1);
			
			System.out.println("x : " + x + ", " + "y : " + y);
			if(x + y == 5) {
				break;
			}	
		}

		
		// 3. 숫자가 1 + (-2) + 3 + (-4) + 5 + ... + n 형태로 더해진다. 
		// (n은 값이 정해지지 않았음)
		// sum = 1 + (-2) + 3 + (-4) + 5 + ... + n 의 값이 
		// 100 이상으로 넘어갔을 때의 n의 값과 sum의 값을 출력
		int sum = 0;
		int n = 1;
		while(true) {
			if(n % 2 == 1) { // 홀수
				sum = sum + n;
			} else { // 짝수
				sum = sum - n;
			}
			if(sum >= 100) {
				break;
			}
			n++;
			
		}
		System.out.println("sum = " + sum + ", n = " + n);
		
//		4. 다음과 같이 출력하는 프로그램(보너스 문제)
//		*
//		**
//		***
//		****
//		*****
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
		

	}

}
