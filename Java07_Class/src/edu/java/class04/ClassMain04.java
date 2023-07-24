package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// Scores 클래스의 인스턴스 생성
		Scores scores1 = new Scores(50, 60, 70);
		
		// scores1의 모든 점수 출력
		scores1.printScores();
		System.out.println("평균 : " + scores1.calcAverage());
		
		Student stu1 = new Student(1, "진혁", scores1);
		stu1.printStudentInfo();
		// 진혁님의 점수 평균만 출력
		System.out.println(stu1.scores.calcAverage());
		
		Student stu2 = new Student(2, "둘리", new Scores(30, 40, 50));
		// 둘리의 총점 출력
		System.out.println("총점 : " + stu2.scores.calcTotal());
		
		
	} // end main()

} // end ClassMain04







