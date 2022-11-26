package com.aziz.arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionHandilningInCatch {

	public CheckedExceptionHandilningInCatch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)throws IOException {
	
		//throws IOException 
		
		/*try{
			
		}catch(FileNotFoundException n){//SQLException IOException ClassNotFoundException FileNotFoundException
			
		}*/
        try{
			BufferedReader bufferedReader = new BufferedReader( new FileReader(new File("")));
		}catch(FileNotFoundException e){//IOException jh
			
		}catch(IOException jh){
			
		}
        
        //Throwable
        try{
        	Integer[] array = new Integer[100000 * 100000];
        	System.out.println(array);
		}catch(Exception e){//IOException jh
			System.out.println("Exception"+e.getMessage());
		}catch(Throwable t){
			System.out.println("Throwable"+t.toString());
		}
        
        System.out.println("end of the file");
        System.out.println(new CheckedExceptionHandilningInCatch().m1());
	}
	
	public String m1() {
		 try{
	        	
			int s = 10/10;
			return "try";
			}catch(ArithmeticException t){
				return "catch";
			}finally {
				return "final";
			}
		//return null;
		
	}

}
