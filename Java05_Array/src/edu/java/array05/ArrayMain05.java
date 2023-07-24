package edu.java.array05;

public class ArrayMain05 {

	public static void main(String[] args) {
		System.out.println("배열 연습1");
		
		// 'a' ~ 'z' 까지 저장 및 출력
		char[] alphas = new char['z' - 'a' + 1];
		System.out.println(alphas.length);
		
		// for문을 사용하여 배열에 'a' ~ 'z'까지 저장
		for(int i = 0; i < alphas.length; i++) {
			alphas[i] = (char) ('a' + i);
		}
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			alphas[ch - 'a'] = ch;
		}
		
		for(char ch : alphas) {
			System.out.print(ch + " ");
		}
		

	} // end main()

} // end ArrayMain05



