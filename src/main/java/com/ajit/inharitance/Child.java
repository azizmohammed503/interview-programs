package com.ajit.inharitance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parant {

	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println(" child constructor stub");
	}

	static {
		System.out.println(" child static black");
	}

	{
		System.out.println(" child instance black");
	}

	// int i,String as same then only override
	public void X(String s, int i) {
		System.out.println(" child x method called String s,int i");
	}
	//This instance method cannot override the static method from Parant
    //public void ststicMethod() {
	public static String ststicMethod() {
		System.out.println(" child ststicMethod called");
		return "";
	}

	public void Y() {
		System.out.println(" Child y method called");
	}

	public void childMethod() {
		System.out.println(" child Method called");
	}

	public void m1(Student stu) {
		System.out.println(" Child Student Method called" + stu);
	}

	public void m1() {
		System.out.println("child Method called");
	}

	// child not throwing
	public void Exception() {
		System.out.println(" Child Method called");
	}

	// child throwing checked exp perent should same or parent
	public void ExceptionIO() throws FileNotFoundException {
		// throws Exception CE
		System.out.println(" Child Method called");
	}

	public Child m2() {
		System.out.println("m2 Child Method called");
		return new Child();
	}

}
