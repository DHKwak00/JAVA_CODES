package edu.java.homework;

public class MemberService {
	
	public boolean login(String id, String password) {		
		// id, password 주소값이 전송됨
		// id == "hong" : 주소값 비교
		// id.equals("hong") : 실제 데이터 비교
		
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
}




