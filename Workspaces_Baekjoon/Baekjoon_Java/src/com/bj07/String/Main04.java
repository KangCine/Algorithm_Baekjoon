//NO.2675
package com.bj07.String;

import java.util.Scanner;

public class Main04 {
	
	public static void main(String[] args) {
	 	Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		
		for(int i = 0; i < S; i++) {
			int R = sc.nextInt();
			String P = sc.next();
			
			for(int j = 0; j < P.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(P.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
