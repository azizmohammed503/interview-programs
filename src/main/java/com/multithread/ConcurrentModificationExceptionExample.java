package com.multithread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExceptionExample {

	public static void main(String args[]) {
		//List<String> myList = new ArrayList<String>();
		/*List<String> myList = new CopyOnWriteArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");
		
		for(String s :myList) {
			System.out.println(s);
			myList.add(s);
			myList.remove(s);
		}

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			//System.out.println("List Value:" + value);
			if (value.equals("5"))
			it.remove();
		}
		//System.out.println("List :" + myList);*/


	    //Map<String, String> myMap = new HashMap<String, String>();
	    Map<String, String> myMap = new ConcurrentHashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				//myMap.put("1", "4"); while updateing not have ConcurrentModificationException
				myMap.put("4", "4");
			}
		}
		
		//Use for loop to avoid java.util.ConcurrentModificationException
		List<String> myList1 = new ArrayList<String>();
		myList1.add("1");
		myList1.add("2");
		myList1.add("3");
		myList1.add("4");
		myList1.add("5");
		for(int i = 0; i<myList1.size(); i++){
			
			if(myList1.get(i).equals("3")){
				myList1.remove(i);
				//i--;
				myList1.add("6");
				myList1.add("7");
			}
			
		}
		System.out.println(myList1);
		
	}
}