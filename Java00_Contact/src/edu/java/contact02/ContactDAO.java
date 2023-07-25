package edu.java.contact02;
// 추상 메소드를 사용해서 기능 메소드들을 정의
public interface ContactDAO {
	// 기능 : 등록, 전체검색, 상세검색, 수정
	
	// 회원 등록
	public abstract int insert(ContactDTO dto);
	
	// 회원 전체 검색
	public abstract ContactDTO[] search();
	
	// 회원 상세 검색
	public abstract ContactDTO search(int index);
	
	// 회원 정보 수정
	public abstract int update(int index, ContactDTO dto);
}
