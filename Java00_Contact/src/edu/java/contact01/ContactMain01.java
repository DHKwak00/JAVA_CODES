package edu.java.contact01;

import java.util.Scanner;

public class ContactMain01 {
	public static final int MENU_QUIT = 0; // 종료
	public static final int MENU_INSERT = 1; // 등록
	public static final int MENU_SEARCH_ALL = 2; // 전체검색
	public static final int MENU_SEARCH_DETAIL = 3; // 상세검색
	public static final int MENU_MODIFY = 4; // 수정
	
	public static final int MAX = 100; // 연락처 최대 저장 개수
	
	// 연락처 저장 배열
	public static Contact[] contactList = new Contact[MAX];
	public static int count = 0; // 배열에 데이터를 저장하면 증가하는 count
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String name;
		String phone; // 그릇의 역할은 한번 쓰고 땡 느낌으로
		String email; // 지역 변수를 써야하는 이유 *************** 오답노트 적기
		Contact contact = new Contact();
		// 등록할 때 마다 객체를 초기화 (새로)
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.등록 | 2.전체검색 | 3.상세검색 | 4.수정 | 0.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택>");
			int select = sc.nextInt();
			
			switch(select) {
			case MENU_INSERT:
				System.out.println("등록");
				System.out.println("-------------------------------------------");
				System.out.println("이름>");
				name = sc.next();
				System.out.println("전화번호>");
				phone = sc.next();
				System.out.println("이메일>");
				email = sc.next();
				
				contact.setNo(count);
				contact.setName(name);
				contact.setPhone(phone);
				contact.setEmail(email);
				
				contactList[count] = contact;
				count++;
				
				System.out.println(contact.toString());
				continue; // end MENU_INSERT
				
			case MENU_SEARCH_ALL:
				for(Contact c: contactList) {
					System.out.println(c.toString());
				}
				break;
			case MENU_SEARCH_DETAIL:
				System.out.println("--------------------------------------------");
				System.out.println("3. 상세 검색");
				System.out.println("--------------------------------------------");
				System.out.println("인덱스>");
				int no = sc.nextInt();
				if(no == contact.getNo()) {
					System.out.println("이름 : " + contact.getName());
					System.out.println("전화번호 : " + contact.getPhone());
					System.out.println("이메일 : " + contact.getEmail());
				}
				break;
			case MENU_MODIFY:
				break;
			case MENU_QUIT:
				break;
				
				
			} // end switch
		} // end while
		

	} // end main()
	
//	public void save() {
//		String name;
//		String phone;
//		String email;
//		
//		Contact contact = new Contact();
//		
//		System.out.println("등록");
//		System.out.println("-------------------------------------------");
//		System.out.println("이름>");
//		name = sc.next();
//		System.out.println("전화번호>");
//		phone = sc.next();
//		System.out.println("이메일>");
//		email = sc.next();
//		
//		contact.setName(name);
//		contact.setPhone(phone);
//		contact.setEmail(email);
//
//		contactList[count] = contact;
//		count++;
//			System.out.println(contact.toString());
//	}


} // end ContactMain01
