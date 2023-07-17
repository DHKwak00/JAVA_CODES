package edu.java.homework;

import java.util.Arrays;

public class 곽동훈_HW2 {

	public static void main(String[] args) {
		
//		과제1 : 배열 6 8 4 2 5의 값 중에 최대값 출력하기
//		* 배열 직접 선언할 것!
		
		int[] arr = {6, 8, 4, 2, 5};
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
					max=arr[i];
			}
		}
		System.out.println(max);
		
//		과제2 : 과제1의 배열(6 8 4 2 5)의 전체 합과 평균 값을 구하기
		
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = sum/arr.length;
		System.out.println(sum);
		System.out.println(avg);
//
//		과제3: 피보나치 수열 20개를 출력
//		피보나치(Fibonacci) 수열: 1, 1, 2, 3, 5, 8, 13, 21, ...
//		힌트)
//		f[0] = 1
//		f[1] = 1
//		f[n] = f[n-1] + f[n-2], n >= 2
//
//		1) 정수 20개를 저장할 수 있는 배열 선언
//		2) 배열의 인덱스 0번째, 1번째 원소는 1로 초기화
//		3) 배열의 인덱스 2번째 원소부터 19번째 원소까지는 반복문을 사용해서 초기화
//		4) 배열의 내용을 출력
		
		int[] f = new int[20];
		
		f[0] = 1;
		f[1] = 1;
		for(int n=2; n<f.length; n++) {
			f[n] = f[n-1] + f[n-2];
		}
		System.out.println(Arrays.toString(f));
		
//		과제4: 
		int[][] array = {{95, 86}, {44, 22, 96}, {78, 83, 93, 87, 88}};
//		위 2차원 배열의 전체 합과 평균과 최대값 구하기
		int sum1 = 0;
		int avg1 = 0;
		int max1 = 0;
		int num = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum1 += array[i][j];
				if(max1 < array[i][j]) {
					max1 = array[i][j];
				}
			}
			num += array[i].length;
		}
		avg1 = sum1 / num;
		
		System.out.println(sum1);
		System.out.println(avg1);
		System.out.println(max1);
		
//
//		**보너스**
//		코드업 1402, 1403, 1405, 1411
		

	}

}
