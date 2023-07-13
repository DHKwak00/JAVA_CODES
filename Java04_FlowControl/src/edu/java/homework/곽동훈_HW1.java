package edu.java.homework;

public class 곽동훈_HW1 {

	public static void main(String[] args) {
//		1. 반복문을 사용해서, 'A'부터 'Z'까지 출력하는 프로그램
		
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char) i);
		}
		
		System.out.println();
		System.out.println();

//		2. While문과 Math.random() 함수를 이용해서 두 개의 주사위를 던졌을 때 나오는
//		눈의 합이 5이면 실행을 멈추고 5가 아니면 주사위를 계속 던지는 코드를 작성
//		예시) 합의 5가 나올때까지 아래와 같이 실행
//		(1, 3)
//		(2, 6)
//		(3, 1)
//		(4, 1) // 끝
		
		int a = 0;
		int b = 0;
		while (true) {
			double rA = Math.random();
			double rB = Math.random();

			a = (int) (6 * rA + 1);
			b = (int) (6 * rB + 1);
			System.out.println("(" + a + ", " + b + ")");
			if(a + b == 5) {
				break;
			}
		}
		
		System.out.println();

//		3. 숫자가 1 + (-2) + 3 + (-4) + 5 + ... + n 형태로 더해진다. (n은 값이 정해지지 않았음)
//		sum = 1 + (-2) + 3 + (-4) + 5 + ... + n 의 값이 100 이상으로 넘어갔을 때의 n의 값과 sum의 값을 출력
		
		int sum = 0;
		int n = 0;
		
		while(true) {
			n++;
			if(n % 2 == 0) {
				sum = sum - n;
			}else {
				sum = sum + n;
			}
			if(sum>=100) {
				break;
			}
		}
		System.out.println(n);
		System.out.println(sum);
		
		System.out.println();

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
		
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num; i >= 1; i--) {
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
//				if(i > j) {
//					System.out.println(" ");
//				}else {
//					System.out.println("*");
//				}
			}
			System.out.println();
		}
		
		

	} // end main()

} // end 곽동훈_HW1
