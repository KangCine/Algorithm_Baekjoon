//No.10951
package com.bj04.While;

import java.util.Scanner;

public class Main02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
		
		sc.close();
		
	}
}
