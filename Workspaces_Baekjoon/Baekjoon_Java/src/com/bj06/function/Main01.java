//No.15596
package com.bj06.function;

import java.util.Scanner;

public class Main01 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		long res = sum(a);

		System.out.println(res);

		sc.close();
	}

	public static long sum(int[] a) {
		
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}
