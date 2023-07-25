package edu.java.interface06;

public class MemberDAOImple implements MemberDAO { // 인스턴스 제약 둠 (싱글톤 디자인 패턴으로)
	
	// 싱글톤 디자인 패턴 시작
	// 1. private static 자기 자신 타입의 변수 선언
	private static MemberDAOImple instance = null;
	
	// 2. private 생성자
	private MemberDAOImple() {}
	
	// 3. public static 메소드 - 인스턴스를 리턴하는 메소드 구현
	public static MemberDAOImple getInstance() {
		if(instance == null) {
			instance = new MemberDAOImple();
		}
		return instance;
	}
	private final int MAX = 100; // 최대 회원수
	private MemberDTO[] list = new MemberDTO[MAX]; // 회원 정보 저장할 배열
	private int size; // 배열에 저장될 데이터 개수 (어짜피 초기화는 0이라 선언x)
	
	public int getSize() {
		return size;
	}
	

	@Override
	public int insert(MemberDTO dto) {
		list[size] = dto;
		size++;
		return 1; // 0 : 실패, 1 : 성공
	}

	@Override
	public MemberDTO[] select() {
		
		return list;
	}

	@Override
	public MemberDTO select(int index) {
		return list[index];
	}

	@Override
	public int update(int index, MemberDTO dto) {
		list[index].setPw(dto.getPw());
		list[index].setEmail(dto.getEmail());
		return 1;
	}

}
