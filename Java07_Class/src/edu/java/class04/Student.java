package edu.java.class04;

public class Student {
	// 멤버 변수 (필드, 프로퍼티)
	int stuNo; // 학생 번호
	String name; // 학생 이름
	Scores scores; // 학생 점수
	
	public Student() {}

	public Student(int stuNo, String name, Scores scores) {
		this.stuNo = stuNo;
		this.name = name;
		this.scores = scores;
	}
	
	// 출력 메소드
	public void printStudentInfo() {
		System.out.println("--- 학생 정보 ---");
		System.out.println("번호 : " + stuNo);
		System.out.println("이름 : " + name);
//		System.out.println("국어 점수 : " + scores.korean);
		scores.printScores(); // 위와 같은 명령 (만든 메서드를 활용해 편의성 추구)
		System.out.println("총점 : " + scores.calcTotal());
		System.out.println("평균 : " + scores.calcAverage());
		
	} // end printStudentInfo()
	
	

} // end Student
