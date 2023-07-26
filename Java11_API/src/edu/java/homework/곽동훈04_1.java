package edu.java.homework;

public class 곽동훈04_1 {

	public static void main(String[] args) {
		String str = "사과:배:바나나:복숭아";
		String[] arr = str.split("\\:");
		StringBuffer buff = new StringBuffer();
		for(int i=0; i<arr.length; i++) {
			buff.append(arr[i]);
		}
		System.out.println(buff);
		

	} // end main()

} // end 곽동훈04_1
