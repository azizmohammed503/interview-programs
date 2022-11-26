package com.aziz.java8_9_10;
// importing StringJoiner class  
import java.util.StringJoiner;  
public class StringJoinerExample {  
    public static void main(String[] args) {  
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
        StringJoiner joinNames2 = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter  
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames2.add("Peter");  
        joinNames2.add("Raheem");  
                  
     // Merging two StringJoiner  
        StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println(merge);  
        
        System.out.println(joinNames);  
    }  
}  