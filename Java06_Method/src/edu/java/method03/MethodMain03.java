package edu.java.method03;

import java.util.Scanner;

public class MethodMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 국어, 영어, 수학 점수를 정수로 입력받아서 3개의 변수에 저장
		int korean = sc.nextInt();
		int english = sc.nextInt();
		int math = sc.nextInt();
		
		// 2. 입력받은 점수를 출력
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		
		// 3. 메소드를 정의하여 세 과목의 총점을 출력
		int sum = calcTotal(korean, english, math); // 0 대신 메소드 호출
		System.out.println("총합 : " + sum);
		
		// 4. 메소드를 정의하여 세 과목의 평균을 출력(소수점까지 출력)
		double avg = calcAverage(sum, 3); // 0 대신 메소드 호출
		System.out.println("평균 : " + avg);
		
		// 5. 메소드를 정의하여 평균에 따른 등급을 출력
		// 예시)
		// 100 ~ 90 => 'A'
		// 89 ~ 80 => 'B'
		// 79 ~ 70 => 'C'
		// 69 미만 => 'F'
		char grade = selectGrade(avg); // 'F' 대신 메소드 호출
		System.out.println("등급 : " + grade);

	} // end main()

	private static char selectGrade(double avg) {
		char result = 0;
		if(100 >= avg && avg >= 90) {
			result = 'A';
		} else if(avg >= 80) {
			result = 'B';
		} else if(avg >= 70) {
			result = 'C';
		} else {
			result = 'F';
		}
		return result;
	}

	private static double calcAverage(int sum, int i) {
		return (double) sum / i;
	}

	private static int calcTotal(int korean, int english, int math) {
		return korean + english + math;
	} // end calcTotal

} // end MethodMain03








