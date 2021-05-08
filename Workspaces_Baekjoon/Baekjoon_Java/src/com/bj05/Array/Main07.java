//No.4344
package com.bj05.Array;

import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		double sum = 0;
		double avg = 0;
		double [] score = null;
		double cnt = 0;
		double res = 0;
		
		for(int i = 0; i < line; i++) {
			int n = sc.nextInt();
			score = new double [n];
			sum = 0;
			cnt = 0;
			res = 0;
			for(int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			avg = (double)(sum / n);
			
			for(int j = 0; j < n; j++) {
				if(score[j] > avg) {
					cnt++;
				}
			}
			res = 100 * cnt / n;
			System.out.printf("%.3f%%\n", res);
			
		}
	}
}
