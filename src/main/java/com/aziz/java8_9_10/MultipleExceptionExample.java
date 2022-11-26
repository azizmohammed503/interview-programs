package com.aziz.java8_9_10;
public class MultipleExceptionExample{    
    public static void main(String args[]){    
        try{    
            int array[] = new int[10];    
            array[10] = 30/0;    
        }    
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){  
            System.out.println(e.getMessage());  
        }    
        // catch(ArithmeticException | ArrayIndexOutOfBoundsException | Exception  e){  
        //So here, in case when your are catching multiple exceptions, follow the rule of generalized to more specialized. It means that, if you are using super (general) class, don't use child (specialized) class.


     }    
}  