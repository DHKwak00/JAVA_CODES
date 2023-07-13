package edu.java.for03;

public class ForMain03 {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		
		// 1~100까지 정수 중에서 10의 배수들만 출력
		// 1  2 3  4 5 6 7 8 9 10
		
		for(int i=1; i<=100; i++){
			System.out.print(i + " ");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
			
	}

}
