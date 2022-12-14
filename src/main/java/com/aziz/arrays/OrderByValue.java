package com.aziz.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderByValue {
 
    public static void main(String a[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            //System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
        
        map.entrySet().stream().sorted(Map.Entry.comparingByValue((p1,p2)->p2.compareTo(p1))).forEach(n->System.out.println(n.getKey()+" "+n.getValue()));
        
        
        
        
        
        
        
        
        Map ma =map.entrySet().stream().sorted(Map.Entry.comparingByValue((p1,p2)->p2.compareTo(p1))).collect(Collectors.toMap(n->n.getKey(),n->n.getValue()));
        System.out.println(ma);
        
        
        
        
        
        
        
        
        
        
    }
}