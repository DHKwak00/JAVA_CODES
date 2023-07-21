package edu.java.access02;

import java.util.Scanner;

import edu.java.access01.Test01; // 출처

public class AccessMain02 {

	public static void main(String[] args) {
		// ctrl + shift + o : 자동 import 
		Scanner sc = new Scanner(System.in);
		Test01 t1 = new Test01();
//		t1.n1 = 100; // private : 접근 불가
//		t1.n2 = 200; // (package) : 다른 패키지에 있으므로 접근 불가
//		t1.n3 = 300; // protected : 다른 패키지고, 상속 받지 않았으므로 접근 불가
		t1.n4 = 400; // public : 어디서든 접근 가능
		
		sc.close();
	} // end main()

} // end AccessMain02
