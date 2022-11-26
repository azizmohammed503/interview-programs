package com.aziz.string;

import java.util.function.Function;
import java.util.stream.IntStream;


public class Reverse {

	public String reverseUsingIntStream(String text) {
		IntStream.range(0, text.length()).forEach(n->System.out.print(text.charAt(text.length()-1 -n)));
		return "";
	}

	public String reverseUsingLoop(String text) {
		String temp = "";
		for (int i = 0; i < text.length(); i++) {
			temp+= text.charAt(text.length() - 1 - i);
		}
		return temp;
	}
	public String reverseUsingReverseLoop(String text) {
		String temp = "";
		for (int i = text.length()-1; i>=0; i--) {
			temp+= text.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		Reverse palandrom = new Reverse();
		String val = palandrom.reverseUsingIntStream("AzizA8");
		System.out.println(val);

		String val1 = palandrom.reverseUsingLoop("AzizA8");
		System.out.println(val1);
		
		String val2 = palandrom.reverseUsingReverseLoop("AzizA8");
		System.out.println(val2);
		String s = "AzizA8";
		String reverse = new StringBuilder(s).reverse().toString();
		System.out.println(reverse);
		
	}


}
