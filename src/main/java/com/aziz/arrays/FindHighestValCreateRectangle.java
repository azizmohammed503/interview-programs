package com.aziz.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.sun.xml.internal.stream.Entity;

public class FindHighestValCreateRectangle {

	public static void main(String[] args) {
		Map<Integer ,Integer> treeMap1 = new LinkedHashMap<>();
		//NavigableMap<Integer ,Integer> treeMap1 =new TreeMap<>();
		//treeMap1 = treeMap1.descendingMap();
		Integer[] arr1 = {6,8,1,6,7,3,0,6,1,1,9,1};
	    Arrays.sort(arr1, (p1,p2)->p2.compareTo(p1));
	    for(Integer i:arr1) {
	    	System.out.print(i);
	    	if(treeMap1.containsKey(i)) {
	    		treeMap1.put(i, treeMap1.get(i)+1);
	    	}else {
	    		treeMap1.put(i, 1);
	    	}
	    }
	    /*for(Integer key :treeMap1.keySet()) {
	    	 if(treeMap1.get(key)>=2) {
	    		    System.out.println(key +" "+ treeMap1.get(key));
	    	}
	    }*/
	    LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
	    
         treeMap1.entrySet().stream().sorted(Map.Entry.comparingByValue((p,p1)->p1.compareTo(p))).filter(n -> n.getValue() >= 2).
         forEachOrdered(n->{
        	 reverseSortedMap.put(n.getKey(), n.getValue());
         System.out.println(n.getKey()+" "+n.getValue());
         });
	    System.out.println(reverseSortedMap);
         
	}

}
