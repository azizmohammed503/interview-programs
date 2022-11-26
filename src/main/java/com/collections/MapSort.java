package com.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapSort {

	public MapSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> unsortedMap = new HashMap<Integer,String>();
		unsortedMap.put(31, "5");unsortedMap.put(9, "aa");
		unsortedMap.put(76, "6");unsortedMap.put(3, "dfd");
		unsortedMap.put(6, "656");unsortedMap.put(0, "9gfg");
		
		Map<Integer,String> treeMap = new TreeMap<Integer,String>(
			new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o2.compareTo(o1);//sort in descending order
				}
				});
		treeMap.putAll(unsortedMap);
		System.out.println(treeMap);
				
		
        //Alternative way to sort a Map by keys, and put it into the "result" map
        Map< Integer, String> result2 = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, String> comparingByKey().reversed())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

        System.out.println("Sorted...");
        System.out.println(result2);


        Map< Integer, String> result3 = new LinkedHashMap<>();
        unsortedMap.entrySet().stream().sorted(Entry.<Integer, String> comparingByKey() )
        .forEachOrdered(x -> result3.put(x.getKey(), x.getValue()));

        System.out.println(result3);
        
        
        
        
       
        
	}
    
}
