package com.java;

import java.util.Scanner;

public class ComparisonUc2 {
	public static double lineValues() {
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;

		System.out.println("Enter Values For First Point");
		a = sc.nextDouble();
		c = sc.nextDouble();

		System.out.println("Enter Values For Second Point");
		b = sc.nextDouble();
		d = sc.nextDouble();

		double lineLength = (double) Math.sqrt(Math.pow((b - a), 2) + Math.pow((b - c), 2));
		return lineLength;
	}

	public static void checkEquality(double lineOneLength, double lineTwoLength) {
		if (lineOneLength == lineTwoLength) {
			System.out.println("Lines are Equal");
		} else {
			System.out.println("Lines are not Equal");
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
