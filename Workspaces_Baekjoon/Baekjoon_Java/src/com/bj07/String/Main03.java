//NO.10809
package com.bj07.String;

import java.util.Scanner;

public class Main03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int []tmp = new int['z'-'a'+1];
		
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = -1;
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			char s = str.charAt(i);
			
			if(tmp[s-'a'] == -1) {
				tmp[s-'a'] = i;
			}
		}
		
		for(int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + " ");
		}

		sc.close();
	}
	
}
