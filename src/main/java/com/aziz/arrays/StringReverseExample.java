package com.aziz.arrays;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * Java program to reverse String in Java. There are multiple ways to reverse
 * String in Java, you can either take help of standard Java API StringBuffer to
 * reverse String in Java. StringBuffer has a reverse() method which return
 * StringBuffer with reversed contents. On the other hand you can also reverse
 * it by applying your own logic, if asked to reverse String without using
 * StringBuffer in Java. By the way you can also use StringBuilder to reverse
 * String in Java. StringBuilder is non thread-safe version of StringBuffer and
 * provides similar API. You can use StringBuilder's reverse() method to reverse
 * content and then convert it back to String
 *
 * @author http://java67.blogspot.com
 */
public class StringReverseExample {

	public static void main(String args[]) {

		// quick wasy to reverse String in Java - Use StringBuffer
		String word = "Hello World is a sample";
		String reverse = new StringBuffer(word).reverse().toString();
		System.out.printf(" original : %s ===> : %s  %n", word, reverse);

		// another quick to reverse String in Java - use StringBuilder
		word = "WakeUp is a";
		reverse = new StringBuilder(word).reverse().toString();
		System.out.printf(" original: : %s   ===>: %s %n", word, reverse);

		// one way to reverse String without using StringBuffer or StringBuilder is
		// writing
		// own utility method
		word = "Band is a";
		reverse = reverse(word);
		System.out.printf(" original :   %s  ===> :   %s %n", word, reverse);
		String string = "dfdf dsfdfggggg";
		//String str = Stream.of(string).map(s-> new StringBuffer(s).reverse()).collect(Collectors.joining(","));
		//System.out.println(str);
	}

	public static String reverse(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		}
		String reverse = "";
		for (int i = source.length() - 1; i >= 0; i--) {
			reverse = reverse + source.charAt(i);
		}

		return reverse;
	}

}
