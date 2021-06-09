// NO.5622 다이얼
package com.bj07.String;

import java.util.Scanner;

public class Main08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String [] strArr = str.split("");
		
		int res = 0;
		
		for(int i = 0; i < strArr.length; i++) {
			switch(strArr[i]) {
			case "A": case "C": case "B":
				strArr[i] = 2 + "";
			break;
			case "D": case "E": case "F":
				strArr[i] = 3 + "";
			break;
			case "G": case "H": case "I":
				strArr[i] = 4 + "";
			break;
			case "J": case "K": case "L":
				strArr[i] = 5 + "";
			break;
			case "M": case "N": case "O":
				strArr[i] = 6 + "";
			break;
			case "P": case "Q": case "R": case "S":
				strArr[i] = 7 + "";
			break;
			case "T": case "U": case "V":
				strArr[i] = 8 + "";
			break;
			case "W": case "X": case "Y": case "Z": 
				strArr[i] = 9 + "";
			break;
			}
		}
		
		for(int i = 0; i < strArr.length; i++) {
			res += Integer.parseInt(strArr[i]) + 1;
		}
		
		System.out.println(res);
	}

}
