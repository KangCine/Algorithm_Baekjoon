//NO.1157 단어 공부
package com.bj07.String;

import java.util.Arrays;
import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] count = new int ['z'-'a'+1];
		int [] tmp = new int ['z'-'a'+1];
		char [] alpha = new char ['z'-'a'+1];
		
		int max = 0;
		int maxIndex = 0;
		
		String str = sc.nextLine().toUpperCase();
		String [] strarr = str.split("");
		
		for(int i = 0; i < str.length(); i++) {
			count[strarr[i].charAt(0) - 'A']++;
			tmp[strarr[i].charAt(0) - 'A']++;
		}
		
		for(int i = 0; i < tmp.length; i++) {
			if(tmp[i] > max) {
				max = tmp[i];
				maxIndex = i;
			}
		}

		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = (char)(i+'A');
		}
		
		Arrays.sort(count);
		
		if(count['Z'-'A'] == count['Z'-'A'-1]) {
			System.out.println("?");
		} else {
			System.out.println(alpha[maxIndex]);
		}
	}
}