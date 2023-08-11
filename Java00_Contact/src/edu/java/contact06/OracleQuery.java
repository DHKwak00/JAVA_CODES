package edu.java.contact06;
// 1. DB 2. DTO 3. DAO

// JDBC에서 DB 접속에 사용될 상수들, SQL 문장들을 정의
public interface OracleQuery{
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
		
		
		// 연락처 데이터 등록
		public static final String SQL_INSERT =
				"INSERT INTO " + TABLE_NAME +
				" VALUES(CONTACT_SEQ.NEXTVAL, ?, ?, ?)";
		
		// 연락처 전체 리스트 검색
		public static final String SQL_SELECT = 
				"SELECT * FROM " + TABLE_NAME + 
				" ORDER BY " + COL_CONTACT_ID;
		
		
		// 연락처 정보 인덱스 검색
		public static final String SQL_SELECT_BY_CONTACT_ID = 
				"SELECT * FROM " + TABLE_NAME +
				" WHERE " + COL_CONTACT_ID + " = ?";
		
		// 연락처 정보 인덱스 수정
		public static final String SQL_UPDATE = 
				"UPDATE " + TABLE_NAME + " SET " +
						COL_NAME + " = ?, " +
						COL_PHONE + " = ?, " +
						COL_EMAIL + " = ? " +
						" WHERE " + COL_CONTACT_ID + " = ?";
		
		// 연락처 정보 인덱스 삭제
		public static final String SQL_DELETE =
				"DELETE " + TABLE_NAME +
				" WHERE " + COL_CONTACT_ID + " = ?";
		
				
		
}
