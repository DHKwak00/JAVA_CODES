package edu.java.programmers;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;
		int[] answer = {};
		answer = new int[arr.length];
        if(k % 2 == 1){
            for(int i=0; i<arr.length; i++){
                answer[i] = arr[i]*k;
            }
        }else {
            for(int i=0; i<arr.length; i++){
                answer[i] = arr[i]+k;
            }
        }
        System.out.println(Arrays.toString(answer));
        
	} //end main()

}
