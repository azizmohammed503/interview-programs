package com.aziz.java8_9_10;



public class Test {

	public static void main(String[] args) {
		for (int i = 0; i < 99; i++) {
			System.out.println(String.format("C%d", i % 10)+ "   param."+ String.format("c%d", i));
		}
	}
	
}
