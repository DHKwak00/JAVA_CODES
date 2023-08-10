package edu.java.contact06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class ContactDAOImple implements ContactDAO, OracleQuery{
	// 싱글톤
	// 1. 자기 자신 타입의 변수 선언
	private static ContactDAOImple instance = null;
	
	// 2. 생성자
	private ContactDAOImple() {}
	
	// 3. 메소드 구현
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}
	
	private ArrayList<ContactDTO> list = new ArrayList<>();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	
	public int getSize() {
		return list.size();
	}
	
	@Override
	public int insert(ContactDTO dto) {
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 로드 성공");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			
			pstmt = conn.prepareStatement(SQL_INSERT);
			
			pstmt.setInt(1, dto.getContactId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getEmail());
			
			int result = pstmt.executeUpdate(); // 전송
			System.out.println("리턴값 = " + result + " 행이 삽입되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // 닫기
			try {
				pstmt.cancel();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return 1;
	}

	@Override
	public ArrayList<ContactDTO> select() {
		return list;
	}

	@Override
	public ContactDTO select(int contactId) {
		return list.get(contactId);
	}

	@Override
	public int update(int contactId, ContactDTO dto) {
		list.get(contactId).setPhone(dto.getPhone());
		list.get(contactId).setEmail(dto.getEmail());
		
		return 1;
	}

	@Override
	public int delete(int contactId) {
		list.remove(contactId);
		return 1;
	}
	
	
}
