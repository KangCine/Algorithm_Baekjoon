//No.1065
package com.bj06.function;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int line = sc.nextInt();
		int cnt = 0;

		int dif1 = 0;
		int dif2 = 0;

		for (int i = 1; i <= line; i++) {

			String num = i + "";

			String[] s = num.split("");

			if (s.length == 1 || s.length == 2) {
				cnt++;
			} else if (s.length == 3) {

				int tmp[] = new int[s.length];

				for (int j = 0; j < s.length; j++) {
					tmp[j] = Integer.parseInt(s[j]);
				}

				dif1 = tmp[2] - tmp[1];
				dif2 = tmp[1] - tmp[0];

				if (dif1 == dif2) {
					cnt++;
				}

			}

		}
		System.out.println(cnt);

	}

}
