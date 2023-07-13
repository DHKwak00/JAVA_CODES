package edu.java.for02;

public class ForMain02 {

	public static void main(String[] args) {
		// println() : 맨 마지막 줄바꿈(\n)이 포함된 출력 메소드
		// print() : 문자열을s 나열하여 출력하는 메소드
		
		// 0 2 4 6 8 10
		for(int i=0; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2*0 2*1 2*2 2*3 2*4 2*5
		// 2*(0 1 2 3 4 5)
		for(int i=0; i<=5; i++) {
			System.out.print(2 * i + " ");
		}
		
		for(int i=0; i<=10; i++) {
			if(i % 2 ==0) {
				System.out.println(i + " ");
			}
		}
	}

}
