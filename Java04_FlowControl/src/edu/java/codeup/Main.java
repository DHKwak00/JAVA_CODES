package edu.java.codeup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] nums = new int[n + 1];
		
		for(int i = 0; i < n - 1; i++) {
			int k = sc.nextInt();
			nums[k] = 1;
		}
		
		for(int i = 1; i <= n; i++) {
			if(nums[i] == 0) {
				System.out.println(i);
				break;
			}
		}
		

		
	} // end main()

} // end Main






