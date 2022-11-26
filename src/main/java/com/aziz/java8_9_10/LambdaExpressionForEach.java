package com.aziz.java8_9_10;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;  
public class LambdaExpressionForEach{  
    public static void main(String[] args) {  
          //Foreach Loop
        List<String> list=new ArrayList<String>(); 
        list.add("znkit"); 
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->{
            System.out.println(n);
            }
        );  
        
        
        System.out.println("------------Iterating by passing lambda expression---------------");  
        list.stream().forEachOrdered(games -> System.out.println(games));  
        System.out.println("------------Iterating by passing method reference---------------");  
        list.stream().forEachOrdered(System.out::println);  
        
        Stream.of("AAA","BBB","CCC").parallel().forEach(s->System.out.println("Output:"+s));
        Stream.of("AAA","BBB","CCC").parallel().forEachOrdered(s->System.out.println("Output:"+s));
        //The second line will always output

       // Output:AAA
       // Output:BBB
        //Output:CCC
        //whereas the first one is not guaranted since the order is not kept. forEachOrdered will processes the elements of 
        //the stream in the order specified by its source, regardless of whether the stream is sequential or parallel.
    }  
}  