package edu.java.if05;

import java.util.Scanner;

public class IfMain05 {

	public static void main(String[] args) {
		System.out.println("if - else if 문자 조건 연습");
		
		// 문자 하나를 입력 받아서, 그 글자가
		// 1) A ~ Z 면, "영대문자"라고 출력
		// 2) a ~ z 면, "영소문자"라고 출력
		// 3) 그 외 경우, "몰라요"라고 출력
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println("문자 하나를 입력하세요.");
		
		if(str.charAt(0)>=65 && str.charAt(0)<=90) System.out.println("영대문자"); // char 변수값 선언 후 범위 값을 ('A' <= ch && ch <= 'Z') 식도 가능
		else if (str.charAt(0)>=97 && str.charAt(0)<=122) System.out.println("영소문자");
		else System.out.println("몰라요");
		
		sc.close();

	}

}
