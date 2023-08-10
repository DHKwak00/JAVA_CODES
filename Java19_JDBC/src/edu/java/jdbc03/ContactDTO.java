package edu.java.jdbc03;

public class ContactDTO {
	private int contactid;
	private String name;
	private String phone;
	private String email;
	
	public ContactDTO() {}

	public ContactDTO(int contactid, String name, String phone, String email) {
		this.contactid = contactid;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ContactDTO [contactid=" + contactid + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
	
} // end ContactDTO
