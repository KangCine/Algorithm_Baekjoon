//No.1546
package com.bj05.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		double [] sub = new double [line];
		
		for(int i = 0; i < line; i++) {
			sub[i] = sc.nextInt();
		}
		
		Arrays.sort(sub);
		double sum = 0;
		
		for(int i = 0; i < line; i++) {
			sub[i] = ((double)(sub[i] / sub[line-1]))*100;
			sum += sub[i];
		}
		System.out.println(sum/line);
	}
}
