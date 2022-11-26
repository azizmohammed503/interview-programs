package com.aziz.java8_9_10;
interface Sayable11{    
    // default method    
    default void say(){    
        System.out.println("Hello, this is default method");    
    }  
    default void say1(){    
        System.out.println("Hello, this is default method");    
    }   
    default String say2(){    
        System.out.println("Hello, this is default method");
        return "";
    }   
    // Abstract method    
    void sayMore(String msg);    
    // static method    
    static void sayLouder(String msg){    
        System.out.println(msg);    
    }    
    static void sayLouder1(String msg){    
        System.out.println(msg);    
    }    
    static void sayLouder2(String msg){    
        System.out.println(msg);    
    }    
}    
public class DefaultMethods implements Sayable11{    
    public void sayMore(String msg){     // implementing abstract method    
        System.out.println(msg);    
    }   
   public  String say2(){    
       System.out.println("Hello, this is default method ovvride");
       return "";
   }   
    public static void main(String[] args) {    
        DefaultMethods dm = new DefaultMethods();    
        dm.say();     
        dm.say2();
        // calling default method    
           // calling abstract method 
        Sayable11  sayMore1 = (msg)->{  
            System.out.println("Drawing ");  
        }; 
        sayMore1.sayMore("Work is worship");  
        Sayable11.sayLouder("Helloooo...");   // calling static method    
    }    
}    