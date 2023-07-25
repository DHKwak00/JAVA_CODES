package edu.java.contact02;
// ContactDAO 구성(상속)받은 클래스
public class ContactDAOImple implements ContactDAO{
// 싱글 패턴을 사용하여 인스턴스를 생성, 
// ContactDAO.java의 추상 메소드들을 오버라이딩해서 실제 기능 메소드들을 구현

	// 싱글톤 사용
	// 싱글톤의 특성상 하나의 인스턴스로 사용
	private static ContactDAOImple instance = null;
	
	// private 생성자
	private ContactDAOImple () {}
	
	// public static한 싱글톤의 메소드
	public static ContactDAOImple getInstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
		
	}// end getInstance()
	
	private final int MAX = 100; // 최대 등록 갯수
	private ContactDTO[] list = new ContactDTO[MAX]; // 등록시 정보 저장 배열
	private int size; // 저장될 데이터 카운트(초기값 0)
	
	public int getSize() {
		return size;
	}
	
	@Override
	public int insert(ContactDTO dto) {
		list[size] = dto;
		size++;
		return 1;
	}

	@Override
	public ContactDTO[] search() {
		
		return list;
	}

	@Override
	public ContactDTO search(int index) {
		
		return list[index];
	}

	@Override
	public int update(int index, ContactDTO dto) {
		list[index].setPw(dto.getPw());
		list[index].setEmail(dto.getEmail());
		return 1;
	}
	
	
	
} // end ContactDAOImple
