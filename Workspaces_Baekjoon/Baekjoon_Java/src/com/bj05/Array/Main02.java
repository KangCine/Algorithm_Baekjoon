package com.bj05.Array;
//No.2562
import java.util.Arrays;
import java.util.Scanner;

public class Main02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [9];
		int[] tmp = new int [9];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			tmp[i] = num[i];
		}
		Arrays.sort(num);
		System.out.println(num[8]);
		for(int i=0; i < num.length; i++) {
			if(tmp[i] == num[8]) {
				System.out.println(i+1);
			}
		}

	}
}