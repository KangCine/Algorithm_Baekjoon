//No.2753
package com.bj02.If;

import java.util.Scanner;

public class Main03 {
	
	public static void main(String[] args) {
		
		/*
		 
		 ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		 
		 */
		
		Scanner sc = new Scanner(System.in);
			
		int year = sc.nextInt();
		int res = 0;
		
		if( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ) {
			res = 1;
		}
		
		System.out.println(res);
		
		
		sc.close();
	}
}
