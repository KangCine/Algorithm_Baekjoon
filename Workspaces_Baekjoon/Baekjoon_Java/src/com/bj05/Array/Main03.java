//No.2577
package com.bj05.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		
		int res = num1 * num2 * num3;
		
		int cnt = 0;
		
		String resarr = "" + res;
		String [] arr2 = {"0","1", "2", "3", "4", "5", "6","7","8","9"};
		
		String[] arr = resarr.split("");
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < arr.length; j++ ) {
				if(arr2[i].equals(arr[j])) {
					cnt++;
				}
			}
			System.out.println(cnt);
			cnt = 0;
		}
		br.close();
	}
}