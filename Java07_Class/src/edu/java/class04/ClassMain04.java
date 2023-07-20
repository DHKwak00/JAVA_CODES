package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// Scores 클래스의 인스턴스 생성 : 
		Scores scores1 = new Scores(50, 60, 70);
		
		// scores1의 모든 점수 출력
		scores1.printScores();
		System.out.println("평균 : " + scores1.calcAverage());
		
		Student	stu1 = new Student(1, "동훈", scores1);
		stu1.printStudentInfo();
		// 동훈님의 점수 평균만 출력
		System.out.println(stu1.scores.calcAverage());
		
		Student stu2 = new Student(2, "둘리", new Scores(30, 40, 50)); // 인스턴스를 생성 후(socres1)를 대신해 직접 넣기도 가능
		// 둘리의 총점 출력
		System.out.println("총점 : " + stu2.scores.calcTotal());
		
		
	} // end main()

} // end ClassMain
