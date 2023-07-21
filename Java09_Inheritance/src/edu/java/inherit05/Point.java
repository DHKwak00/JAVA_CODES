package edu.java.inherit05;

public class Point {
	
	// 멤버 변수
	private double x;
	private double y;
	
	// 생성자
	public Point() {}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		
		return "(" + x + ", " + y + ")";
	}

}
