//No.4673
package com.bj06.function;

public class Main02 {
	
	private static int maxNum = 10000;
	
	public static void main(String[] args) {
		
		String num = null;
		int [] notSelfNum = new int [maxNum];
		int d = 0;
		int sum = 0;
		
		for(int i = 0; i < maxNum; i++) {
			notSelfNum[i] = i + 1;
		}
		
		for(int i = 0; i < maxNum; i++) {
			
			num = i + 1 + "";
			
			String [] s = num.split("");
			
			d = 0;
			sum = 0;
			
			for(int j = 0; j < s.length; j++) {
				d += Integer.parseInt(s[j]);
			}
			sum = d + i + 1;
			
			for(int j = 0; j < maxNum; j++) {
				
				if(sum == notSelfNum[j]) {
					notSelfNum[j] = 0;
				}
			}
			
			if(notSelfNum[i] != 0) {
				System.out.println(notSelfNum[i]);
			}
		}
	}
}
