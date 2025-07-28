package com.promineotech;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplyTestCase {
	@BeforeEach
	void testPairsOfPositive() throws Exception {
		MultiplyDemo multiplyTestDemo = new MultiplyDemo();
				assertEquals(30, MultiplyDemo.multiplyPositive(5, 6), "Quotient of positive integers.");
		}
	
	//checks for positive integers to be multiplied together, otherwise throws exception
		public static int multiplyPositive(int a, int b) {
			if (a <= 0 || b <= 0) {
				throw new IllegalArgumentException ("Both parameter must be positive!");
				}
				return a * b;
		}
		
			
	@Test
	void testMultiplyPositivePairsDoesNotProceeedWithZeroInputs() {
		MultiplyDemo multiplyTestDemo = new MultiplyDemo();
		//Test for IllegalArrgumentExpcetion with 0 or negative number is input
		assertThrows(IllegalArgumentException.class, () -> multiplyTestDemo.multiplyPositive(0, 9), "Should throw IllegalArgumentException for zero input.");
		assertThrows(IllegalArgumentException.class, () -> multiplyTestDemo.multiplyPositive(9, 0), "Should throw IllegalArgumentException for zero input.");
	}
	@Test
	void assertThatTwoNegativesResultInException () {
		MultiplyDemo multiplyTestDemo = new MultiplyDemo();
		//Test that two negative integers will not be added, but an exception will be thrown instead
		assertThrows(IllegalArgumentException.class, () -> multiplyTestDemo.multiplyPositive(4, -9), "Should throw IllegalArgumentException for two negative inputs.");
		assertThrows(IllegalArgumentException.class, () -> multiplyTestDemo.multiplyPositive(-4, 9), "Should throw IllegalArgumentException for two negative inputs.");
		assertThrows(IllegalArgumentException.class, () -> multiplyTestDemo.multiplyPositive(-4, -9), "Should throw IllegalArgumentException for two negative inputs.");
	}
}
