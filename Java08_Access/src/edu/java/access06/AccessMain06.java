package edu.java.access06;

import edu.java.access05.TestPublic;

public class AccessMain06 {

	public static void main(String[] args) {
		TestPublic test1 = new TestPublic();
		System.out.println(test1);
		
//		TestPackage test2 = new TestPackage();
//		System.out.println(test2);
		// 다른 패키지에 속한 클래스에서는 인스턴스 생성 불가능

	} //end main()

} // end AccessMain06
