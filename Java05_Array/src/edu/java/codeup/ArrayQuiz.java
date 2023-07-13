package edu.java.codeup;

import java.util.Scanner;

public class ArrayQuiz {
	public static void main(String[] args) {
		// 빠진 카드
		
//		10
//		1 2 3 4 5 6 7 8 9 10  - 55
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		int a5 = sc.nextInt();
		int a6 = sc.nextInt();
		int a7 = sc.nextInt();
		int a8 = sc.nextInt();
		int a9 = sc.nextInt();
		
		int total = 0;
		int sum = 0;
		int[] arr = new int [n];
		for(int i = 1; i<arr.length-1; i++) {
			arr[i] = i;
			total += arr[i];
		}
		
		
		
	}
}
