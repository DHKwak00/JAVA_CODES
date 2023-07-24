package edu.java.programmers;

import java.util.Scanner;

public class Solution {

	public static int solution(String myString, String pat) {
		String change1 = myString.toUpperCase();
		String change2 = pat.toUpperCase();
		
		int answer = 0;
		if(change1.contains(change2)) {
			answer = 1;
		} else {
			answer = 0;
		}

		return answer;
	}

	public static void main(String[] args) {
        
		String myString = "aaAA";
		String pat = "aaaaa";

        System.out.println(solution(myString, pat));
	}

}
