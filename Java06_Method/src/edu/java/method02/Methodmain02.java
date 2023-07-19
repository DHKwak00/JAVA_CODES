package edu.java.method02;

public class Methodmain02 {

	// 기능 : 두 개의 정수를 매개변수로 전달 받아서 두 정수의 합을 리턴
	// 메소드 이름 : add
	// 리턴타입 : int
	// 매개변수 : int x, int y 
	public static int add(int x, int y) {
//		int result = x + y;
		return x+y; // reasult;
	} // end add()
	
	// 기능 : 두 개의 정수를 매개변수로 전달 받아서 두 정수의 차을 리턴
		// 메소드 이름 : sub
		// 리턴타입 : int
		// 매개변수 : int x, int y 
	
	public static int mis(int x, int y) {
		int result = x + y;
		return x+y; // reasult;
	}
	
	public static double mul(int x, int y) {
		int result = x * y;
		return x*y; // reasult;
	}
	
	public static int div(int x, int y) {
		int result = x + y;
		return x/y; // reasult;
	}
	public static void main(String[] args) {
		System.out.println("메소드 연습");
		
		int result = add(10, 20);
		System.out.println("result = " + result);
		
		
//		double m = mul(1.5, 2.0);
//		System.out.println("m = " + m);
		
		double d =  div(3,2); // 자동 형 변환 가능성을 염두
		System.out.println("d = " + d);
		

	}

}
