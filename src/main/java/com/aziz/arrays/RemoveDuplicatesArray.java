package com.aziz.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {
		/* approch1 */
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		ArrayList<Integer> list1 = new ArrayList<>();
		for(Integer val: list) {
			if(!list1.contains(val)) {
				list1.add(val);
			}
		}
		//System.out.println(list1);
		
		/* approch 2*/
		Set<Integer> set = new LinkedHashSet<>(list);
		//Set<Integer> set = new LinkedHashSet<>();
		//set.addAll(list);
		System.out.println(set);
		
		/* approch 3*/
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
	}

}
