package edu.java.contact06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
//	private ArrayList<ContactDTO> list = new ArrayList<>();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	@Override
	public int insert(ContactDTO dto) {
		int result = 0;// int면 무조건 만들기**********************
		System.out.println("SQL_INSERT 시작");
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 로드 성공");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			
			pstmt = conn.prepareStatement(SQL_INSERT);
			
//			pstmt.setInt(1, dto.getContactId());
			// 첫 ?는 1
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getEmail());
			
			result = pstmt.executeUpdate(); // 전송
			System.out.println("리턴값 = " + result + " 행이 삽입되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // 닫기
			try {
				rs.close();
				pstmt.cancel();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	} // end insert()

	@Override
	public ArrayList<ContactDTO> select() {
		ArrayList<ContactDTO> list = new ArrayList<>(); // 위에 멤버변수로 선언 ㄴㄴ 이유는?
		
		System.out.println("전체 검색 시작");
		try {
			// 로드
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("드라이버 로드 성공");
			// DB와 연결
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			// connection객체로 statement 객체 생성
			pstmt = conn.prepareStatement(SQL_SELECT);
			System.out.println(SQL_SELECT);
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				int contactId = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				ContactDTO dto = new ContactDTO(contactId, name, phone, email);
				list.add(dto);
			}
			for(ContactDTO dto : list) {
				System.out.println(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
	} // select()

	@Override
	public ContactDTO select(int contactId) {
		ContactDTO dto = null; // ****************** 리턴값 먼저 만들어 놓기
		// 컨넥션
		
		System.out.println("인덱스 검색 시작");
		try {
			// 등록
			DriverManager.registerDriver(new OracleDriver());
			// DB와 연결
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			// Statement 객체 생성
			pstmt = conn.prepareStatement(SQL_SELECT_BY_CONTACT_ID);
			
			pstmt.setInt(1, contactId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				contactId = rs.getInt(1); 
				String name = rs.getString(2); 
				String phone = rs.getString(3);
				String email = rs.getString(4);
				
				/* ContactDTO */ dto = new ContactDTO(contactId, name, phone, email);
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list.get(contactId);
	} // select(int contactId)

	@Override
	public int update(int contactId, ContactDTO dto) {
		int result = 0;
		System.out.println("수정 시작");
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(SQL_UPDATE);
			
			pstmt.setInt(1, contactId);
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getEmail());
			
//			int result = pstmt.executeUpdate();
			result = pstmt.executeUpdate();
			System.out.println("리턴값 = " + result + " 행이 수정되었습니다.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return result;
	} // end update(int contactId, ContactDTO dto)

	@Override
	public int delete(int contactId) {
		int result = 0;
		System.out.println("삭제 시작");
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("DB 연결 성공");
			pstmt = conn.prepareStatement(SQL_DELETE);
			
			pstmt.setInt(1, contactId);
			
//			int result = pstmt.executeUpdate();
			result = pstmt.executeUpdate();
			System.out.println("리턴값 = " + result + " 행이 삭제되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return result;
	}
	
	
}
