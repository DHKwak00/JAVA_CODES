package edu.java.class03;

// 이름 변경 단축키 : Alt + Shift + R
public class MyCircle {
	// 멤버 변수
	double radius;
	
	// 기본 생성자
	public MyCircle() {}
	
	// 매개변수가 있는 생성자
	public MyCircle(double radius) {
		this.radius = radius;
	}
	
	// 메소드
	public double calcArea() {
		return 3.14 * radius * radius;
	}
	
} // end MyCircle










