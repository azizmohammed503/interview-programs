package com.core;

public class FinalConstructor {
	final int x;
	// Final static Constructor not allowd only public protacted priavte
	  FinalConstructor() {
		x=8;
	}
	
	private int y=100;
	public static void m1() {
		//System.out.println(y);
		//System.out.println(x);
	}
	public static void main(String[] args) {
		FinalConstructor finalConstructor = new FinalConstructor();
		finalConstructor.m1();
	}

}
