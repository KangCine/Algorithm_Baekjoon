//No.14681
package com.bj02.If;

import java.util.Scanner;

public class Main04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int res = 0;
		
		if( (num1 > 0) && (num2 > 0) ) {
			res = 1;
		} else if( (num1 < 0) && (num2 > 0) ) {
			res = 2;
		} else if ( (num1 < 0) && (num2 < 0) ) {
			res = 3;
		} else if ( (num1 > 0) && (num2 < 0) ) {
			res = 4;
		}
		System.out.println(res);
		
		
		sc.close();
	}
}

