package com.aziz.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		mylist.add("practice");
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");

		System.out.println("Original List : " + mylist);
		// Here we are using reverse() method
		// to reverse the element order of mylist
		//Collections.reverse(mylist);
		System.out.println("Modified List: " + mylist);

		
		int length = mylist.size();
	    ArrayList result = new ArrayList(length);
	    for (int i = length - 1; i >= 0; i--) {
	        result.add(mylist.get(i));
	    }
	    System.out.println(result);
	    
		
		Integer arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("Original Array : " + Arrays.toString(arr));
		// Please refer below post for details of asList()
		// https://www.geeksforgeeks.org/array-class-in-java/
		//Collections.reverse(Arrays.asList(arr));
		System.out.println("Modified Array : " + Arrays.toString(arr));
		
		
		/* Java 8 */

        List<String> descendingList = mylist.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
       System.out.println(descendingList);

	}

}
