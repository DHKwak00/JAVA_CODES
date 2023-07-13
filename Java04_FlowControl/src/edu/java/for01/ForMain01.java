package edu.java.for01;

// for 반복문
// - 반복 수행을 하기 위한 키워드
// - for(초기식; 조건식; 증감식) {
//			본문
//   }

// - 초기값을 증감시켜서 조건식이 false가 될 때까지 본문을 반복
// - 실행 순서
// 1) 초기식 2) 조건식 3) 본문 4) 증감식

public class ForMain01 {
	
	public static void main(String[] args) {
		System.out.println("for문 반복");
		// 1 ~ 10까지 출력
		// 1 2 3 4 5 6 7 8 9 10
		for(int i=1; i<=10; i++) {
//			System.out.println(i);
			System.out.print(i + " ");
			
		}
		System.out.println();
		
		// 1 3 5 7 9 출력
		for(int i=1; i<10; i = i+2) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		// 15 14 13 12 11 ... 2 1
		for(int i=15; i>=1; i--) {
			System.out.print(i + " ");
		}
	}

}