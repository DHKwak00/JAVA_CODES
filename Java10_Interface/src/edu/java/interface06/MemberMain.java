package edu.java.interface06;

import java.util.Scanner;

// MVC 디자인 패턴에서 View 클래스
// - UI를 담당하는 역할
public class MemberMain {
	private static Scanner sc;
	private static MemberDAO dao; // MemberDAOImple 인스턴스를 저장할 변수

	public static void main(String[] args) {
		System.out.println("회원 관리 프로그램");
		sc = new Scanner(System.in);
		dao = MemberDAOImple.getInstance(); // 다형성, 싱글톤 인스턴스 생성
		
		boolean run = true;
		while(run) {
			showMainMenu();
			int choice = sc.nextInt();
			
			switch (choice) {
			case Menu.INSERT:
				insertMember();
				break;
			case Menu.SELECT_ALL:
				selectAll();
				break;
			case Menu.SELECT_BY_INDEX:
				selectByIndex();
				break;
			case Menu.UPDATE:
				updateMember();
				break;
			case Menu.QUIT:
				run = false;
				break;
			default:
				System.out.println("다시 선택하세요.");
				break;
			}
		}
		
	} // end main()

	private static void showMainMenu() {
		System.out.println("----------------------------------------------");
		System.out.println("1. 등록 | 2. 전체검색 | 3. 상세검색 | 4. 수정 | 0. 종료");
		System.out.println("----------------------------------------------");
		System.out.println("선택>");
		
	} // end showMainMenu()

	private static void insertMember() {
		System.out.println();
		System.out.println("--- 회원 정보 등록 ---");
		System.out.println("아이디 입력>");
		String id = sc.next();
		System.out.println("비밀번호 입력>");
		String pw = sc.next();
		System.out.println("이메일 입력>");
		String email = sc.next();
		
		MemberDTO dto = new MemberDTO(id, pw, email);
		int result = dao.insert(dto);
		if(result == 1) {
			System.out.println("회원 정보 등록 완료");
		}
		
	} // end insertMember()

	private static void selectAll() {
		MemberDTO[] list = dao.select();
		int size = ((MemberDAOImple)dao).getSize();
		for(int i=0; i<size; i++) {
			System.out.println("회원 정보 [" + i + "]");
			System.out.println(list[i]);
		}
		
	}

	private static void selectByIndex() {
		System.out.println();
		System.out.println("검색할 인덱스를 입력>");
		int index = sc.nextInt();
		
		int size = ((MemberDAOImple)dao).getSize();
		if(index >= 0 && index < size) {
			MemberDTO dto = dao.select(index);
			System.out.println(dto);
		}else {
			System.out.println("존재하지 않은 인덱스입니다.");
		}
		
	} // end selectByIndex()

	private static void updateMember() {
		System.out.println("회원 정보 수정");
		System.out.println("인덱스 입력>");
		int index = sc.nextInt();
		
		System.out.println("비밀번호 입력>");
		String pw = sc.next();
		System.out.println("이메일 입력>");
		String email = sc.next();
		
		MemberDTO dto = new MemberDTO("", pw, email);
		
		int size = ((MemberDAOImple)dao).getSize();
		if(index >= 0 && index < size) {
			int result = dao.update(index, dto);
			if(result == 1) {
				System.out.println("회원 정보 수정 완료");
			}
		}else {
			System.out.println("존재하지 않은 인덱스입니다.");
		}
		
	}

} // end MemberMain
