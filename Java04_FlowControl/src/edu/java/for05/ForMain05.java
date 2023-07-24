package edu.java.for05;

import java.util.Scanner;

public class ForMain05 {

	public static void main(String[] args) {
		System.out.println("for문 연습");

		// 1 + 2 + 3 + ... + 10 계산하기
		int sum1 = 0;
		for(int i = 1; i <= 10; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		
		// 1 ~ 100까지의 숫자 중 짝수들의 합을 출력
		// 2 + 4 + 6 + 8 + ... + 96 + 98 + 100
		
		int sum2 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum2 = sum2 + i;				
			}
		}
		System.out.println(sum2);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("첫 번째 글자 : " + str.charAt(0));
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("마지막 글자 : " + str.charAt(str.length() - 1));
		
		
		
	} // end main()

} // end ForMain05








