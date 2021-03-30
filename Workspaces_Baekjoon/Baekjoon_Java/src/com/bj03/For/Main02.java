//No.10950
package com.bj03.For;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		for(int i = 0; i < line; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}
		sc.close();
	}
}
