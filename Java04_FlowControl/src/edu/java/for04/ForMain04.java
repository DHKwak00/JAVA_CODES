package edu.java.for04;

public class ForMain04 {

	public static void main(String[] args) {
		System.out.println("for문 연습");
		
		// 1. 1 ~ 10까지 숫자 중
		// 각 숫자가 홀수면 "홀수", 짝수면 "짝수"가 출력되는 코드 작성
		for(int x = 1; x <= 10; x++) {
			if(x % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
		
		// 2. for문과 if문을 활용하여 아래 출력 결과가 나오는 코드 작성
		/*
		 *  1꼬마 2꼬마 3꼬마 인디언
		 *  4꼬마 5꼬마 6꼬마 인디언
		 *  7꼬마 8꼬마 9꼬마 인디언
		 *  10꼬마 인디언 보이~
		*/
		
		for(int x = 1; x <= 10; x++) {
			System.out.print(x + "꼬마 ");
			if(x % 3 == 0) {
				System.out.println("인디언");
			} else if(x % 10 == 0) {
				System.out.println("인디언 보이~");
			}
		}
		
	} // end main()

} // end ForMain04








