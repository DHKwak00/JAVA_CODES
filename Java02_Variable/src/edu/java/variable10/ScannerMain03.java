package edu.java.variable10;

import java.util.Scanner;

public class ScannerMain03 {

	public static void main(String[] args) {
		System.out.println("문자 하나 입력");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char ch = str.charAt(0); // 문자 하나 입력 후 저장
		System.out.println("ch = " + ch);
		
		sc.close();

	} // end main()

} // end ScannerMain03








