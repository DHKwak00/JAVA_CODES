package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		MyCircle c1 = new MyCircle();
		c1.radius = 1.0;
		System.out.println("반지름 : " + c1.radius);
		System.out.println("면적 : " + c1.calcArea());
		
		MyCircle c2 = new MyCircle(10.0);
		System.out.println("반지름 : " + c2.radius);
		System.out.println("면적 : " + c2.calcArea());

	} // end main()

} // end ClassMain03
