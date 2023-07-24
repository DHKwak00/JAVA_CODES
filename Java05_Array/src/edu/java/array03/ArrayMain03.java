package edu.java.array03;

import java.util.Scanner;

public class ArrayMain03 {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		
		Scanner sc = new Scanner(System.in);
		// Ctrl + Shift + o : 자동 import 단축키
		
		// n명의 학생 점수를 입력받아
		// 총합, 평균, 최대값, 최소값 출력
		
		System.out.println("입력받을 점수 개수>");
		int n = sc.nextInt();
		int[] scores = new int[n];
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] 점수 입력>");
			scores[i] = sc.nextInt();
		}
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		
		// 배열에 저장된 모든 점수의 합 출력
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("합계 = " + sum);
		
		// 평균 출력하기(소수점까지 표현)
		double avg = ((double)sum) / n;
		System.out.println("평균 = " + avg);
		
		// 배열 값 중 최대값 출력
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > max) { // 배열에 저장된 값이 max보다 큰 경우
				max = scores[i];
			}
		}
		System.out.println("최대값 = " + max);
		
		// 배열 값 중 최소값 출력
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("최소값 = " + min);
		
	
	} // end main()

} // end ArrayMain03








