//No.9498
package com.bj02.If;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		if(A >= 90 && A <= 100) {
			System.out.println("A");
		}else if(A >= 80 && A < 90) {
			System.out.println("B");
		}else if(A >= 70 && A < 80) {
			System.out.println("C");
		}else if(A >= 60 && A < 70) {
			System.out.println("D");
		}else if(A >= 0 && A < 60){
			System.out.println("F");
		}else{
            System.out.println("������ 0������ 100������ �Դϴ�.");
        }
		sc.close();
	}
}
