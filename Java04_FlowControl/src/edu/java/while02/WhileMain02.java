package edu.java.while02;

import java.util.Scanner;

public class WhileMain02 {

	public static void main(String[] args) {
		System.out.println("while 구구단 연습");
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		int i = 1;
//		while(i <= 9) {
//			System.out.println(dan + " X " + i + " = " + dan * i);
//			i++;
//		}
		
		int d = 2;
		while(d <= 4) {
			System.out.println(d + "단");
			int i = 1;
			while(i <= 9) {
				System.out.println(d + " X " + i + " = " + d * i);
				i++;
			}
			d++;
		}
		
		// for문으로 구구단 출력하기
		// 단 : 4 ~ 8
		// 곱하는 수 : 2 ~ 7
		for(int x = 4; x <= 8; x++) {
			System.out.println(x + "단");
			for(int y = 2; y <= 7; y++) {
				System.out.println(x + " X " + y + " = " + x * y);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i + j < n) {
					System.out.print("*");					
				}
			}
			System.out.println();
		}

	} // end main()

} // end WhileMain02








