package edu.java.if06;

import java.util.Scanner;

public class IfMain06 {

	public static void main(String[] args) {
		System.out.println("if 중첩문 연습");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();

		// 입력된 num 값이 짝수인 경우 "짝수" 출력
		// 입력된 num 값이 홀수인 경우 "홀수" 출력
		// 입력된 num 값이 짝수이면서, 4의 배수이면 "4"의 배수 출력, 4의 배수가 아니면 "4의 배수가 아닌 짝수 출력"
		
		if(num % 2 == 0) { // 짝수일 때
			System.out.println("짝수");
			if(num % 4 == 0) { // 4의 배수일때
				System.out.println("4의 배수");
			}else { // 4의 배수가 아닐 때
				System.out.println("4의 배수가 아닌 짝수 출력");
			}
		}else { // 홀수일 때
			System.out.println("홀수");
		}
	}

}