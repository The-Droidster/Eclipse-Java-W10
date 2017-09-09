package com.java.projects;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration
		String str = new String();
		char[] in;
		char temp;
		int n;
		Scanner scn = new Scanner(System.in);
		// Input
		System.out.print("Enter a String: ");
		str = scn.next();
		in = str.toCharArray();
		n = in.length;
		// Processing
		for (int i = 0; i < in.length / 2; i++, n--) {
			temp = in[i];
			in[i] = in[n - 1];
			in[n - 1] = temp;
		}
		// Output
		str = new String(in);
		System.out.println("Reverse String: " + str);
		// Clean-up
		scn.close();
	}

}
