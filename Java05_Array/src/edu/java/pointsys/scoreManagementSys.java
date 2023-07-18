package edu.java.pointsys;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 변수 명명 규칙
// 1. 첫 번째 글자는 문자이거나, '$', '_' 이어야 하고 숫자로 시작할 수 없다.(필수)
// 2. 영어 대소문자가 구분된다.(필수)
// 3. 첫 문자는 영어 소문자로 시작, 다른 단어가 붙을 경우 첫 문자만 대문자(관례)
// 4. 문자 수(길이)의 제한은 없다.
// 5. 자바 예약어는 사용할 수 없다.(필수)
// 		- boolean, byte, char, private, public, new, true, if 등등

public class scoreManagementSys {

	public static void main(String[] args) {
		System.out.println("<학생 점수 관리 프로그램>");
		
		System.out.println("학생 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("입력된 학생 수 : "+num);
		int[] arr = new int[num];
		Integer arr1[] = new Integer[arr.length];
		
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 점수입력 | 2. 점수리스트 | 3. 분석 | 4. 종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			int menu = sc.nextInt();
			if(menu == 1) {
				for(int i=0; i<num; i++) {
					System.out.println(i + "번 학생의 점수를 입력하세요>");
					arr[i] = sc.nextInt();
					arr1[i] = arr[i];
				} continue;
			}else if(menu == 2) {
				for(int i=0; i<num; i++) {
					System.out.println(i + "번 학생의 점수 : " + arr[i]);
				} continue;
			}else if(menu == 3) {
				Arrays.sort(arr1, Collections.reverseOrder());
				
				for(int i =0; i<num; i++) {
					System.out.println(i + "등 : " + arr1[i]);
				} continue;
			}else if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못된 입력값입니다.");
			} continue;
		}
		sc.close();
		
		
		
		
	} // end main()

} // end scoreManagementSys
