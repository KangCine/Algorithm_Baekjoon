//No.10818
package com.bj05.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int line = sc.nextInt();
        
        int[] num = new int [line];
        
        for(int i = 0; i < num.length; i++) {
        	num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[0] + " " + num[line-1]);
    }
}