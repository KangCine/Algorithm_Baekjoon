package com.bj02.If;
//No.2884
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if( min-45 >= 0) {
			min = min - 45;
		} else if( min-45 < 0) {
			hour = hour - 1;
			min = min + 15;
		}
		
		if( hour == -1) {
			hour = 23;
		}
		System.out.println(hour + " " + min);
		
		sc.close();
	}
}

