package edu.java.homework;

public class MemberService {
	
//	String id;
//	String password; 
	// 해당 클래스에서 id pwd 값을 가지고 있지 않아도 되면 선언 X
	// 이 클래스에서는 값을 가질 필요 X
	public MemberService() {}
	
	
	public boolean login(String id, String password) {
		// id, password 주소값이 전송됨
		// id == "hong" : 주소값 비교
		// id.equals("hong") : 실제 데이터 비교
		
		if(id.equals("hong") && password.equals("12345") == true) {
			System.out.println("로그인 되었습니다.");

			return true;
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
			return false;
		}
	} // end login()
	
	public void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	} // end logout()
	

} // end MemberService
