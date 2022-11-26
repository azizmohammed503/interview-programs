package com.aziz.java8_9_10;

interface Sayable{    
    // default method    
    default void say(){    
        System.out.println("Hello, this is default method");    
    }    
    // Abstract method    
    void sayMore(String msg);    
    // static method    
    static String sayLouder(String msg){    
        System.out.println(msg);
		return msg+"zxcxzc";    
    }    
}    
public class InterfaceDefaultMethods implements Sayable{    
    public void sayMore(String msg){     // implementing abstract method    
        System.out.println(msg);    
    }    
    public static void main(String[] args) {    
    	InterfaceDefaultMethods dm = new InterfaceDefaultMethods();    
        dm.say();                       // calling default method    
        dm.sayMore("Work is worship");      // calling abstract method    
        Sayable.sayLouder("Helloooo...");   // calling static method    
    }    
}