package com.aziz.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {

	public static void main(String[] args) throws Exception {
		List<String> listOne = new ArrayList<>(Arrays.asList("a", "z", "c", "d", "b"));
		List<String> listTwo = new ArrayList<>(Arrays.asList("z", "p", "c", "f", "m"));
		listOne.addAll(listTwo);
		
		  //listOne.sort(Comparator.comparing(s -> s));
		  //listOne.sort(Comparator.reverseOrder());
		 // System.out.println(listOne);
		 

		// listOne.sort((p1, p2) -> p1.compareTo(p2));
		// System.out.println(listOne);

		// listOne.sort((p1, p2) -> p2.compareTo(p1));
		// System.out.println(listOne);

		/*
		 * Collections.sort method is sorting the elements of ArrayList in ascending
		 */
		//Collections.sort(listOne, (p1, p2) -> p2.compareTo(p1));
		//System.out.println(listOne);

		List<String> result = listOne.stream().sorted(Comparator.comparing((n->n))).collect(Collectors.toList());
		List<String> result1 = listOne.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		List<String> result2 = listOne.stream().sorted((p1,p2)->p2.compareTo(p1)).collect(Collectors.toList());
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		

		
		List<String> result5 =listOne.stream().sorted((p1,p2)->p2.compareTo(p1)).collect(Collectors.toList());
		System.out.println(result5);
		
	}
}
