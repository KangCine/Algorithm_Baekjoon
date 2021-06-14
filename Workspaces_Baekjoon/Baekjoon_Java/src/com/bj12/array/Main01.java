// NO.2750 수 정렬하기
package com.bj12.array;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		int arr [] = new int [line];
		
		int tmp = 0;
		for(int i = 0; i < line; i++) {
			arr[i] = sc.nextInt();
			
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[i]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		for(int i = 0; i < line; i++) {
			System.out.println(arr[i]);
		}
	}

}
