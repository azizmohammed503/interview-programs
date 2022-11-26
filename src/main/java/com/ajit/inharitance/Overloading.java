package com.ajit.inharitance;

public class Overloading {

	public void m1(Object o) {
		System.out.println("Object");
	}

	public void m1(StringBuffer o) {
		System.out.println(" StringBuffer ");
	}

	public void m1(String o) {
		System.out.println("String");
	}

	public void m1(Parant parant) {
		System.out.println("Parant");
	}
	public static void staticMathod(String parant) {
		System.out.println("String staticMathod"+parant);
	}
	public static void staticMathod(Integer parant) {
		System.out.println("Integer staticMathod"+parant);
	}

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		
		overloading.m1("");
		// overloading.m1(null); child will hight paritry
		overloading.m1(new Child());
		overloading.m1(new Object());
		staticMathod(11);
		staticMathod("d");
	}

}
