//NO.1152. 단어의 개수
package com.bj07.String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int count = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		System.out.println(count);
	}

}
