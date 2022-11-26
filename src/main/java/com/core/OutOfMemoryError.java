package com.core;

import java.util.ArrayList;
import java.util.List;




public class OutOfMemoryError {

	static List<String> list = new ArrayList<String>();
	 // static ClassPool classPool = ClassPool.getDefault(); 
	  
	public static void main(String args[]) throws Exception {
		
		 //Integer[] array = new Integer[100000 * 100000];
		 //System.out.println(array);
		 //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space at
		 // com.core.OutOfMemoryError.main(OutOfMemoryError.java:12)
		 

		/*Map m = new HashMap();
		m = System.getProperties();
		Random r = new Random();
		while (true) {
			m.put(r.nextInt(), "randomValue");
		}*/
		
		
		 for (int i = 0; i < 1000000000; i++) { 
	           // Class c = classPool.makeClass("com.saket.demo.Permgen" + i).toClass(); 
			 FinalConstructor space= new FinalConstructor();
	            System.out.println(Runtime.getRuntime().freeMemory()); 
	        } 
	}
	class Space{
		
	}

}
