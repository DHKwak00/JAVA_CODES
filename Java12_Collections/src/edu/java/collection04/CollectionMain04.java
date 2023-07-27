package edu.java.collection04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		
		// 학생 정보(이름, 점수)를 3개 입력 받아서 list에 저장(반복문 사용)
		
		boolean run = true;
		
		while(run) {
			String name = sc.next();
			int math = sc.nextInt();
			int eng = sc.nextInt();
			Score scr = new Score(math, eng);
			Student stu = new Student(name, scr);
			list.add(stu);
		}
		
		
		// 전체 데이터 검색(출력)
		for(Student x : list) {
			System.out.println(x);
		}
		
		// 데이터 수정
		// 1번 인덱스의 학생 정보를 변경
		// 예시) 이름 : 둘리
		//		수학 : 100
		//		영어 : 50
		
		// 0번 인덱스 학생의 영어 점수만 변경
		
		// 변경된 리스트의 모든 데이터 출력
		
		// 데이터 삭제 : 1번 인덱스 학생의 모든 정도 삭제
	} //end main()

} // end CollectionMain04
