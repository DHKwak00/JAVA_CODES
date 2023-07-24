package edu.java.contact02;

import java.util.Scanner;

public class contactMain {
	public static final int MENU_QUIT = 0; // 종료
	public static final int MENU_INSERT = 1; // 등록
	public static final int MENU_SEARCHALL = 2; // 전체 검색
	public static final int MENU_SEARCHDETAIL = 3; // 상세 검색
	public static final int MENU_FIX = 4; // 수정
	
	public static final int MAX = 100; // 연락처 최대 저장 개수
	public static int count = 0;
	
	public static Scanner sc = new Scanner(System.in);
	public static Contact[] contacts = new Contact[MAX];

	public static void main(String[] args) {
		System.out.println("다시 만들어 보는 연락처 프로그램");
		
		boolean run = true; // while용
		
		while (run) {
			firstMenu(); // 메뉴 호출
			int select = sc.nextInt();
			
			switch (select) {
			case MENU_INSERT: // 등록
				signUp();
				break;
			
			case MENU_SEARCHALL:
				for(int i=0; i<count; i++) {
					System.out.println(i + "번");
					System.out.println(contacts[i].toString());
				}
			case MENU_SEARCHDETAIL:
				detail();
				break;
			
			case MENU_FIX:
				
			default:
				break;
			}
		} // end while
		
	} // end main()
	
	public static void firstMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1.등록 | 2.전체검색 | 3.상세검색 | 4.수정 | 0.종료");
		System.out.println("------------------------------------------");
		System.out.println("선택>");
	} // end firstMenu
	
	public static void signUp() {
		System.out.println("---------------------");
		System.out.println("이름>");
		String name = sc.next();
		System.out.println("전화번호");
		String phone = sc.next();
		System.out.println("이메일");
		String email = sc.next();
		
		Contact c = new Contact(name, phone, email);
		contacts[count] = c;
		count++;
	} // end signUp()
	
	public static void detail() {
		System.out.println("인덱스 번호를 입력해 주세요.");
		int idx = sc.nextInt();
		System.out.println("이름 : " + contacts[idx].name);
		System.out.println("전화번호 : " + contacts[idx].phone);
		System.out.println("이메일 : " + contacts[idx].email);
		
	} // end detail()

} // end contactMain
