package com.core;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemClass {

	
	public static void main(String[] args) throws IOException {
		//**************Fields*****************
		//System.out
		System.out.println("println");
		System.out.print("print");
		System.out.println("");
		System.out.format("The '%s' method died at line %d at '%s'.", "methodName", 111, 545);
		System.out.flush();
		System.out.println("");
		
		//System.err
		System.err.println("error");
		
		//System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String input = br.readLine();
		//System.out.print(input);
		
		//**************methods*****************
		//System.currentTimeMillis()
		System.out.println(System.currentTimeMillis());
		
		//System.nanoTime()
				System.out.println(System.nanoTime());
				
				
		int arr1[] = { 0, 1, 2, 3, 4, 5 };
	      int arr2[] = { 0, 10, 20, 30, 40, 50 };
	    
	      // copies an array from the specified source array
	      System.arraycopy(arr1, 0, arr2, 0, 1);
	      System.out.print("array2 = ");
	      System.out.print(arr2[0] + " ");
	      System.out.println(arr2[1] + " ");
	      
	      // it runs the GarbageCollector
		//System.gc()
		System.gc();
		
		//System.set and get
		System.setProperty("key","value");
		System.out.println(System.getProperty("key"));
		
		//System.getenv()
		System.out.println(System.getenv("USERNAME"));
		//System.load
		//System.load("C:\\wamp\\ins.exe");
		
		
		
	
		//System.exit()
		//System.exit(0);
		
		//method should retrun same value if it is void compail time error
		//System.out.println(getEmployee());
		
		
	
		// Java program explaining System class method - arraycopy() 
		int source_arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
	    int dest_arr[] = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105}; 

	    int  sourcePos, destPos, len; 
	    sourcePos = 3; 
	    destPos = 5; 
	    len = 4; 

	    // Print elements of source 
	    System.out.print("source_array : "); 
	    for (int i = 0; i < source_arr.length; i++) 
	        System.out.print(source_arr[i] + " "); 
	    System.out.println(""); 

	    System.out.println("sourcePos : " + sourcePos); 
	     
	    // Print elements of source 
	    System.out.print("dest_array : "); 
	    for (int i = 0; i < dest_arr.length; i++) 
	        System.out.print(dest_arr[i] + " "); 
	    System.out.println("");   System.out.println(""); 
	 
	     
	    System.out.println("destPos : " + destPos); 
	     
	    System.out.println("len : " + len); 
	     
	    // Use of arraycopy() method 
	    System.arraycopy(source_arr, sourcePos, dest_arr,  destPos, len); 
	     
	    // Print elements of destination after 
	    System.out.print("final dest_array : "); 
	    for (int i = 0; i < dest_arr.length; i++) 
	        System.out.print(dest_arr[i] + " "); 
	}

	private static void getEmployee() {
	}
	
	
	

	
}
