package edu.java.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import oracle.jdbc.OracleDriver;

public class JDBCMain03 {

	// 1. DB 연결에 사용할 상수들
			public static final String URL =
					"jdbc:oracle:thin:@localhost:1521:xe";
			public static final String USER = "scott";
			public static final String PASSWORD = "tiger";
			
			// 내가 쓰고 싶은 테이블의 정보를 가져와야함
			public static final String TABLE_NAME = "EX_CONTACT";
			public static final String COL_CONTACT_ID = "CONTACT_ID";
			public static final String COL_NAME = "NAME";
			public static final String COL_PHONE = "PHONE";
			public static final String COL_EMAIL = "EMAIL";
			
			
			public static void main(String[] args) {
				System.out.println("JDBC 3 - Select all");
				
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null; // select query 결과 저장할 클래스
				
				try {
					//2. JDBC 드라이버를 메모리에 로드
					DriverManager.registerDriver(new OracleDriver());
					System.out.println("드라이버 로드 성공");
					
					//3. DB와 Connection(연결)을 맺음
					conn = DriverManager.getConnection(URL, USER, PASSWORD);
					System.out.println("DB 연결 성공");
					
					// 4. Connection 객체를 사용하여 Statement 객체를 생성 (여기까지 드라이버 연결)
					stmt = conn.createStatement();
					
					// 5. SQL 문장 작성
					// SELECT * FROM EX_CONTACT ORDER BY CONTACT_ID;
					String sql_select =
							"SELECT * FROM " + TABLE_NAME +
							"ORDER BY " + COL_CONTACT_ID;
					System.out.println(sql_select);
					
					// 6. SQL 문장 실행(DB 서버로 SQL 전송)
					rs = stmt.executeQuery(sql_select); // 받아 오기 (값이 있어 담는 그릇 필요)
					
					// 7. DB 서버가 보낸 결과 확인/처리
					// ResultSet.next() : 
					// ResultSet에서 다음 행(row or record)이 있으면
					// true를 리턴하고, ResultSet이 가리키는 위치를 다음 위치로 변경
					
					ArrayList<ContactDTO> list = new ArrayList<>();
					while(rs.next()) { // 레코드가 존재할 때까지 반복
						System.out.println("t");
						System.out.println(rs.getInt(1));
						System.out.println(rs.getNString(2)); // 두번째 컬럼(name) 컬럼타입에 맞게끔
						
						int contactId = rs.getInt(1); // CONTACRT_ID 컬럼
						String name = rs.getString(2); // NAME 컬럼
						String phone = rs.getString(3); // PHONE 컬럼
						String email= rs.getString(4); // EMAIL 컬럼
						
						ContactDTO dto = new ContactDTO(contactId, name, phone, email);
						list.add(dto);
						
						for(ContactDTO dto1 : list) {
							System.out.println(dto1);
						}
					
					} // end while
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}finally { // 다 썼으면 닫아주자.
					try {
						rs.close();
						stmt.cancel();
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			} // end main()

}
