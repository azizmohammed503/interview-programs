package com.core;

import java.util.stream.IntStream;

public class Palandrom {
	public boolean isPalindromeUsingIntStream(String text) {

		return IntStream.range(0, text.length()).noneMatch(i -> text.charAt(i) != text.charAt(text.length() - i - 1));
	}

	public boolean isPalindrome(String text) {
		for (int i = 0; i < text.length(); i++) {
			//System.out.print(text.charAt(text.length() - 1 - i));
			if (text.charAt(text.length() - 1 - i) != text.charAt(i)) {
				return false;
			}

		}
		return true;
	}
	public boolean isPalindromeReverseLoop(String text) {
		String temp = "";
		for (int i = text.length()-1; i>=0; i++) {
			temp+= text.charAt(i);
		}
		if (temp != text) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Palandrom palandrom = new Palandrom();
		boolean val = palandrom.isPalindromeUsingIntStream("nitin");
		System.out.println(val);

		boolean val1 = palandrom.isPalindrome("nitin");
		System.out.println(val1);
		
		String text = "nitin";
		boolean va = IntStream.range(0, text.length()).allMatch(i->text.charAt(text.length()-1-i)==text.charAt(i));
		System.out.println(va);
	}

}
