package edu.java.array07;

public class ArrayMain07 {

	public static void main(String[] args) {
		System.out.println("배열 연습3");
		String test = "문자열입니다.";
		System.out.println(test);
		System.out.println("문자열의 길이 : " + test.length());
		
		for(int i = 0; i < test.length(); i++) {
			System.out.print(test.charAt(i) + " ");
		}
		
		// 문자열 배열 선언
		String[] subjects = {"국어", "영어", "수학", "프로그래밍"};
		
		// "영어"의 문자열 길이를 출력
		System.out.println(subjects[1].length());
		
		// 모든 subjects의 문자열 길이를 출력
		for(int i = 0; i < subjects.length; i++) {
			System.out.println("과목명 : " + subjects[i]);
			System.out.println("문자열 길이 : " + subjects[i].length());
		}
		
		for(String str : subjects) {
			System.out.println(str.length());
		}

	} // end main()

} // end ArrayMain07




