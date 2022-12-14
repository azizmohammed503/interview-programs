package com.multithread;

// Java program to explain the 
// concept of joining a thread. 
import java.io.*; 
  
// Creating thread by creating the 
// objects of that class 
public class ThreadJoining extends Thread 
{ 
    private String string;

	public ThreadJoining(String string) {
    	this.string=string;
	}

	@Override
    public void run() 
    { 
        for (int i = 0; i < 1; i++) 
        { 
            try
            { 
                Thread.sleep(500); 
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName()); 
            } 
  
            catch(Exception ex) 
            { 
                System.out.println("Exception has" + 
                                " been caught" + ex); 
            } 
            System.out.println(string); 
        } 
    } 
} 
  
class GFG 
{ 
    public static void main (String[] args) 
    { 
  
        // creating two threads 
        ThreadJoining t1 = new ThreadJoining("A"); 
        ThreadJoining t2 = new ThreadJoining("B"); 
        ThreadJoining t3 = new ThreadJoining("C"); 
  
        // thread t1 starts 
        t1.start(); 
  
        // starts second thread after when 
        // first thread t1 is died. 
        try
        { 
            System.out.println("Current Thread: "
                  + Thread.currentThread().getName()); 
            t1.join(); 
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has " + 
                                "been caught" + ex); 
        } 
  
        // t2 starts 
        t2.start(); 
  
        // starts t3 after when thread t2 is died. 
        try
        { 
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName()); 
            t2.join(); 
        } 
  
        catch(Exception ex) 
        { 
            System.out.println("Exception has been" + 
                                    " caught" + ex); 
        } 
  
        t3.start(); 
    } 
} 