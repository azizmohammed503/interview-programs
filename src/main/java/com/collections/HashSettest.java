package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
interface MySet<T>{
	boolean add (T i);
}
public class HashSettest<T> implements MySet<T>{
	Map<T,T> map = new HashMap<>();
	
	public boolean add(T obj) {
		Object obj1 = map.put(obj, (T) "PRESENT1");
		//System.out.println(obj1);
		if(obj1==null) {
			return true;
		}
		//map.put((T) obj, (T) obj1);
		return false;
	}
	@Override
	public String toString() {
		return  map.keySet().toString();
	}
     
	public static void main(String[] args) {
	
	/* HashSet hs = new HashSet(); 
     HashMap map = new HashMap();
     Object obj= map.put("key", "value");
     System.out.println("obj = "+obj);
     Object obj1= map.put("key", "value7");
     System.out.println("obj1 = "+obj1);
     
     // adding elements to hashset 
     // using add() method 
     boolean b1 = hs.add("Geeks"); 
     boolean b2 = hs.add("GeeksforGeeks"); 
       
     // adding duplicate element 
     boolean b3 = hs.add("Geeks"); 
       
     // printing b1, b2, b3 
     System.out.println("b1 = "+b1); 
     System.out.println("b2 = "+b2); 
     System.out.println("b3 = "+b3); 
       
     // printing all elements of hashset 
     System.out.println(hs); */
     
     
     MySet<String>  hashSettest = new  HashSettest<>();
     System.out.println(hashSettest.add("Aziz"));
     System.out.println(hashSettest); 
     
     System.out.println(hashSettest.add("Aziz"));
     System.out.println(hashSettest.add("sdfgdsgfsg"));
     System.out.println(hashSettest); 
     
     HashSettest<Integer>  hashSettest1 = new  HashSettest<>();
    // System.out.println(hashSettest.add(34));
     System.out.println(hashSettest); 
   
     Map<String,String> map = new HashMap<>();
       System.out.println(map.put("1", "11"));
       System.out.println(map.put("1", "22"));
	}

}
