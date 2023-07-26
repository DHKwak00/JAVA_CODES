package edu.java.string04;

// String 클래스 : immutable 클래스(내용이 바뀌지 않는 클라스)
// StringBuffer, StrungBuilder : mutable 클래스

// StringBuffer ; Java 1.0 버전부터 사용된 클래서
// - 추가 삭제 속도가 느림
// - Thread-safe : 쓰레드에 안전한 클래스
// - 멀티쓰레드 환경에서 사용하시 적합

// StringBuiler ; Jave5.0 버전부터 사용됨
// - 추가/삭제 속도가 빠름
// - Thread-unsafe : 쓰레드에서 안전하지 않은 클래스
// - 싱글 쓰레드 환경에서 사용하기 적합
// 그외 모든 기능이 동일(동일한 기능의 메소드 )

public class StringMain04 {
	public static void main(String[] args) {
		// StringBuffer, StringBuiler 클래스
		StringBuffer buffer = new StringBuffer("abc");
//		StringBuffer buff = "abc";// 컴파일 에러
		
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer.hashCode());
		
		// append() : 문자열을 덧붙이는 메소드
		buffer.append("def").append("ghi");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer.hashCode());
		
		System.out.println();
		String str = "abc";
		System.out.println(System.identityHashCode(str));
		System.out.println(buffer.hashCode());
		
		str = str + "def"; // 안좋은 예
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		System.out.println(buffer.hashCode());
		
		// 여러개 연결시 버퍼나 빌더 사용
	} // end main()
	
} // StringMain04

 