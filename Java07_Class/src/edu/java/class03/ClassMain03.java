package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		
		// 과제 1.
		MyCircle cir1 = new MyCircle();
		cir1.radius = 5.0;
		System.out.println("반지름은 "+ cir1.radius);		
		System.out.println("면적은 " + cir1.rediusArea());
		
		System.out.println();
		
		MyCircle cir2 = new MyCircle(10.0); // 매개변수가 있는 생성자를 사용
		System.out.println("반지름은 "+ cir2.radius);		
		System.out.println("면적은 " + cir2.rediusArea());
		
		
	} //end main()

} // end ClassMain03
