package com.ajit.inharitance;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//all parant and overrriden child methods will avilable
		Parant pc = new Child();
		System.out.println("-----------Parant pc = new Child()----------------");
		pc.X("str",899); //overrrid
        pc.ststicMethod();// static method parant method will call
		pc.K();
	    pc.Y(); //overid
		pc.parentMethod();
		//pc.childSepic(); //chiled spific method not avalable
	    System.out.println(pc.m2());//overrrid
		//In overriding parant type is parity and overloadding child type is parity
		pc.m1(new Parson()); //parant method 
		pc.m1(new Student());//parant method becose student extend Parson
		pc.m1();//overrrid

		try {
			pc.Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//pc.ExceptionIO();
		
		System.out.println("");
		Parant p = new Parant();
		System.out.println("-------------Parant p = new Parant();--------------");
		p.X("", 9);
		p.K();
		p.Y();
		p.parentMethod();
		
		
		
		//all parent and child menthods are avilable also parent&client object also craete
		  System.out.println("");
		Child c = new Child();
		System.out.println("-------------Child c = new Child();--------------");
		c.X("", 0);
		c.Y();
		c.K();//parnt
		c.parentMethod();//parnt
		c.childMethod();// child
		

	}

}
