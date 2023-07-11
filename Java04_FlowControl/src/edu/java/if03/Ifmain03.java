package edu.java.if03;

import java.util.Scanner;

public class Ifmain03 {
	public static void main(String[] args) {
		System.out.println("if - else if - else 문");
		// if(조건1) {본문A} else if (조건B) {본문B} .. else {본문c}
		// - 조건1이 참일 경우 본문 A, 조건 2가 참일 경우 본문B
		// 둘다 아닐경우 본문c를 실행
		// - else if 절은 1개 이상 작성 가능
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("양수");
		}else if(x == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
			
			
		}
		
		
		
		
		

		
	} 

}
