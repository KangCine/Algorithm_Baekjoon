//No.10952
package com.bj04.While;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean end = true;
		
		do{
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				end = false;
			} else {
				System.out.println(num1 + num2);
			}
		}while(end);
		sc.close();
	}
}