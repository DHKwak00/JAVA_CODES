package edu.java.homework;

public class MemberServicemain {

	public static void main(String[] args) {
		// 과제 2. (확인문제 15번)
		MemberService memberService = new MemberService();
				
		memberService.login("hong", "12345");	
		memberService.logout("hong");

	}

}
