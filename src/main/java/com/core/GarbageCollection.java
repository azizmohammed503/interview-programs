package com.core;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollection {
	  private static GarbageCollection t1 = new GarbageCollection(); 
	  private static GarbageCollection t2 = new GarbageCollection(); 
          
		 public static void main(String[] args) throws InterruptedException { 
		/*
		 * FinalConstructor finalConstructor = new FinalConstructor();
		 * finalConstructor.m1();
		 */
			
		        // Nullifying the reference variable 
		        t1 = null; 
		          
		        // requesting JVM for running Garbage Collector 
		        //System.gc(); 
		          
		        // Nullifying the reference variable 
		        t2 = null; 
		          
		        // requesting JVM for running Garbage Collector 
		        Runtime.getRuntime().gc(); 
		    } 
		      
		    @Override
		    protected void finalize() throws Throwable 
		    { 
		        //System.out.println("Garbage collector called d"); 
		        System.out.println("Object garbage collected : " + this); 
		    } 
}
