package com.aziz.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
 
public class CombineArraylist 
{
    public static void main(String[] args) throws Exception 
    {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
         
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        listOne.addAll(listTwo);
        
        //1
         
        Set<String> set = new LinkedHashSet<>(listOne);
        set.addAll(listTwo);
        List<String> combinedList = new ArrayList<>(set);
         
        System.out.println(combinedList);
         
        //2
         
        List<String> listTwoCopy = new ArrayList<>(listTwo);
        listTwoCopy.removeAll(listOne);
        listOne.addAll(listTwoCopy);
         
        System.out.println(listOne);
    }
}