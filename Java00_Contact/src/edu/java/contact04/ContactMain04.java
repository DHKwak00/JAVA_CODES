package edu.java.contact04;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactMain04 {
	
	private static Scanner sc;
	private static ContactDAO dao;

	public static void main(String[] args) {
		System.out.println("연락처 프로그램 version 0.4");
		sc = new Scanner(System.in);
		dao = ContactDAOImple.getInstance();
		
		boolean run = true; // 반복문 종료용
		
		while(run) {
			showMainMenu();
			int choice = sc.nextInt(); // 메뉴 선택 저장
			
			switch (choice) {
			case Menu.INSERT:
				insertContact();
				break;
			case Menu.SELECT_ALL:
				selectAllContact();
				break;
			case Menu.SELECT_BY_INDEX:
				selectContactByIndex();
				break;
			case Menu.UPDATE:
				updateContact();
				break;
			case Menu.DELETE:
				deleteContact();
				break;
			case Menu.QUIT:
				run = false;
				System.out.println("프로그램이 종료되었습니다.");
				break;

			default:
				System.out.println("잘못된 번호 선택입니다. 0 ~ 5까지 선택해주세요.");
				break;
			}
		} // end while()

	} // end main()

	

	private static void showMainMenu() {
		System.out.println("-------------------------------------------------------");
		System.out.println("1. 등록 | 2. 전체검색 | 3. 상세검색 | 4. 수정 | 5. 삭제 | 0. 종료");
		System.out.println("-------------------------------------------------------");
		System.out.println("선택>");
	} // end showMainMenu()

	// contactList 배열에 contact 인스턴스를 저장
	private static void insertContact() {
		System.out.println("-------------");
		System.out.println("연락처 등록 메뉴");
		System.out.println("-------------");
		System.out.println("이름 입력>");
		String name = sc.next();
		System.out.println("전화번호 입력>");
		String phone = sc.next();
		System.out.println("이메일 입력>");
		String email = sc.next();
		
		ContactDTO dto = new ContactDTO(name, phone, email);
		
		int result = dao.insert(dto);
		int size = ((ContactDAOImple) dao).getSize();
		if(result == 1) {
			System.out.println("등록된 연락처 개수 : " + size);
			System.out.println("연락처 정보 등록 완료");
		}
		
		
	} // end insertContact()
	
	// 배열에 저장된 contact 데이터를 출력
	private static void selectAllContact() {
		ArrayList<ContactDTO> list = dao.select();
		
		int size = ((ContactDAOImple) dao).getSize();
		System.out.println("연락처 개수 : " + size);
		for(int i = 0; i < size; i++) {
			System.out.println("--- 연락처 " + i + " ---");
			System.out.println(list.get(i));
		}
		
	} // end selectAllContact()

	private static void selectContactByIndex() {
		System.out.println("---------------");
		System.out.println("검색할 인덱스 입력>");
		int index = sc.nextInt();
		
		int size = ((ContactDAOImple) dao).getSize();
		if(index >= 0 && index < size) {
			ContactDTO dto = dao.select(index);
			System.out.println(dto);
		} else {
			System.out.println("해당 인덱스에 연락처가 없습니다.");
		}
		
	} // end selectContactByIndex()
	
	private static void updateContact() {
		System.out.println("----------------");
		System.out.println("수정할 인덱스 입력>");
		int index = sc.nextInt();
		
		int size = ((ContactDAOImple) dao).getSize();
		
		if(index >= 0 && index < size) {

			System.out.println("전화번호 입력>");
			String phone = sc.next();
			System.out.println("이메일 입력>");
			String email = sc.next();

			ContactDTO dto = new ContactDTO("", phone, email);
			
			int result = dao.update(index, dto);
			if(result == 1) {
				System.out.println("연락처 수정 완료!");				
			}
		} else {
			System.out.println("해당 인덱스에 연락처가 없습니다.");
		}
		
	} // end updateContact()
	
	private static void deleteContact() {
		System.out.println("----------------");
		System.out.println("삭제할 인덱스 입력>");
		int index = sc.nextInt();
		int size = ((ContactDAOImple) dao).getSize();
		
		if(index >= 0 && index < size) {
			
			int result = dao.delete(index);
			if(result == 1) {
			System.out.println("연락처 삭제 완료!");				
			}
		} else {
		System.out.println("해당 인덱스에 연락처가 없습니다.");
		}
		
		
	} // end deleteContact
	
} // end ContactMain01












