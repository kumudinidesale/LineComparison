package com.java;

import java.util.Scanner;

public class ComparisonUc1 {
	public static double lineValues() {
		try (Scanner sc = new Scanner(System.in)) {
			double a, b, c, d;

			System.out.println("Enter Values For First Point");
			a  = sc.nextDouble();
			c  = sc.nextDouble();

			System.out.println("Enter Values For Second Point");
			b  = sc.nextDouble();
			d  = sc.nextDouble();

			double lineLength = (double) Math.sqrt(Math.pow((b - a), 2) + Math.pow((d - c), 2));
			return lineLength;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation ");
		double lineLength = lineValues();
		System.out.println("Length Of Line is: " + lineLength);

	}

}
