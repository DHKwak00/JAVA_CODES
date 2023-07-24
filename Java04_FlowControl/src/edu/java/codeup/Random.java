package edu.java.codeup;

public class Random {
	
	public static void main(String[] args) {
		String[] students = {
					"강정무", "곽동훈", "김빛찬", "김성훈", "김요한",
					"김홍석", "박진성", "서해용", "안성원", "이동건",
					"전황", "조성하", "조학용"
				};
		
		int index = (int) (Math.random() * 13);
		System.out.println(index);
		System.out.println(students[index]);
		
	}
}







