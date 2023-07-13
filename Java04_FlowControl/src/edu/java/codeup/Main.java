package edu.java.codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==n) {
				for(int k=n; k>=1; k--) {
					for(int l=1; l<=i; l++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
		

	}
}
