//No.10871
package com.bj03.For;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();;
		int[] j;
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			j = new int[N];
			j[i] = num;
			if(j[i] < X) {
				System.out.print(j[i] + " ");
			}
		}
		sc.close();	
	}
}
