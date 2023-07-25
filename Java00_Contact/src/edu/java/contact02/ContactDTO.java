package edu.java.contact02;

public class ContactDTO {
	// 멤버 변수
	private String id; // 회원 ID
	private String pw; // 회원 PASSWORD
	private String email; // 회원 EMAIL
	
	// 생성자
	public ContactDTO() {}
	
	public ContactDTO(String id, String pw, String email) {
		this.id = id;
		this.pw = pw;
		this.email = email;
	}

	// getter , setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// toString()
	@Override
	public String toString() {
		return "ContactDTO [id=" + id + ", pw=" + pw + ", email=" + email + "]";
	}
	
	

}
