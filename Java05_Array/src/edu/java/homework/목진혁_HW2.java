package edu.java.homework;

public class 목진혁_HW2 {

	public static void main(String[] args) {
//		과제1 : 배열 6 8 4 2 5의 값 중에 최대값 출력하기
//		* 배열 직접 선언할 것!
		int[] arr1 = {6, 8, 4, 2, 5};
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] > max) {
				max = arr1[i];
			}
		}
		System.out.println("최대값 = " + max);

//		과제2 : 과제1의 배열(6 8 4 2 5)의 전체 합과 평균 값을 구하기
		int sum = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		
		System.out.println("합 = " + sum);
		System.out.println("평균 = " + ((double) sum ) / arr1.length);

//		과제3: 피보나치 수열 20개를 출력
//		피보나치(Fibonacci) 수열: 1, 1, 2, 3, 5, 8, 13, 21, ...
//		힌트)
//		f[0] = 1
//		f[1] = 1
//		f[n] = f[n-1] + f[n-2], n >= 2
//
//		1) 정수 20개를 저장할 수 있는 배열 선언
		int[] f = new int[20];
		
//		2) 배열의 인덱스 0번째, 1번째 원소는 1로 초기화
		f[0] = 1;
		f[1] = 1;
		
//		3) 배열의 인덱스 2번째 원소부터 19번째 원소까지는 반복문을 사용해서 초기화
		for(int i = 2; i < 20; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		
//		4) 배열의 내용을 출력
		for(int i = 0; i < 20; i++) {
			System.out.print(f[i] + " ");
		}

//		과제4: 
		
		int[][] array = {
			{95, 86}, 
			{44, 22, 96}, 
			{78, 83, 93, 87, 88}
		};
		
//		위 2차원 배열의 전체 합과 평균과 최대값 구하기

		System.out.println();
		int sum2 = 0;
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum2 += array[i][j];
				count++;
			}
		}
		System.out.println("전체 합 = " + sum2);
		System.out.println("평균 = " + ((double) sum2) / count);
		
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] > max2) {
					max2 = array[i][j];
				}
			}
		}
		System.out.println("최대값 = " + max2);

	}

}








