package edu.java.contact06;

import java.util.ArrayList;

public interface ContactDAO {
	
//	- 연락처 등록
	public abstract int insert(ContactDTO dto);
	
//	- 연락처 전체 리스트 검색
	public abstract ArrayList<ContactDTO> select();
	
//	- 연락처 정보 인덱스 검색
	public abstract ContactDTO select(int contactId);
	
//	- 연락처 정보 인덱스 수정
	public abstract int update(int contactId, ContactDTO dto);
	
//	- 연락처 정보 인덱스 삭제
	public abstract int delete(int contactId);
	
	
}
