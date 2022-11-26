
package com.core;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
	// given number only dived by same number and 1
	public static List<Integer> primeNumbersBruteForce(int n) {
		List<Integer> primeNumbers = new LinkedList<>();
		for (int i = 2; i < n; i++) {
			if (isPrimeBruteForce(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static boolean isPrimeBruteForce(int number) {
		for (int i = 2; i < number; i++) { 
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> primeNumbersTill(int n) {
		IntStream.rangeClosed(2, 100).filter(n1 -> isPrimeBruteForce(n)).boxed().collect(Collectors.toList());
		return IntStream.rangeClosed(2, n).filter(x -> isPrimeBruteForce(x)).boxed().collect(Collectors.toList());
	}

	/*
	 * private static boolean isPrime(int number) { return IntStream.rangeClosed(3,
	 * (int) (Math.sqrt(number))).allMatch(n -> n % n != 0); }
	 */
	public static void main(String[] args) {
		List<Integer> list = primeNumbersBruteForce(100);
		System.out.println(list);

		List<Integer> list1 = primeNumbersTill(100);
		System.out.println(list1);
	}
//https://www.geeksforgeeks.org/prime-numbers/
}
