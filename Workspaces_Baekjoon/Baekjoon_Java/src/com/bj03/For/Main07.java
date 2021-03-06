//No.11021
package com.bj03.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main07 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int line = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i <= line; i++) {
			st = new StringTokenizer(br.readLine());
			bw.write("Case #"+i+": ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		bw.close();
		br.close();
	}
}
