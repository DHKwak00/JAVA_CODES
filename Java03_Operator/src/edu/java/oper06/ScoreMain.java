package edu.java.oper06;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		System.out.println("총점 및 평균 계산 프로그램");
		
		// 1. 입력받을 준비 : Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 국어, 영어, 수학 점수를 정수로 입력받아서 각 변수에 저장
		//    - 변수 3개 직접 생성
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		// 3. 국어, 영어, 수학 점수를 출력
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		// 4. 총점을 계산하여 출력
		int sum = kor + eng + math;
		System.out.println("총점 : " + sum);
		
		// 5. 평균을 계산하여 출력(소수점 셋째 자리까지)
		double average = sum / 3.0;
		System.out.printf("평균 : %.3f", average);
		
		sc.close();

	} // end main()

} // end ScoreMain



