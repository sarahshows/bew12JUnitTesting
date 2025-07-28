package com.promineotech;

import java.util.Random;

import com.sun.net.httpserver.Authenticator.Result;

public class TestDemo {
	
//checks for positive integer before adding, otherwise throws exception
public  int addPositive(int a, int b) {
	if (a <= 0 || b <= 0) {
		throw new IllegalArgumentException ("Both parameter must be positive!");
		}
		return a + b;
}

//if two integers are greater than zero, the quotient of the will result, otherwise an exception will be thrown
public int multiplyPositive(int c, int d) {
	if (c <= 0 || d <= 0) {
		throw new IllegalArgumentException ("Both parameter must be positive!");
		}
		return c*d;
}
public int randomNumberSquared(int f) {
	int result = getRandomInt();
	f = result;
	return f*f; 
}
int getRandomInt() {

    Random random = new Random();
	return random.nextInt(10) + 1;

}



}