package edu.java.while02;

import java.util.Scanner;

public class WhileMain02 {

	public static void main(String[] args) {
		System.out.println("while 구구단 ");
		
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		
//		int i = 1;
//		while(i<=9) {
//			System.out.println(dan + " X " + i + "=" + dan * i);
//			i++;
//		}
		
		int d=2;
		while(d<=4) {
			System.out.println(d + "단");
			int i = 1;
			while(i<=9) {
				System.out.println(d + " X " + i + " = " + d*i);
				i++;
			}
			d++;
		}
		
		// for문으로 구구단 출력하기
		// 단 : 4 ~ 8
		// 곱하는 수 2 ~ 7
		
		for(int i = 4; i <= 8; i++) {
			for(int j = 2; j<=7; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
		
//		****
//		****
//		****
//		****
		for(int i=0; i< 4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		*****
//		****
//		***
//		**
//		*
		System.out.println("별 갯수 입력 : ");
		for(int i=0; i< n; i++) {
			for(int j=0; j<n; j++) {
				if(i + j < n) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
	
	}

}
