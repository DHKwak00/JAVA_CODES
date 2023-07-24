package edu.java.array01;

import java.util.Scanner;

public class Test {
    public static int[] solution(int[] numbers, String direction) {
    	int n = numbers.length;
        int[] answer = new int[n];
        int value = 0;
        if(direction.equals("right")) {
        	value = n - 1;
        } else {
        	value = 1;
        }
        
    	for(int i = 0; i < n; i++) {
    		answer[i] = numbers[(value + i) % n];
    	}
        	
        return answer;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			numbers[i] = k;
		}
		
		String direction = sc.next();
		
		solution(numbers, direction);

	}

}




