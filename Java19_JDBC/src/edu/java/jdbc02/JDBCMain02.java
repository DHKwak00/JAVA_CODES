package edu.java.jdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCMain02 {

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
			System.out.println("JDBC 2 - update");
			
			Connection conn = null;
			Statement stmt = null;
			
			try {
				//2. JDBC 드라이버를 메모리에 로드
				DriverManager.registerDriver(new OracleDriver());
				System.out.println("드라이버 로드 성공");
				
				//3. DB와 Connection(연결)을 맺음
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				System.out.println("DB 연결 성공");
				
				// 4. Connection 객체를 사용하여 Statement 객체를 생성 (여기까지 드라이버 연결)
				stmt = conn.createStatement();
				
				// 5. SQL 문장 작성 ***** 중요 (디벨로퍼에서 돌려보고 돌아가면 가져오기)
				// UPDATE EX_CONTACT
				// SET NAME = '둘리';
				// PHONT = '010-3333-3333';
				// EMAIL = 'dooli@test.com' WHERE CONTACT_ID = 2;
				String sql_update = 
						"UPDATE " + TABLE_NAME +
						" SET " + COL_NAME + " = '둘리', " +
						COL_PHONE + " = '010-2222-2222', " +
						COL_EMAIL + " = 'dooli@test.com' " +
						"WHERE " + COL_CONTACT_ID + " = 1";
				System.out.println(sql_update);
				
				// 6. SQL 문장 실행(DB 서버로 SQL 전송
				// executeUpdate() : INSERT, UPDATE, DELETE를 처리할 때 사용 (등록 수정 삭제 한 결과값만 가져오면 되서 같은 맥락 성공 OR 실패)
				// executeQuery() : SELECT를 처리할때 사용(테이블에서 SELECT로 집어 오면 결과값이 있음)
				int result = stmt.executeUpdate(sql_update);
				
				// 7. DB 서버가 보낸 결과 처리/확인
				System.out.println(result + "행이 수정되었습니다."); 
				// 디벨로퍼에서 insert와 자바에서 insert 차이 디벨에는 commit을 꼭 해줘야함 ***
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}finally { // 다 썼으면 닫아주자.
				try {
					stmt.cancel();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		} // end main()

} // end JDBCMain02 
