package edu.java.contact03A;

import java.util.ArrayList;

// DAO(Data Access Object) :
// - 데이터의 전송을 담당하는 역할
public class ContactDAOImple implements ContactDAO{
	
	// 싱글톤 디자인 패턴 적용 시작
	// 1. private static 자기 자신 타입의 변수 선언
	private static ContactDAOImple instance = null;
	
	// 2. private 생성자
	private ContactDAOImple() {}
	
	// 3. public static 메소드 - 인스턴스를 리턴하는 메소드 구현
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}
	
//	private final int MAX = 100; // 최대 연락처 수
//	private ContactDTO[] list = new ContactDTO[MAX]; // 연락처 정보를 저장할 배열
	private ArrayList<ContactDTO> list = new ArrayList<>();
//	private int size; // 배열에 저장될 데이터 개수
	
	public int getSize() {
		return list.size();
	}

	@Override
	public int insert(ContactDTO dto) {
		list.add(dto);
//		size++;
		return 1;
	}

	@Override
	public ArrayList<ContactDTO> select() {
		return list;
	}

	@Override
	public ContactDTO select(int index) {
		return list.get(index);
	}

	@Override
	public int update(int index, ContactDTO dto) {
		list.get(index).setPhone(dto.getPhone());
		list.get(index).setEmail(dto.getEmail());
		return 1;
	}

	@Override
	public int delete(int index) {
		list.remove(index);
		return 1;
	}
	
	

} // end ContactDAOImple



