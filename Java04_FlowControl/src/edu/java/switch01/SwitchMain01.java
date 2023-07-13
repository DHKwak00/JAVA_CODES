package edu.java.switch01;

import java.util.Scanner;

// switch - case 문
// - if문과 비슷하지만 비교 값을 정형화 하는 방식 ( 정형화 - 범위 값에는 불가능 )
// - 변수와 일치하는 값에 따라 해당 case 문이 실행 됨
// switch(변수) {
//		case 값1 : ...
//			break;
//		case 값2 : ...
//			break;
//		default : ...
//			break;

public class SwitchMain01 {

	public static void main(String[] args) {
		// ctrl + shift + f : 코드 자동 정렬 *****
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();

		System.out.println("if - else 문");
		if (a == 1) {
			System.out.println("1번 선택");
		} else if (a == 2) {
			System.out.println("2번 선택");
		} else {
			System.out.println("그 외 선택");
		}

		System.out.println("switch문");
		switch (a) {
		case 1:
			System.out.println("1번 선택");
			break;
		case 2:
			System.out.println("2번 선택");
			break;
		default:
			System.out.println("그 외 선택");
			break;
		}

	} // end main()

}
