package com.serialization;

// Java program to demonstrate  
// that if superclass is 
// serializable then subclass  
// is automatically serializable 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//https://www.geeksforgeeks.org/object-serialization-inheritance-java/
// superclass A  
// implementing Serializable interface 
class A implements Serializable {
	// any changes on obj after Serializition differnt serialVersionUID genrete jvm
	// so we ...
	final static long serialVersionUID = 35343356L;
	int i;
	// parameterized constructor
	public A(int i) {
		this.i = i;
	}

}

// subclass B  
// B class doesn't implement Serializable 
// interface. 
class B extends A implements Serializable {
	final static long serialVersionUID = 353456L;

	int j;
	String name;
	String newname;

	// parameterized constructor
	public B(int i, int j, String str, String newname) {
		super(i);
		this.j = j;
		this.name = str;
		this.newname = newname;
	}
}

// Driver class 
public class Test {
	public static void main(String[] args) throws Exception {
		B b1 = new B(10, 20, new String("aziz"), "Mohammed");

		System.out.println("i = " + b1.i);
		System.out.println("j = " + b1.j);
		System.out.println("name = " + b1.name);

		// Serializing B's(subclass) object

		// Saving of object in a file
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Method for serialization of B's class object
		oos.writeObject(b1);

		// closing streams
		oos.close();
		fos.close();

		System.out.println("Object has been serialized");

		/* De-Serializing B's(subclass) object */

		// Reading the object from a file
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Method for de-serialization of B's class object
		B b2 = (B) ois.readObject();

		// closing streams
		ois.close();
		fis.close();

		System.out.println("Object has been deserialized");

		System.out.println("i = " + b2.i);
		System.out.println("j = " + b2.j);
		System.out.println("name = " + b2.name);
		System.out.println("name = " + b2.newname);
	}
}