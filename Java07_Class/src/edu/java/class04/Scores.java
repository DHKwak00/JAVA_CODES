package edu.java.class04;

public class Scores {
	// 멤버 변수(필드, 프로퍼티)
	int korean; // 국어 점수
	int english; // 영어 점수
	int math; // 수학 점수
	
	public Scores() {}
	public Scores(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	// 세 과목의 총점을 리턴하는 메소드
	public int calcTotal() {
		return korean + english + math;
	} // end calcTotal()
	
	// 세 과목의 평균을 리턴하는 메소드
	public double calcAverage() {
		return (double) calcTotal() / 3;
	} // end calcAverage()
	
	// 세 과목의 각 점수를 출력하는 메소드
	public void printScores() {
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
	} // end printScores()
	
} // end Scores









