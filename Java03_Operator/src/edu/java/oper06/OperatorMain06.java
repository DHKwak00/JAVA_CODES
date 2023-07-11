package edu.java.oper06;

import java.util.Scanner;

public class OperatorMain06 {
	public static void main(String[] args) {
		
		// 1. 입력 받을 준비 : Scanner 생성
		
		// 2. 국 영 수 점수를 정수로 입력 받아서 각 변수에 저장 - 변수 3개 직접 생성
		
		// 3. 국 영 수 점수를 출력
		
		// 4. 총점을 계산하여 출력
		
		// 5. 평균을 계산하여 출력(소수점 셋쨰 자리까지)
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("국어 점수를 입력 하세요.");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력 하세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력 하세요.");
		int mth = sc.nextInt();
		
		int sum = kor + eng + mth;
		double avg = sum / 3.0;
		
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mth);
		
		System.out.println("총 과목의 총점 : " + sum);
		System.out.printf("총 과목의 평균 %.3f: ", avg);
		
		sc.close();
	
		
		
	} // end main()
	
} // end OperatorMain06
