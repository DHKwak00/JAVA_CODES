package edu.java.codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
//		// 1357 삼각형 출력하기 4
//		
////		for(int i=1; i<=n; i++) {
////			for(int j=1; j<=i; j++) {
////				System.out.print("*");
////			}
////			System.out.println();
////			if(i==n) {
////				for(int k=n; k>=1; k--) {
////					for(int l=1; l<=i; l++) {
////						System.out.print("*");
////					}
////					System.out.println();
////				}
////			}
////		}
//		 
////		n=4
////		i=0 | j=0
////		i=1 | j=0, 1
////		i=2 | j=0, 1, 2
////		i=3 | j=0, 1, 2, 3
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				if(i>=j)
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				if(i+j <= n-2) System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		// 삼각형 5
//		5
//		   * 
//		  ***
//		 *****
//		
//		n = 3, i = 2(n/2-1)
//		n = 5, i = 3
//		n = 7, i = 4
//		
//		i = 0, j = 0, 1, 2
//		i = 1, j = 0, 1, 2, 3
//		i = 2, j = 0, 1, 2, 3, 4
		
//		i = 0, j = 0, 1, 2
//		i = 0, j = 0, 1
//		i = 0, j = 0
		
		for(int i=0; i<n/2+1; i++) {
			for(int j=0; j<n/2+1+i; j++) {
				if(i + j < n /2) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}

		
		

	}
}
