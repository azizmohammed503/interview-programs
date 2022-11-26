package com.aziz.java8_9_10;

import java.util.ArrayList;
import java.util.List;
//we can extend interface having same method or empty
@FunctionalInterface  
interface Doable{  
	void say(String msg); 
    default void doIt(){  
    	List arr= new ArrayList();
        System.out.println("default Doable Do it now");  
    }  
    @Override
    int hashCode();
    @Override
    String toString();
  
}  
@FunctionalInterface  
interface SayableInfo extends Doable{  
    void say(String msg);   // abstract method  
    default void doIt(){  
        System.out.println("default SayableInfo Do it now");  
    }  
    @Override
    int hashCode();
    @Override
    String toString();
}  
public class FunctionalInterfaceExample3 implements SayableInfo{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}  