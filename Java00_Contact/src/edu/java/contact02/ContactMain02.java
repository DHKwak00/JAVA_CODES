package edu.java.contact02;

import java.util.Scanner;

public class ContactMain02 {
	private static Scanner sc = new Scanner(System.in);
	private static ContactDAO dao;
	
	public static void main(String[] args) {
		System.out.println("아직 모르겠다 연락처 프로그램");
		dao = ContactDAOImple.getInstance();
		
		boolean run = true;
		while(run) {
			firstMenu();
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case Menu.INSERT:
				insertContact();
				break;
			case Menu.SEARCH_ALL:
				seachAll();
				break;
			case Menu.SEARCH_DETAIL:
				searchDetail();
				break;
			case Menu.UPDATE:
				updateConact();
				break;
			case Menu.QUIT:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		
		
	} // end main()

	private static void firstMenu() {
		System.out.println("==============================================");
		System.out.println("1. 등록 | 2. 전체검색 | 3. 상세검색 | 4. 수정 | 0. 종료");
		System.out.println("==============================================");
		System.out.println("입력>");
	}

	private static void insertContact() {
		System.out.println(" == 회원 가입 ==");
		System.out.println("아이디를 입력하세요.");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요.");
		String pw  = sc.next();
		System.out.println("이메일을 입력하세요.");
		String email = sc.next();
		
		ContactDTO dto = new ContactDTO(id, pw, email);
		int num = dao.insert(dto);
		if(num == 1) {
			System.out.println("등록 완료!");
		}
	}

	private static void seachAll() {
		ContactDTO[] list = dao.search();
		int size = ((ContactDAOImple)dao).getSize();
		for(int i=0; i<size; i++) {
			System.out.println(list[i]);
		}
		
	}

	private static void searchDetail() {
		System.out.println();
		System.out.println("검색할 인덱스를 입력해주세요.");
		int index = sc.nextInt();
		
		int size = ((ContactDAOImple)dao).getSize();
		if(index >= 0 && index < size) {
			ContactDTO dto = dao.search(index);
			System.out.println(dto);
		}else {
			System.out.println("잘못된 인덱스를 입력하였습니다.");
		}
		
	}

	private static void updateConact() {
		System.out.println();
		System.out.println("검색할 인덱스를 입력해주세요.");
		int index = sc.nextInt();
		
		System.out.println("수정할 비밀번호를 입력해주세요");
		String pw = sc.next();
		System.out.println("수정할 이메일을 입력해주세요");
		String email = sc.next();
		
		ContactDTO dto = new  ContactDTO("", pw, email);
		int size = ((ContactDAOImple)dao).getSize();
		if(index >= 0 && index < size) {
			int result = dao.update(index, dto);
			if(result == 1) {
				System.out.println("수정 완료");
			}
		}else {
			System.out.println("잘못된 인덱스를 입력하였습니다.");
		}
	}

} // end ContactMain02
