/**
 * 
 */
package com.java.projects;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Saurabh Khare
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 * @throws InterruptedException
	 */

	private int num, choice, start, end, length;
	private String str = new String();
	private String[] strArr;
	private Scanner scanner = new Scanner(System.in);

	FizzBuzz() {
		System.out.println("Please make a choice: ");
		System.out.println("=======================");
		System.out.println("1. FizzBuzz Simple");
		System.out.println("2. FizzBuzz String");
		System.out.println("3. FizzBuzz Complex");
		System.out.print("Your Choice? : ");

		try {
			choice = scanner.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Input should be a Number");
			System.exit(0);
		}

	}

	private void getInputFBSim() {
		System.out.print("Enter a number: ");
		try {
			num = scanner.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Input should be a Number");
			System.exit(0);
		}
	}

	private void getInputFBStr() {
		System.out.print("Enter a string: ");
		try {
			str = scanner.next();
			if (str.matches(".*\\d+.*")) {
				throw new InputMismatchException();
			}
		} catch (InputMismatchException exception) {
			System.out.println("Input should be a String");
			System.exit(0);
		}
	}

	private void getInputFBArray() {
		System.out.print("Enter a start number: ");
		try {
			start = scanner.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Input should be a Number");
			System.exit(0);
		}

		System.out.print("Enter an end number: ");
		try {
			end = scanner.nextInt();
		} catch (InputMismatchException exception) {
			System.out.println("Input should be a Number");
			System.exit(0);
		}
	}

	private void fBSimple(int num) {

		if (num > 0) {

			for (int i = 1; i <= num; i++) {

				if ((i % 3) == 0 && (i % 5) == 0) {
					System.out.println("FizzBuzz!");
				} else if ((i % 3) == 0) {
					System.out.println("Fizz!");
				} else if ((i % 5) == 0) {
					System.out.println("Buzz!");
				} else {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Puff! No 0's or -ve values allowed");
		}
	}

	private void fBString(String str) {

		if ((str.charAt(0) == 'f' || str.charAt(0) == 'F')
				&& (str.charAt(str.length() - 1) == 'b' || str.charAt(str.length() - 1) == 'B')) {
			System.out.println("FizzBuzz!");
		} else if (str.charAt(str.length() - 1) == 'b' || str.charAt(str.length() - 1) == 'B') {
			System.out.println("Buzz!");
		} else if (str.charAt(0) == 'f' || str.charAt(0) == 'F') {
			System.out.println("Fizz");
		} else {
			System.out.println(str);
		}
	}

	private void fBArray(int start, int end) {

		if (end >= start) {

			length = end - start;

			strArr = new String[length];

			for (int i = start, j = 0; i <= (end - 1); i++, j++) {

				if ((i % 3) == 0 && (i % 5) == 0) {
					strArr[j] = "\"FizzBuzz!\"";
				} else if ((i % 3) == 0) {
					strArr[j] = "\"Fizz!\"";
				} else if ((i % 5) == 0) {
					strArr[j] = "\"Buzz!\"";
				} else {
					strArr[j] = "\"" + String.valueOf(i) + "!\"";
				}
			}
			str = Arrays.toString(strArr);
			System.out.println(str);
		} else {
			System.out.println("Incorrect input. Difference should be positive.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FizzBuzz fb = new FizzBuzz();

		try {
			switch (fb.choice) {
			case 1:
				fb.getInputFBSim();
				fb.fBSimple(fb.num);
				break;

			case 2:
				fb.getInputFBStr();
				fb.fBString(fb.str);
				break;

			case 3:
				fb.getInputFBArray();
				fb.fBArray(fb.start, fb.end);
				break;

			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 3.");
				break;
			}
		} finally {
			fb.scanner.close();
		}
	}
}
