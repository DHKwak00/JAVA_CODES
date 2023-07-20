package edu.java.access08;

import java.util.Scanner;

// * Java Runtime Environment(JRE)
// - java 애플리케이션을 생성하고 실행하기 위한 구성 요소
// - JRE는 Java 개발도구(Java Development Kit, JDK)의 일부
// - 운영체제와 java 프로그램 사이에서 조정 역할을 수행

// * JVM(JAVA virtual Machine)
// - java 바이트 코드를 실행하는 주체(sw)
// - 특정 공간을 할당하여 메모리 관리

// JVM이 관리하는 메모리 영역: 
// - stack(스텍)  : 지역 변수들이 저장되는 메모리 어영여
// - heap(힙) :" 인스턴스(참조 자료형)가 저장되는 메모리 영영ㄱ
// - Method(매소드) : static으로 선언한 변수, 메소드릐 실행 코드들이 저장되는 메모리 영역

// * final 제한자
// - 초기화된 값을 바꿀 수 없음.
// - final : 최종적인, 변경할 수 없는
// - final + 멤버 변수, 지역 변수 : 상수 (한 번 초기화된 값을 변경할 수 없는 변수)
// - final + 메소드 : override 할 수 없는 메소드
// - final + 클래스 : 상속을 허용하지 않는 클래스

public class AccessMain08 {
	public static final int MENU_INSERT = 1;
	public static final int MENU_DELETE = 2;

	public static int test = 100;

	public static void main(String[] args) {
		AccessMain08 access = new AccessMain08();
		System.out.println(access);
		
		test =20;
		System.out.println(test);
		
		String str = "test";
		// "test"는 힙 영역에 메모리 차지
		// str에 주소값이 저장
		
		str = "grbage"; // str에 "garbage"의 주소값이 저장
		// test는 힙 영역에서 삭제되지 않음
		// 이러한 객체를 스레기 값이라고 하며,
		// 자바는 Garbage Collector를 이용하여 쓰레기 값을 자동으로 제거
		
		System.out.println("1. 등록 2. 삭제");
		System.out.println("메뉴 선택>");
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		switch(select) {
		case MENU_INSERT:
			System.out.println("등록");
			break;
		case MENU_DELETE:
			System.out.println("삭제");
			break;
		}
		
		// 멤버 변수 : 클래스 단계에서 선언된 변수
		// 지역 변수 : 메소드나 특정 위치에 포함된 곳에서 선언된 변수
		
		int x = 10;
		final int y = 10;
		
		x = 123;
//		y = 100; // final 변수는 처음 초기화된 값을 변경할 수 없음
		

	} // end main()

} // AccessNaib08
