package edu.java.while01;
// while 문
// - for문과 같은 반복문
// - 선언 형태
//  while(조건) {
//		(본문)
//	}
public class WhileMain01 {

	public static void main(String[] args) {
		System.out.println("while 반복문");
		
		// 0 ~ 10까지 출력
		int i=0;
		while(i <= 10) {
			System.out.println(i + " ");
			i++;
		}
		System.out.println();
		
		int x = 0;
		while(x >= 1) {
			System.out.println(x + " ");
			x--;
		}

	} //end Main

} // end WhileMain
