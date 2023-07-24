package edu.java.homework;

import java.util.Scanner;

public class MemberServiceMain {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String password = sc.next();
		
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
