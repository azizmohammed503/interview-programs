package com.aziz.string;

import java.util.Collections;

public class StringRecursiveReversal {
 
    String reverse = "";
     
    public String reverseString(String str){
        if(str.length() == 0){
            return str;
        } else {
            reverse += str.charAt(str.length()-1);
            reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("Java 2 novice"));
        
       /* StringBuilder*/
        String input = "Geeks for Geeks";
        StringBuilder input1 = new StringBuilder(input);
        //input1.append(input);
        input1.reverse();
        System.out.println(input1);
        
        StringBuffer sbr = new StringBuffer(input);
        System.out.println(sbr.reverse());
      
        
        char[] try1 = input.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }
    
        for (int i = 0;  i <= try1.length; i++) {
        //System.out.print(i);
        }
    }
}