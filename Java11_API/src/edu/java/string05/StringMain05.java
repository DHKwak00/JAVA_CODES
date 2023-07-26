package edu.java.string05;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringMain05 {

	public static void main(String[] args) {
		System.out.println("정규표현식 연습");
		
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		
		String regExp = "(02|032|010-\\d{3,4}-\\{4}";
		// (02|032|010) : 02 또는 032 또는 010으로 시작
		// - : '-' 기호 확인
		// \d{3,4} : 3~4자리 숫자
		// \d{4} : 4자리의 숫자
		
		boolean result = Pattern.matches(regExp, data); // 정규표현식을 알아서 비교 해줌
		if(result) {
			System.out.println("정상적인 전화번호입니다.");
		}else {
			System.out.println("잘못된 전화번호입니다.");
		}

	} //end main()

} // end StringMain05
