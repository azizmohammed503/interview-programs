package com.core;
// class shoud have only one public that is a frist class 
//not only 2 or 3 etc class public compail time error
  class A {
	A() {
		System.out.println("A class con");
	}

	{
		System.out.println("A class intance");

	}
	static {
		System.out.println("A class static");

	}
}
//public class B extends A { complil time error
   class B extends A {
	B() {
		System.out.println("B class con");
	}

	{
		System.out.println("B class intance");

	}
	static {
		System.out.println("B class static");

	}

	public static void main(String[] arr) {
		B b = new B();
	}
}

   class C {
		C() {
			System.out.println("A class con");
		}

		{
			System.out.println("A class intance");

		}
		static {
			System.out.println("A class static");

		}
	}