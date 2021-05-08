//No.8958
package com.bj05.Array;

import java.util.Scanner;

public class Main06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		String [] quiz = new String [line];
		
		String arr [];
		
		int cnt = 0;
		int sum = 0;
		
		for(int i = 0; i < line; i++) {
			quiz[i] = sc.next();
			
			arr = quiz[i].split("");
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].equals("O")) {
					cnt++;
				} else if(arr[j].equals("X")) {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
			sum = 0;
			cnt = 0;
		}

	}
	

}
