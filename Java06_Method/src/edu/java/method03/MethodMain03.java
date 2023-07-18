package edu.java.method03;

import java.util.Scanner;

public class MethodMain03 {
	
	public static int total(int kor, int eng, int mth) {
		return kor + eng + mth;
	} // end total
	
	public static double totalAvg(int sum) {
		return sum / 3.0;
	} // end totalAvg
	
	public static char slcGrade(double avg) {
		char ch=' ';
		if(avg >=90) ch = 'A';
		else if(avg >= 80) ch = 'B';
		else if(avg >= 70) ch = 'C';
		else ch = 'F';
		return ch;
	} // end grade

	public static void main(String[] args) {
		// 1. 국어, 영어, 수학 점수를 정수로 입력 받아서 3개의 변수에 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수는?");
		int kor = sc.nextInt();
		System.out.println("영어 점수는?");
		int eng = sc.nextInt();
		System.out.println("수학 점수는?");
		int mth = sc.nextInt();
		
		sc.close();
		
		// 2. 입력받은 점수를 출력
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + mth);
		
		// 3. 메소드를 정의하여 세 과목의 총점을 출력
		int sum = total(kor, eng, mth); // 0 대신 메소드 호출
		System.out.println("총합 : " + sum);
		
		// 4. 메소드를 정의하여 세 과목의 평균울 출력(소수점까지 출력)
		double avg = totalAvg(sum); // 0대신 메소드 호출
		System.out.println("평균 : " + avg);
		
		// 5. 메소드를 정의하여 평군에 따른 등급을 출력
		// 예시)
		// 100 ~ 90 >> 'A'
		// 89 ~ 80 >> 'B'
		// 79 ~ 70 >> 'C'
		// 69 ~    >> 'F'
		char grade = slcGrade(avg); // 'F' 대신 메소드 호출
		System.out.println("등급 : " + grade);
		

	} // end main()

} // end MethodMain03
