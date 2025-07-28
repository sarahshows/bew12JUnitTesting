package com.promineotech;

public class MultiplyDemo  {

	//checks for positive integers to be multiplied together, otherwise throws exception
	public static int multiplyPositive(int a, int b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException ("Both parameter must be positive!");
			}
			return a * b;
	}
}
