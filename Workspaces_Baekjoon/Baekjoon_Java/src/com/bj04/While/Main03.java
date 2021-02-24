package com.bj04.While;
//No.1110
import java.util.Scanner;

public class Main03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int num1 = 0;			// �����ڸ� ����
		int num2 = 0;			// �����ڸ� ����
		
		int cnt = 0;			// ����Ŭ
		int res = num;			//���� �Է¼��� �����ϴ� ����
		int tmp = 0;			// �����ڸ� + �����ڸ�
		
		do {
			
			num1 = num / 10;
			num2 = num % 10;
			
			tmp = num1 + num2;
			
			if(tmp>=10) {
				tmp = tmp % 10;
			}
			
			num = (num2 * 10) + tmp;
			cnt++;
		}while(num != res);
		
		System.out.println(cnt);
	}

}