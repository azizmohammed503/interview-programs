package com.aziz.arrays;

public class ReverseEachWord {
	static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");
		String reverseString = "";
		for (String word : words) {
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}

			reverseString = reverseString + reverseWord + " ";
		}

		System.out.println(inputString);

		System.out.println(reverseString);

		System.out.println("-------------------------");

		String str1[] = "He is the one".split(" ");
		String finalStr = "";
		for (int i = str1.length - 1; i >= 0; i--) {
			finalStr += str1[i] + " ";
		}
		// System.out.println(finalStr);
	}

	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");

		reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");

		reverseEachWordOfString("I am string not reversed");

		reverseEachWordOfString("Reverse Me");
	}
}