package com.bj03.For;
//No.2438
import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		for(int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}