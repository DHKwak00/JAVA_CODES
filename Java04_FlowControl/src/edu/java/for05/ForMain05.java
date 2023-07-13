package edu.java.for05;

import java.util.Scanner;

public class ForMain05 {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		
		// 1 + 2 + 3 + ... + 10 계산
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		// 1 ~ 100까지 숫자 중 짝수들의 합을 출력
		
		int sum2 = 0;
		for(int i = 1; i<=100; i++) {
			if(i % 2 == 0) {
				sum2 += i;
			}
		}System.out.println(sum2);
		
		// 프로그래머스
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
        String str = sc.next();
        
        for(int i=0; i<str.length(); i++) {
        	char ch = str.charAt(i);
        	if(ch>=65 && ch<=95) {
        		System.out.print((char)(ch+32));
        	}else {
        		System.out.print((char)(ch-32));
        	}
        }

	}

}
