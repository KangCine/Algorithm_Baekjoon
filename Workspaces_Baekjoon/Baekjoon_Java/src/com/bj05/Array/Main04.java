package com.bj05.Array;
//No.3052
import java.util.Scanner;

public class Main04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [10];
		int[] div = new int [42];
		
		
		int cnt = 0;
		
		for(int i = 0; i < num.length; i++ ) {
			num[i] = sc.nextInt();
			
			int tmp = num[i] % 42;
			
			for(int j = 0; j < div.length; j++) {
				if(div[tmp] == 0) {
					cnt++;
					div[tmp] = -1;
				}
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
