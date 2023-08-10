package edu.java.jdbc01;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

// JDBC : Java DataBase Connection
// 0. JDBC 라이브러리를 프로젝트에 추가
//		1) 프로젝트에 lib 폴더 생성
//		2) C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
//			폴더에 있는 ojdbc6.jar 파일을 프로젝트의 lib 폴더에 복사
//		3) 복사한 jar 파일(라이브러리)을 build path에 추가
//			(마우스 우클 -> build path -> add to build path)

// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib

// 1. DB에 연동하기 위해 필요한 상수들을 정의
// 2. JDBC 드라이버를 메모리에 로드
// 3. DB와 Connection(연결)을 맺음
// 4. DB와 Connection 객체를 사용하여 Statement 객체를 생성
// 5. SQL 문장을 생성
// 6. Statement 객체를 사용하여 SQL 문장을 실행(DB 서버로 SQL 문장을 전송)
// 7. DB 서버가 보내준 결과를 확인/처리

public class JDBCMain01 {
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
		System.out.println("JDBC 1 - insert");
		
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
//			INSERT INTO EX_CONTACT 
//			VALUES(CONTACT_SEQ.NEXTVAL, 'AAA', '010-9999-9999', 'aaa@test.com');
			String sql_insert = "INSERT INTO " + TABLE_NAME
					+ " VALUES(CONTACT_SEQ.NEXTVAL, 'AAA', '010-9999-9999', 'aaa@test.com')";
			
			System.out.println(sql_insert);
			
			// 6. SQL 문장 실행(DB 서버로 SQL 전송
			int result = stmt.executeUpdate(sql_insert);
			
			// 7. DB 서버가 보낸 결과 처리/확인
			System.out.println(result + "행이 삽입되었습니다.");
			
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

}
