// NO.2941 크로아티아 알파벳
package com.bj07.String;

import java.util.Scanner;

public class Main09 {
	public static void main(String[] args) {
		
		// c= c- dz= d- lj nj s= z=
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.replace("c=", "0");
		str = str.replace("c-", "0");
		str = str.replace("dz=", "0");
		str = str.replace("d-", "0");
		str = str.replace("lj", "0");
		str = str.replace("nj", "0");
		str = str.replace("s=", "0");
		str = str.replace("z=", "0");
		
		String [] s = str.split("");
		
		System.out.println(s.length);
		
		/*
		
		처음에 풀었던 방식... 풀고도 왜틀렸는지 한참 고민함
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String [] s = str.split(""); 
		
		int res = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("c") || s[i].equals("s") || s[i].equals("z") && s[i+1].equals("=")) {
				res++;
			}else if(s[i].equals("d") && s[i+1].equals("z") && s[i+2].equals("=")) {
				res++;
			}else if(s[i].equals("c") || s[i].equals("d") && s[i+1].equals("-")) {
				res++;
			}else if(s[i].equals("l") || s[i].equals("n") && s[i+1].equals("j")) {
				res++;
			}
		}
		System.out.println(s.length - res);
		*/
	}
}
