package com.ajit.inharitance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Parant {

	public Parant() {
		System.out.println(" Parant constructor stub");
	}
	
	static{
		System.out.println(" Parant static black");
	}
	
	{
		System.out.println(" Parant instance black");
	}

	public void X(String s,int i){
		System.out.println("Parant x method called String s,int i");
	}
	public static String ststicMethod() {
		   System.out.println(" parent ststicMethod called");
			return "";
	}
	
   public void K(){
	   System.out.println(" Parant k method called");
	}
   
   public void Y(){
	   System.out.println(" Parant Y method called");
	}
   
   public void parentMethod(){
	   System.out.println(" parent Method called");
	}
   
    public void m1(Parson pa){
	   System.out.println("Parent parson method called"+pa);
	}
   public void m1(){
	   System.out.println(" parent Method called");
	}
   
   public void Exception() throws Exception{
	   System.out.println(" parent Method called");
	}
   
   //child thrwing FileNotFoundException so Parent should be same or Parent
   public void ExceptionIO() throws IOException{//Exception
	   System.out.println(" parent Method called");
	}
   public Parant m2() {
		return new Parant();
	}

   
}
