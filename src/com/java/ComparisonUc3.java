package com.java;

import java.util.Scanner;

public class ComparisonUc3 {
	public static double lineValues() {
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2;

		System.out.println("Enter Values For First Point");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();

		System.out.println("Enter Values For Second Point");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();

		double lineLength = (double) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return lineLength;
	}

	public static void checkEquality(double lineOneLength, double lineTwoLength) {
		if (lineOneLength == lineTwoLength) {
			System.out.println("Lines are Equal");
		} else if (lineOneLength > lineTwoLength) {
			System.out.println("line1 is greater than line2");
		} else {
			System.out.println("Line1 is less than line2");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation ");

		double lineOneLength = lineValues();
		System.out.println("Length Of Line1 is: " + lineOneLength);

		double lineTwoLength = lineValues();
		System.out.println("Length Of Line2 is: " + lineTwoLength);

		checkEquality(lineOneLength, lineTwoLength);
	}
}
