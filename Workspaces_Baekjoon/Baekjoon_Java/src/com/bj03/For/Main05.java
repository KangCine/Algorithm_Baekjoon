package com.bj03.For;
//No.2741
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int line = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= line; i++) {
			bw.write(i + "\n");
		}
		bw.close();
		br.close();
	}
}
