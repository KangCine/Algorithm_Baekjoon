package com.bj03.For;
//No.8393
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}
}
