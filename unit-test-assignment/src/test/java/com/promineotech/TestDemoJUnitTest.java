package com.promineotech;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestDemoJUnitTest {

	private TestDemo testDemo;
	
	@BeforeEach
	void setUp() throws Exception {
		testDemo = new TestDemo();
		
	
	}



	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException) {
			//Given two positive integers to add
			if(!expectException) {
				assertThat(testDemo.addPositive(a, b)).isEqualTo(expected);
				

			  //If the integer is a zero or negative - throw exception
			} else  {
				assertThatThrownBy(() -> 
					testDemo.addPositive(a, b)).
						isInstanceOf(IllegalArgumentException.class);
				
			}
		
}
				static Stream<Arguments> argumentsForAddPositive() {
					
					// @formatter:off
						return Stream.of(
								arguments(5, 6, 11, false),
								arguments(0, 5, 5, true),
								arguments(5, 0, 5, true),
								arguments(-2, 7, 5, true),
								arguments(2, -7, -5, true)
								);
				}	
				
				@Test
				void assertThatPairsOfPositiveNumbersAreAddedCorrectly (){
					assertThat(testDemo.addPositive(4,5)).isEqualTo(9);

					assertThat(testDemo.addPositive(40,50)).isEqualTo(90);
					
					assertThat(testDemo.addPositive(2,5)).isEqualTo(7);

					assertThat(testDemo.addPositive(240,250)).isEqualTo(490);
				}
				
	
	@ParameterizedTest
	@MethodSource("com.promineotech.TestDemoJUnitTest#argumentsForMultiplyPositve")
	void assertThatPairsOfPositiveNumbersAreMultipliedCorrectly (int c, int d, int expected, boolean expectException) {
		//Given two positive integers to multiply
		if(!expectException) {
			assertThat(testDemo.multiplyPositive(c, d)).isEqualTo(expected);
			

		  //If the integer is a zero or negative - throw exception
		} else  {
			assertThatThrownBy(() -> 
			
				testDemo.multiplyPositive(c, d)).isInstanceOf(IllegalArgumentException.class);
			
			}
	}	
	
	static Stream<Arguments> argumentsForMultiplyPositve() {
		
		// @formatter:off
			return Stream.of(
					arguments(5,6,30,false),
					arguments(0,5,0, true),
					arguments(5,0,0, true),
					arguments(-2,7,-14, true),
					arguments(2,-7, -14, true)
					);
					
		}

	@Test
	void assertThatNumberSquaredIsCorrect (){
		TestDemo mockDemo = spy(testDemo);


		doReturn(5).when(mockDemo).getRandomInt();

		int fiveSquared = mockDemo.randomNumberSquared(5);


		assertThat(fiveSquared).isEqualTo(25);	}
	}



