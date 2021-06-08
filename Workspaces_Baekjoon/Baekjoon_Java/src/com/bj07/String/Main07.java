//NO.2908 상수
package com.bj07.String;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inner = sc.nextLine();
		
		
		int arrIndex = 0;
		char[] ch = new char[inner.length()];

		for(int i = inner.length()-1; i >= 0; i--) {
			ch[i] = inner.charAt(arrIndex);
			arrIndex++;
		};
		
		int numA = Integer.parseInt(""+ch[0]+ch[1]+ch[2]);
		int numB = Integer.parseInt(""+ch[4]+ch[5]+ch[6]);
		
		if(numA > numB) {
			System.out.println(numA);
		} else if(numA < numB) {
			System.out.println(numB);
		}
		
		sc.close();
	}

}
