package edu.java.codeup;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class ArrayQuiz {
	public static void main(String[] args) {
//		// 빠진 카드
//		
////		10
////		1 2 3 4 5 6 7 8 9 10  - 55
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int a1 = sc.nextInt();
//		int a2 = sc.nextInt();
//		int a3 = sc.nextInt();
//		int a4 = sc.nextInt();
//		int a5 = sc.nextInt();
//		int a6 = sc.nextInt();
//		int a7 = sc.nextInt();
//		int a8 = sc.nextInt();
//		int a9 = sc.nextInt();
//		
//		int total = 0;
//		int sum = 0;
//		int[] arr = new int [n];
//		for(int i = 1; i<arr.length-1; i++) {
//			arr[i] = i;
//			total += arr[i];
//		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int[] nums = new int[n+1];
//		
//		for(int i = 0; i < n -1; i++) {
//			int k = sc.nextInt();
//			nums[k] = 1;
//			
//		}
//		for(int i=0; i<=n; i++) {
//			if(nums[i]==0) {
//				System.out.println(i);
//				break;
//			}
//		}

//		// 성실한 개미
//		
//		// 오른쪽 이동 기본, 벽(1) 만날시 밑으로, 시작 지점 (2,2)
////		1 1 1 1 1 1 1 1 1 1
////		1 9 0 1 0 0 0 0 0 1  
////		1 0 0 1 1 1 0 0 0 1
////		1 0 0 0 0 0 0 1 0 1
////		1 0 0 0 0 0 0 1 0 1
////		1 0 0 0 0 1 0 1 0 1
////		1 0 0 0 0 1 2 1 0 1
////		1 0 0 0 0 1 0 0 0 1
////		1 0 0 0 0 0 0 0 0 1
////		1 1 1 1 1 1 1 1 1 1
//		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		int arr[][] = new int[11][11]; // 10x10 이지만 인덱스(0,0)을 좌표(1,1)로 사용
//		for(int i=1; i<11; i++) {
//			for(int j=1; j<11; j++) {
//				
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));

		
		
		
//		// 이상한 출석 번호 부르기1
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] nums = new int[24];
//
//		for (int i = 0; i < n; i++) {
//			int k = sc.nextInt();
//			nums[k] = nums[k] + 1;
//		}
//
//		for (int i = 1; i <= 23; i++) {
//			System.out.print(nums[i] + " ");
//		}
		
		
		
//		// 이상한 출석 번호 부르기2
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		
//		for(int i = 0; i < nums.length; i++) {
//			int k = sc.nextInt();
//			nums[i] = k;
//		}
//		for(int i=nums.length-1; i>=0; i--) {
//			System.out.println(nums[i]+" ");
//		}
//		
//		
//		// 이상한 출석3
//		int min = Integer.max(n, :);
//		for(int i = 0; i < nums.length; i++) {
//			int k = sc.nextInt();
//			nums[i] = k;
//		
		
//		// 1405 : 숫자 로테이션
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		
//		for(int i = 0; i < nums.length; i++) {
//			int k = sc.nextInt();
//			nums[i] = k;
//		}
//		
//		for(int i=0; i <n; i++) {
//			for(int j = 0; j<n; j++) {
//				
//			}
//			System.out.print(nums[i] + " ");
//		}
//		System.out.println();
		
//		String myString = "AbCdEfG";
//		String pat = "aBc";
//		
//		String str1 = myString.toUpperCase();
//		String str2 = pat.toUpperCase();
//		
//		int answer = 0;
//		if(str1.contains(str2)) {
//			answer=1;
//		}else {
//			answer=0;
//		}
//		
//		String my_string = "ProgrammerS123";
//		int n = 11;
//		String answer = "";
//		answer = my_string.substring(0, n);
//		System.out.println(answer);
		
//		int[] num_list = {5, 7, 8, 3};
//		int answer = 0;
//	    int mul = 1;
//	    int sum = 0;
//	    
//	    for(int i=0; i<num_list.length; i++){
//	    	mul *= num_list[i];
//	        sum += num_list[i];
//	        }
//	    sum = sum * sum;
//	    System.out.println(mul);
//	    System.out.println(sum);
//	    if(mul < sum) {
//	    	answer=1;
//	    }else answer=0;
//	    System.out.println(answer);
		
		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		
		for(int i=0; i<num_list.length; i++) {
			if(num_list[i]<0) {
				System.out.println(num_list[i]);
			}
		}
		
		
		
		
		
	}
}
